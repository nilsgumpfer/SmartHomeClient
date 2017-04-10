
package connection.webservices.consumer.stubs;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;


/**
 * This class was stubs by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ChrisWebServices", targetNamespace = "http://wsprovider.connection.global.smarthome.thm.de/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface ChrisWebServices {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://wsprovider.connection.global.smarthome.thm.de/ChrisWebServices/helloRequest", output = "http://wsprovider.connection.global.smarthome.thm.de/ChrisWebServices/helloResponse")
    public String hello(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

    /**
     * 
     * @param weight
     * @param height
     * @return
     *     returns double
     */
    @WebMethod(operationName = "body-mass-index")
    @WebResult(name = "your-bmi", partName = "your-bmi")
    @Action(input = "http://wsprovider.connection.global.smarthome.thm.de/ChrisWebServices/body-mass-indexRequest", output = "http://wsprovider.connection.global.smarthome.thm.de/ChrisWebServices/body-mass-indexResponse")
    public double bodyMassIndex(
        @WebParam(name = "height", partName = "height")
        double height,
        @WebParam(name = "weight", partName = "weight")
        double weight);

}
