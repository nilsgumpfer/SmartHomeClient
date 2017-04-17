
package connection.webservices.consumer.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für weatherStationTransferObject complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="weatherStationTransferObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="airHumidity" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="airPressure" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outdoorTemperature" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="rainfallAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="responseCode" type="{http://wsprovider.connection.global.smarthome.thm.de/}responseCode" minOccurs="0"/>
 *         &lt;element name="windVelocity" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "weatherStationTransferObject", propOrder = {
    "airHumidity",
    "airPressure",
    "message",
    "outdoorTemperature",
    "rainfallAmount",
    "responseCode",
    "windVelocity"
})
public class WeatherStationTransferObject {

    protected double airHumidity;
    protected double airPressure;
    protected String message;
    protected double outdoorTemperature;
    protected double rainfallAmount;
    @XmlSchemaType(name = "string")
    protected ResponseCode responseCode;
    protected double windVelocity;

    /**
     * Ruft den Wert der airHumidity-Eigenschaft ab.
     * 
     */
    public double getAirHumidity() {
        return airHumidity;
    }

    /**
     * Legt den Wert der airHumidity-Eigenschaft fest.
     * 
     */
    public void setAirHumidity(double value) {
        this.airHumidity = value;
    }

    /**
     * Ruft den Wert der airPressure-Eigenschaft ab.
     * 
     */
    public double getAirPressure() {
        return airPressure;
    }

    /**
     * Legt den Wert der airPressure-Eigenschaft fest.
     * 
     */
    public void setAirPressure(double value) {
        this.airPressure = value;
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
     * Ruft den Wert der outdoorTemperature-Eigenschaft ab.
     * 
     */
    public double getOutdoorTemperature() {
        return outdoorTemperature;
    }

    /**
     * Legt den Wert der outdoorTemperature-Eigenschaft fest.
     * 
     */
    public void setOutdoorTemperature(double value) {
        this.outdoorTemperature = value;
    }

    /**
     * Ruft den Wert der rainfallAmount-Eigenschaft ab.
     * 
     */
    public double getRainfallAmount() {
        return rainfallAmount;
    }

    /**
     * Legt den Wert der rainfallAmount-Eigenschaft fest.
     * 
     */
    public void setRainfallAmount(double value) {
        this.rainfallAmount = value;
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
     * Ruft den Wert der windVelocity-Eigenschaft ab.
     * 
     */
    public double getWindVelocity() {
        return windVelocity;
    }

    /**
     * Legt den Wert der windVelocity-Eigenschaft fest.
     * 
     */
    public void setWindVelocity(double value) {
        this.windVelocity = value;
    }

}
