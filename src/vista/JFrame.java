package vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/**
 *
 * @author angel
 */
public class JFrame extends javax.swing.JFrame {

    public JFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        JPanel1 = new javax.swing.JPanel();
        jLabelusu = new javax.swing.JLabel();
        lblAlertOpeUsu = new javax.swing.JLabel();
        jLabelSelect = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        lblAlertOpera = new javax.swing.JLabel();
        jLabelValue = new javax.swing.JLabel();
        jLabelSaldo = new javax.swing.JLabel();
        spnCantidad = new javax.swing.JSpinner();
        rdbDeposito = new javax.swing.JRadioButton();
        rdbRetiro = new javax.swing.JRadioButton();
        lblAlertOpeSal = new javax.swing.JLabel();
        Exitbtn = new javax.swing.JButton();
        JPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        btnRegUsu = new javax.swing.JButton();
        btnIngre = new javax.swing.JButton();
        lblAlertInic = new javax.swing.JLabel();
        JPanelRegister = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btn_ValiRegUsu = new javax.swing.JButton();
        lblAlerReg = new javax.swing.JLabel();
        txtUserReg = new javax.swing.JTextField();
        txtPassReg = new javax.swing.JTextField();
        txtPass2Reg = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelusu.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelusu.setText("Usuario:");
        JPanel1.add(jLabelusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        lblAlertOpeUsu.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JPanel1.add(lblAlertOpeUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 130, 30));

        jLabelSelect.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelSelect.setText("Seleccione:");
        JPanel1.add(jLabelSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        btnRegister.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnRegister.setText("Registrar");
        JPanel1.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));

        lblAlertOpera.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        JPanel1.add(lblAlertOpera, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 260, 30));

        jLabelValue.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelValue.setText("Valor:");
        JPanel1.add(jLabelValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jLabelSaldo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelSaldo.setText("Saldo:");
        JPanel1.add(jLabelSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        spnCantidad.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        spnCantidad.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));
        JPanel1.add(spnCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 160, -1));

        buttonGroup1.add(rdbDeposito);
        rdbDeposito.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        rdbDeposito.setSelected(true);
        rdbDeposito.setText("Deposito");
        JPanel1.add(rdbDeposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

        buttonGroup1.add(rdbRetiro);
        rdbRetiro.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        rdbRetiro.setText("Retiro");
        JPanel1.add(rdbRetiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        lblAlertOpeSal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JPanel1.add(lblAlertOpeSal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 150, 30));

        Exitbtn.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Exitbtn.setText("Salir");
        JPanel1.add(Exitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, -1, -1));

        getContentPane().add(JPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 510));

        JPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Usuario:");
        JPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        txtUser.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JPanel2.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 220, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Clave:");
        JPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        txtPass.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JPanel2.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 230, -1));

        btnRegUsu.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnRegUsu.setText("Registrar");
        JPanel2.add(btnRegUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, -1, -1));

        btnIngre.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnIngre.setText("Ingresar");
        JPanel2.add(btnIngre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        lblAlertInic.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        lblAlertInic.setForeground(new java.awt.Color(255, 102, 51));
        lblAlertInic.setText("Credenciales Erroneas");
        JPanel2.add(lblAlertInic, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, -1, -1));

        getContentPane().add(JPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 515));

        JPanelRegister.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        jLabel7.setText("Usuario:");
        JPanelRegister.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel8.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        jLabel8.setText("Clave:");
        JPanelRegister.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        jLabel9.setText("Repite Clave:");
        JPanelRegister.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel10.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        jLabel10.setText("Saldo Inicial:");
        JPanelRegister.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel11.setText("10");
        JPanelRegister.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 80, 40));

        btn_ValiRegUsu.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btn_ValiRegUsu.setText("Registrar");
        JPanelRegister.add(btn_ValiRegUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, -1, -1));

        lblAlerReg.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblAlerReg.setForeground(new java.awt.Color(0, 153, 0));
        lblAlerReg.setText("Se registro correctamente");
        JPanelRegister.add(lblAlerReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, -1, -1));

        txtUserReg.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JPanelRegister.add(txtUserReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 170, -1));

        txtPassReg.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JPanelRegister.add(txtPassReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 170, -1));

        txtPass2Reg.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JPanelRegister.add(txtPass2Reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 170, -1));

        getContentPane().add(JPanelRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtn_ValiRegUsu() {
        return btn_ValiRegUsu;
    }

    public JLabel getLblAlerReg() {
        return lblAlerReg;
    }

    public void setLblAlerReg(JLabel lblAlerReg) {
        this.lblAlerReg = lblAlerReg;
    }

    public JTextField getTxtPass2Reg() {
        return txtPass2Reg;
    }

    public void setTxtPass2Reg(JTextField txtPass2Reg) {
        this.txtPass2Reg = txtPass2Reg;
    }

    public JTextField getTxtPassReg() {
        return txtPassReg;
    }

    public void setTxtPassReg(JTextField txtPassReg) {
        this.txtPassReg = txtPassReg;
    }

    public JTextField getTxtUserReg() {
        return txtUserReg;
    }

    public JLabel getLblAlertOpeSal() {
        return lblAlertOpeSal;
    }

    public void setLblAlertOpeSal(JLabel lblAlertOpeSal) {
        this.lblAlertOpeSal = lblAlertOpeSal;
    }

    public JLabel getLblAlertOpeUsu() {
        return lblAlertOpeUsu;
    }

    public void setLblAlertOpeUsu(JLabel lblAlertOpeUsu) {
        this.lblAlertOpeUsu = lblAlertOpeUsu;
    }

    public JLabel getLblAlertOpera() {
        return lblAlertOpera;
    }

    public void setLblAlertOpera(JLabel lblAlertOpera) {
        this.lblAlertOpera = lblAlertOpera;
    }

    public void setTxtUserReg(JTextField txtUserReg) {
        this.txtUserReg = txtUserReg;
    }

    public JButton getBtnIngre() {
        return btnIngre;
    }

    public JButton getExitbtn() {
        return Exitbtn;
    }

    public void setExitbtn(JButton Exitbtn) {
        this.Exitbtn = Exitbtn;
    }

    public JRadioButton getRdbDeposito() {
        return rdbDeposito;
    }

    public void setRdbDeposito(JRadioButton rdbDeposito) {
        this.rdbDeposito = rdbDeposito;
    }

    public JRadioButton getRdbRetiro() {
        return rdbRetiro;
    }

    public void setRdbRetiro(JRadioButton rdbRetiro) {
        this.rdbRetiro = rdbRetiro;
    }

    public void setBtnIngre(JButton btnIngre) {
        this.btnIngre = btnIngre;
    }

    public JLabel getLblAlertInic() {
        return lblAlertInic;
    }

    public JButton getBtnRegOpe() {
        return btnRegister;
    }

    public void setBtnRegOpe(JButton btnRegOpe) {
        this.btnRegister = btnRegOpe;
    }

    public JSpinner getSpnCantidad() {
        return spnCantidad;
    }

    public void setSpnCantidad(JSpinner spnCantidad) {
        this.spnCantidad = spnCantidad;
    }

    public void setLblAlertInic(JLabel lblAlertInic) {
        this.lblAlertInic = lblAlertInic;
    }

    public JPasswordField getTxtPass() {
        return txtPass;
    }

    public void setTxtPass(JPasswordField txtPass) {
        this.txtPass = txtPass;
    }

    public JTextField getTxtUser() {
        return txtUser;
    }

    public void setTxtUser(JTextField txtUser) {
        this.txtUser = txtUser;
    }

    public void setBtn_ValiRegUsu(JButton btn_ValiRegUsu) {
        this.btn_ValiRegUsu = btn_ValiRegUsu;
    }

    public JPanel getPnlOperaciones() {
        return JPanel1;
    }

    public void setPnlOperaciones(JPanel pnlOperaciones) {
        this.JPanel1 = pnlOperaciones;
    }

    public JPanel getPnlRegistro() {
        return JPanelRegister;
    }

    public void setPnlRegistro(JPanel pnlRegistro) {
        this.JPanelRegister = pnlRegistro;
    }

    public JButton getBtnRegUsu() {
        return btnRegUsu;
    }

    public void setBtnRegUsu(JButton btnRegUsu) {
        this.btnRegUsu = btnRegUsu;
    }

    public JPanel getPnlInicio() {
        return JPanel2;
    }

    public void setPnlInicio(JPanel pnlInicio) {
        this.JPanel2 = pnlInicio;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exitbtn;
    private javax.swing.JPanel JPanel1;
    private javax.swing.JPanel JPanel2;
    private javax.swing.JPanel JPanelRegister;
    private javax.swing.JButton btnIngre;
    private javax.swing.JButton btnRegUsu;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btn_ValiRegUsu;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelSaldo;
    private javax.swing.JLabel jLabelSelect;
    private javax.swing.JLabel jLabelValue;
    private javax.swing.JLabel jLabelusu;
    private javax.swing.JLabel lblAlerReg;
    private javax.swing.JLabel lblAlertInic;
    private javax.swing.JLabel lblAlertOpeSal;
    private javax.swing.JLabel lblAlertOpeUsu;
    private javax.swing.JLabel lblAlertOpera;
    private javax.swing.JRadioButton rdbDeposito;
    private javax.swing.JRadioButton rdbRetiro;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtPass2Reg;
    private javax.swing.JTextField txtPassReg;
    private javax.swing.JTextField txtUser;
    private javax.swing.JTextField txtUserReg;
    // End of variables declaration//GEN-END:variables
}
