
package connection.webservices.consumer.stubs;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was stubs by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
//@WebServiceClient(name = "MyWebServicesService", targetNamespace = "http://connection.webservices.connection.smarthome.thm.de/", wsdlLocation = "http://localhost:8080/services?wsdl")
@WebServiceClient(name = "MyWebServicesService", targetNamespace = "http://wsprovider.connection.global.smarthome.thm.de/", wsdlLocation = "http://localhost:8080/services?wsdl")
public class MyWebServicesService extends Service
{

    private final static URL MYWEBSERVICESSERVICE_WSDL_LOCATION;
    private final static WebServiceException MYWEBSERVICESSERVICE_EXCEPTION;
    private final static QName MYWEBSERVICESSERVICE_QNAME = new QName("http://wsprovider.connection.global.smarthome.thm.de/", "MyWebServicesService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/services?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MYWEBSERVICESSERVICE_WSDL_LOCATION = url;
        MYWEBSERVICESSERVICE_EXCEPTION = e;
    }

    public MyWebServicesService() {
        super(__getWsdlLocation(), MYWEBSERVICESSERVICE_QNAME);
    }

    public MyWebServicesService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MYWEBSERVICESSERVICE_QNAME, features);
    }

    public MyWebServicesService(URL wsdlLocation) {
        super(wsdlLocation, MYWEBSERVICESSERVICE_QNAME);
    }

    public MyWebServicesService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MYWEBSERVICESSERVICE_QNAME, features);
    }

    public MyWebServicesService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MyWebServicesService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ChrisWebServices
     */
    @WebEndpoint(name = "ChrisWebServicesPort")
    public ChrisWebServices getChrisWebServicesPort() {
        return super.getPort(new QName("http://wsprovider.connection.global.smarthome.thm.de/", "ChrisWebServicesPort"), ChrisWebServices.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ChrisWebServices
     */
    @WebEndpoint(name = "ChrisWebServicesPort")
    public ChrisWebServices getChrisWebServicesPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://wsprovider.connection.global.smarthome.thm.de/", "ChrisWebServicesPort"), ChrisWebServices.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MYWEBSERVICESSERVICE_EXCEPTION!= null) {
            throw MYWEBSERVICESSERVICE_EXCEPTION;
        }
        return MYWEBSERVICESSERVICE_WSDL_LOCATION;
    }

}
