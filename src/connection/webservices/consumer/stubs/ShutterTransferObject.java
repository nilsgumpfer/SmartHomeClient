
package connection.webservices.consumer.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für shutterTransferObject complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="shutterTransferObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="manufacturer" type="{http://wsprovider.connection.global.smarthome.thm.de/}deviceManufacturer" minOccurs="0"/>
 *         &lt;element name="manufacturer_t" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moveComplete" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="responseCode" type="{http://wsprovider.connection.global.smarthome.thm.de/}responseCode" minOccurs="0"/>
 *         &lt;element name="serialnumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shutterID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shutterTransferObject", propOrder = {
    "manufacturer",
    "manufacturerT",
    "message",
    "mode",
    "model",
    "moveComplete",
    "position",
    "responseCode",
    "serialnumber",
    "shutterID"
})
public class ShutterTransferObject {

    @XmlSchemaType(name = "string")
    protected DeviceManufacturer manufacturer;
    @XmlElement(name = "manufacturer_t")
    protected String manufacturerT;
    protected String message;
    protected String mode;
    protected String model;
    protected boolean moveComplete;
    protected int position;
    @XmlSchemaType(name = "string")
    protected ResponseCode responseCode;
    protected String serialnumber;
    protected String shutterID;

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
     * Ruft den Wert der mode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Legt den Wert der mode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
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
     * Ruft den Wert der moveComplete-Eigenschaft ab.
     * 
     */
    public boolean isMoveComplete() {
        return moveComplete;
    }

    /**
     * Legt den Wert der moveComplete-Eigenschaft fest.
     * 
     */
    public void setMoveComplete(boolean value) {
        this.moveComplete = value;
    }

    /**
     * Ruft den Wert der position-Eigenschaft ab.
     * 
     */
    public int getPosition() {
        return position;
    }

    /**
     * Legt den Wert der position-Eigenschaft fest.
     * 
     */
    public void setPosition(int value) {
        this.position = value;
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
     * Ruft den Wert der shutterID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShutterID() {
        return shutterID;
    }

    /**
     * Legt den Wert der shutterID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShutterID(String value) {
        this.shutterID = value;
    }

}
