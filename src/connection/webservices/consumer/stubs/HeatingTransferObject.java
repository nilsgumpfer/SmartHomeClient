
package connection.webservices.consumer.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für heatingTransferObject complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="heatingTransferObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="heatingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responseCode" type="{http://wsprovider.connection.global.smarthome.thm.de/}responseCode" minOccurs="0"/>
 *         &lt;element name="temperature" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "heatingTransferObject", propOrder = {
    "heatingName",
    "message",
    "responseCode",
    "temperature"
})
public class HeatingTransferObject {

    protected String heatingName;
    protected String message;
    @XmlSchemaType(name = "string")
    protected ResponseCode responseCode;
    protected double temperature;

    /**
     * Ruft den Wert der heatingName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeatingName() {
        return heatingName;
    }

    /**
     * Legt den Wert der heatingName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeatingName(String value) {
        this.heatingName = value;
    }

    /**
     * Ruft den Wert der message-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Legt den Wert der message-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Ruft den Wert der responseCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResponseCode }
     *     
     */
    public ResponseCode getResponseCode() {
        return responseCode;
    }

    /**
     * Legt den Wert der responseCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseCode }
     *     
     */
    public void setResponseCode(ResponseCode value) {
        this.responseCode = value;
    }

    /**
     * Ruft den Wert der temperature-Eigenschaft ab.
     * 
     */
    public double getTemperature() {
        return temperature;
    }

    /**
     * Legt den Wert der temperature-Eigenschaft fest.
     * 
     */
    public void setTemperature(double value) {
        this.temperature = value;
    }

}
