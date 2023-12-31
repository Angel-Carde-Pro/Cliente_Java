
package sw;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.5
 * Generated source version: 2.2
 * 
 */
@WebService(name = "VistaLoginMethods", targetNamespace = "http://sw/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface VistaLoginMethods {


    /**
     * 
     * @param usuario
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "registro", targetNamespace = "http://sw/", className = "sw.Registro")
    @ResponseWrapper(localName = "registroResponse", targetNamespace = "http://sw/", className = "sw.RegistroResponse")
    @Action(input = "http://sw/VistaLoginMethods/registroRequest", output = "http://sw/VistaLoginMethods/registroResponse")
    public boolean registro(
        @WebParam(name = "usuario", targetNamespace = "")
        Usuario usuario);

    /**
     * 
     * @param cantidad
     * @return
     *     returns sw.Transaccion
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deposito", targetNamespace = "http://sw/", className = "sw.Deposito")
    @ResponseWrapper(localName = "depositoResponse", targetNamespace = "http://sw/", className = "sw.DepositoResponse")
    @Action(input = "http://sw/VistaLoginMethods/depositoRequest", output = "http://sw/VistaLoginMethods/depositoResponse")
    public Transaccion deposito(
        @WebParam(name = "cantidad", targetNamespace = "")
        Transaccion cantidad);

    /**
     * 
     * @param cantidad
     * @return
     *     returns sw.Transaccion
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "retiro", targetNamespace = "http://sw/", className = "sw.Retiro")
    @ResponseWrapper(localName = "retiroResponse", targetNamespace = "http://sw/", className = "sw.RetiroResponse")
    @Action(input = "http://sw/VistaLoginMethods/retiroRequest", output = "http://sw/VistaLoginMethods/retiroResponse")
    public Transaccion retiro(
        @WebParam(name = "cantidad", targetNamespace = "")
        Transaccion cantidad);

    /**
     * 
     * @param usuario
     * @return
     *     returns sw.Usuario
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "iniciosesion", targetNamespace = "http://sw/", className = "sw.Iniciosesion")
    @ResponseWrapper(localName = "iniciosesionResponse", targetNamespace = "http://sw/", className = "sw.IniciosesionResponse")
    @Action(input = "http://sw/VistaLoginMethods/iniciosesionRequest", output = "http://sw/VistaLoginMethods/iniciosesionResponse")
    public Usuario iniciosesion(
        @WebParam(name = "usuario", targetNamespace = "")
        Usuario usuario);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://sw/", className = "sw.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://sw/", className = "sw.HelloResponse")
    @Action(input = "http://sw/VistaLoginMethods/helloRequest", output = "http://sw/VistaLoginMethods/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}
