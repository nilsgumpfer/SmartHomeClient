
package connection.webservices.consumer.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für thermometerTransferObject complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="thermometerTransferObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="manufacturer" type="{http://wsprovider.connection.global.smarthome.thm.de/}deviceManufacturer" minOccurs="0"/>
 *         &lt;element name="manufacturer_t" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responseCode" type="{http://wsprovider.connection.global.smarthome.thm.de/}responseCode" minOccurs="0"/>
 *         &lt;element name="serialnumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="temperature" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="temperatureUnit" type="{http://wsprovider.connection.global.smarthome.thm.de/}unitOfMeasurement" minOccurs="0"/>
 *         &lt;element name="temperatureUnit_t" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "thermometerTransferObject", propOrder = {
    "manufacturer",
    "manufacturerT",
    "message",
    "model",
    "name",
    "responseCode",
    "serialnumber",
    "temperature",
    "temperatureUnit",
    "temperatureUnitT"
})
public class ThermometerTransferObject {

    @XmlSchemaType(name = "string")
    protected DeviceManufacturer manufacturer;
    @XmlElement(name = "manufacturer_t")
    protected String manufacturerT;
    protected String message;
    protected String model;
    protected String name;
    @XmlSchemaType(name = "string")
    protected ResponseCode responseCode;
    protected String serialnumber;
    protected double temperature;
    @XmlSchemaType(name = "string")
    protected UnitOfMeasurement temperatureUnit;
    @XmlElement(name = "temperatureUnit_t")
    protected String temperatureUnitT;

    /**
     * Ruft den Wert der manufacturer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceManufacturer }
     *     
     */
    public DeviceManufacturer getManufacturer() {
        return manufacturer;
    }

    /**
     * Legt den Wert der manufacturer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceManufacturer }
     *     
     */
    public void setManufacturer(DeviceManufacturer value) {
        this.manufacturer = value;
    }

    /**
     * Ruft den Wert der manufacturerT-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerT() {
        return manufacturerT;
    }

    /**
     * Legt den Wert der manufacturerT-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerT(String value) {
        this.manufacturerT = value;
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
     * Ruft den Wert der model-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Legt den Wert der model-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Ruft den Wert der serialnumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialnumber() {
        return serialnumber;
    }

    /**
     * Legt den Wert der serialnumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialnumber(String value) {
        this.serialnumber = value;
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

    /**
     * Ruft den Wert der temperatureUnit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasurement }
     *     
     */
    public UnitOfMeasurement getTemperatureUnit() {
        return temperatureUnit;
    }

    /**
     * Legt den Wert der temperatureUnit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasurement }
     *     
     */
    public void setTemperatureUnit(UnitOfMeasurement value) {
        this.temperatureUnit = value;
    }

    /**
     * Ruft den Wert der temperatureUnitT-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemperatureUnitT() {
        return temperatureUnitT;
    }

    /**
     * Legt den Wert der temperatureUnitT-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemperatureUnitT(String value) {
        this.temperatureUnitT = value;
    }

}
