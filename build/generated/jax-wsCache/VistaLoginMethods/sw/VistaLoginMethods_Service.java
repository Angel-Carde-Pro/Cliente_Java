
package sw;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.5
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "VistaLoginMethods", targetNamespace = "http://sw/", wsdlLocation = "http://localhost:8080/1erProyectoSoap/VistaLoginMethods?WSDL")
public class VistaLoginMethods_Service
    extends Service
{

    private final static URL VISTALOGINMETHODS_WSDL_LOCATION;
    private final static WebServiceException VISTALOGINMETHODS_EXCEPTION;
    private final static QName VISTALOGINMETHODS_QNAME = new QName("http://sw/", "VistaLoginMethods");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/1erProyectoSoap/VistaLoginMethods?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        VISTALOGINMETHODS_WSDL_LOCATION = url;
        VISTALOGINMETHODS_EXCEPTION = e;
    }

    public VistaLoginMethods_Service() {
        super(__getWsdlLocation(), VISTALOGINMETHODS_QNAME);
    }

    public VistaLoginMethods_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), VISTALOGINMETHODS_QNAME, features);
    }

    public VistaLoginMethods_Service(URL wsdlLocation) {
        super(wsdlLocation, VISTALOGINMETHODS_QNAME);
    }

    public VistaLoginMethods_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, VISTALOGINMETHODS_QNAME, features);
    }

    public VistaLoginMethods_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public VistaLoginMethods_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns VistaLoginMethods
     */
    @WebEndpoint(name = "VistaLoginMethodsPort")
    public VistaLoginMethods getVistaLoginMethodsPort() {
        return super.getPort(new QName("http://sw/", "VistaLoginMethodsPort"), VistaLoginMethods.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VistaLoginMethods
     */
    @WebEndpoint(name = "VistaLoginMethodsPort")
    public VistaLoginMethods getVistaLoginMethodsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://sw/", "VistaLoginMethodsPort"), VistaLoginMethods.class, features);
    }

    private static URL __getWsdlLocation() {
        if (VISTALOGINMETHODS_EXCEPTION!= null) {
            throw VISTALOGINMETHODS_EXCEPTION;
        }
        return VISTALOGINMETHODS_WSDL_LOCATION;
    }

}