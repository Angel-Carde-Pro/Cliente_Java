package principal;

import control.Controlador;
import sw.Transaccion;
import sw.Usuario;

import vista.JFrame;

/**
 *
 * @author Angel
 */
public class Iniciar {

    public static void main(String[] args) {

        JFrame interfaz = new JFrame();
        Usuario usuario = new Usuario();
        Transaccion transaccion = new Transaccion();
        Controlador control = new Controlador(interfaz, usuario, transaccion);

        control.iniciarControl();
    }
}