package control;

import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;
import sw.Transaccion;
import sw.Usuario;
import sw.VistaLoginMethods;
import sw.VistaLoginMethods_Service;
import vista.JFrame;

/**
 *
 * @author angel
 */
public class Controlador {

    private JFrame interfaz;

    private VistaLoginMethods_Service servicio = new VistaLoginMethods_Service();
    private VistaLoginMethods trans = servicio.getVistaLoginMethodsPort();
    private Usuario usuario;
    private Transaccion transaccion;

    public Controlador(JFrame interfaz, Usuario usuario, Transaccion transaccion) {
        this.interfaz = interfaz;
        this.usuario = usuario;
        this.transaccion = transaccion;

        interfaz.setVisible(true);
        DeactivateJPanels();
    }

    public void iniciarControl() {
        interfaz.getBtnRegUsu().addActionListener(l -> Load_Register());
        interfaz.getBtn_ValiRegUsu().addActionListener(l -> check_Register());
        interfaz.getBtnIngre().addActionListener(l -> login());
        interfaz.getBtnRegOpe().addActionListener(l -> Realizar_Transacciones());
        interfaz.getExitbtn().addActionListener(l -> Open_Home());
    }

    private void DeactivateJPanels() {
        interfaz.getPnlRegistro().setVisible(false);
        interfaz.getPnlOperaciones().setVisible(false);
        interfaz.getLblAlertInic().setVisible(false);
    }

    private void Load_Register() {
        interfaz.getPnlRegistro().setVisible(true);
        interfaz.getPnlInicio().setVisible(false);
        interfaz.getTxtPass2Reg().setText("");
        interfaz.getTxtPassReg().setText("");
        interfaz.getTxtUserReg().setText("");
        interfaz.getLblAlerReg().setVisible(false);

    }

    private void Open_Home() {
        interfaz.getPnlRegistro().setVisible(false);
        interfaz.getPnlOperaciones().setVisible(false);
        interfaz.getPnlInicio().setVisible(true);
        interfaz.getTxtUser().setText("");
        interfaz.getTxtPass().setText("");
        interfaz.getLblAlertInic().setVisible(false);

    }

    private void OpenOperations() {
        interfaz.getLblAlertOpera().setText("");
        interfaz.getPnlRegistro().setVisible(false);
        interfaz.getPnlOperaciones().setVisible(true);
        interfaz.getPnlInicio().setVisible(false);
        interfaz.getLblAlertOpeUsu().setText(usuario.getUserName());
        interfaz.getLblAlertOpeSal().setText(usuario.getTotal() + "");

    }

    private void check_Register() {
        String user, pass, pass2 = "";

        user = interfaz.getTxtUserReg().getText().trim();
        pass = interfaz.getTxtPassReg().getText().trim();
        pass2 = interfaz.getTxtPass2Reg().getText().trim();

        if (usuario.equals("") || pass.equals("") || pass2.equals("")) {
            JOptionPane.showMessageDialog(null, "Llene todos los campos");

        } else {
            if (pass.equals(pass2)) {
                usuario.setUserName(user);
                usuario.setUserPassword(pass2);
                usuario.setTotal(100);

                if (trans.registro(usuario)) {

                    interfaz.getLblAlerReg().setVisible(true);

                    Timer timer = new Timer();
                    timer.schedule(new TimerTask() {
                        @Override
                        public void run() {

                            Open_Home();
                        }
                    }, 1500);

                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrar");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
            }
        }
    }

    private void login() {
        interfaz.getLblAlertInic().setVisible(false);
        String user = "";

        user = interfaz.getTxtUser().getText().trim();
        char clave[] = interfaz.getTxtPass().getPassword();
        String clavedef = new String(clave);
        usuario.setUserName(user);
        usuario.setUserPassword(clavedef);

        usuario = trans.iniciosesion(usuario);

        if (usuario.getUserName() == null) {

            interfaz.getLblAlertInic().setVisible(true);
        } else {

            OpenOperations();
        }
    }

    private void Realizar_Transacciones() {
        int saldo = Integer.parseInt(interfaz.getSpnCantidad().getValue().toString());

        if (interfaz.getRdbRetiro().isSelected()) {
            transaccion.setTotal(saldo);
            transaccion.setUserName(usuario.getUserName());

            transaccion = trans.retiro(transaccion);

            if (transaccion.isEstado()) {
                interfaz.getLblAlertOpera().setText("Operación exitosa");
                interfaz.getLblAlertOpera().setForeground(Color.GREEN);
                interfaz.getLblAlertOpeSal().setText(transaccion.getTotal() + "");
            } else {
                interfaz.getLblAlertOpera().setText("Saldo insuficiente");
                interfaz.getLblAlertOpera().setForeground(Color.RED);
            }
        } else {
            transaccion.setTotal(saldo);
            transaccion.setUserName(usuario.getUserName());
            transaccion = trans.deposito(transaccion);
            System.out.println(transaccion.getTotal() + "Depo");
            if (transaccion.isEstado()) {
                interfaz.getLblAlertOpera().setText("Operación exitosa");
                interfaz.getLblAlertOpera().setForeground(Color.GREEN);
                interfaz.getLblAlertOpeSal().setText(transaccion.getTotal() + "");
            } else {

                JOptionPane.showMessageDialog(null, "Error al deposito");
            }
        }
    }
}
