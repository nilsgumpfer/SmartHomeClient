
package connection.webservices.consumer.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="airHumidityUnit" type="{http://wsprovider.connection.global.smarthome.thm.de/}unitOfMeasurement" minOccurs="0"/>
 *         &lt;element name="airHumidityUnit_t" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="airPressure" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="airPressureUnit" type="{http://wsprovider.connection.global.smarthome.thm.de/}unitOfMeasurement" minOccurs="0"/>
 *         &lt;element name="airPressureUnit_t" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manufacturer" type="{http://wsprovider.connection.global.smarthome.thm.de/}deviceManufacturer" minOccurs="0"/>
 *         &lt;element name="manufacturer_t" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outdoorTemperature" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="outdoorTemperatureUnit" type="{http://wsprovider.connection.global.smarthome.thm.de/}unitOfMeasurement" minOccurs="0"/>
 *         &lt;element name="outdoorTemperatureUnit_t" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rainfallAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="rainfallAmountUnit" type="{http://wsprovider.connection.global.smarthome.thm.de/}unitOfMeasurement" minOccurs="0"/>
 *         &lt;element name="rainfallAmountUnit_t" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responseCode" type="{http://wsprovider.connection.global.smarthome.thm.de/}responseCode" minOccurs="0"/>
 *         &lt;element name="serialnumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="windVelocity" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="windVelocityUnit" type="{http://wsprovider.connection.global.smarthome.thm.de/}unitOfMeasurement" minOccurs="0"/>
 *         &lt;element name="windVelocityUnit_t" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "airHumidityUnit",
    "airHumidityUnitT",
    "airPressure",
    "airPressureUnit",
    "airPressureUnitT",
    "manufacturer",
    "manufacturerT",
    "message",
    "model",
    "name",
    "outdoorTemperature",
    "outdoorTemperatureUnit",
    "outdoorTemperatureUnitT",
    "rainfallAmount",
    "rainfallAmountUnit",
    "rainfallAmountUnitT",
    "responseCode",
    "serialnumber",
    "windVelocity",
    "windVelocityUnit",
    "windVelocityUnitT"
})
public class WeatherStationTransferObject {

    protected double airHumidity;
    @XmlSchemaType(name = "string")
    protected UnitOfMeasurement airHumidityUnit;
    @XmlElement(name = "airHumidityUnit_t")
    protected String airHumidityUnitT;
    protected double airPressure;
    @XmlSchemaType(name = "string")
    protected UnitOfMeasurement airPressureUnit;
    @XmlElement(name = "airPressureUnit_t")
    protected String airPressureUnitT;
    @XmlSchemaType(name = "string")
    protected DeviceManufacturer manufacturer;
    @XmlElement(name = "manufacturer_t")
    protected String manufacturerT;
    protected String message;
    protected String model;
    protected String name;
    protected double outdoorTemperature;
    @XmlSchemaType(name = "string")
    protected UnitOfMeasurement outdoorTemperatureUnit;
    @XmlElement(name = "outdoorTemperatureUnit_t")
    protected String outdoorTemperatureUnitT;
    protected double rainfallAmount;
    @XmlSchemaType(name = "string")
    protected UnitOfMeasurement rainfallAmountUnit;
    @XmlElement(name = "rainfallAmountUnit_t")
    protected String rainfallAmountUnitT;
    @XmlSchemaType(name = "string")
    protected ResponseCode responseCode;
    protected String serialnumber;
    protected double windVelocity;
    @XmlSchemaType(name = "string")
    protected UnitOfMeasurement windVelocityUnit;
    @XmlElement(name = "windVelocityUnit_t")
    protected String windVelocityUnitT;

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
     * Ruft den Wert der airHumidityUnit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasurement }
     *     
     */
    public UnitOfMeasurement getAirHumidityUnit() {
        return airHumidityUnit;
    }

    /**
     * Legt den Wert der airHumidityUnit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasurement }
     *     
     */
    public void setAirHumidityUnit(UnitOfMeasurement value) {
        this.airHumidityUnit = value;
    }

    /**
     * Ruft den Wert der airHumidityUnitT-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirHumidityUnitT() {
        return airHumidityUnitT;
    }

    /**
     * Legt den Wert der airHumidityUnitT-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirHumidityUnitT(String value) {
        this.airHumidityUnitT = value;
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
     * Ruft den Wert der airPressureUnit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasurement }
     *     
     */
    public UnitOfMeasurement getAirPressureUnit() {
        return airPressureUnit;
    }

    /**
     * Legt den Wert der airPressureUnit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasurement }
     *     
     */
    public void setAirPressureUnit(UnitOfMeasurement value) {
        this.airPressureUnit = value;
    }

    /**
     * Ruft den Wert der airPressureUnitT-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirPressureUnitT() {
        return airPressureUnitT;
    }

    /**
     * Legt den Wert der airPressureUnitT-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirPressureUnitT(String value) {
        this.airPressureUnitT = value;
    }

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
     * Ruft den Wert der outdoorTemperatureUnit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasurement }
     *     
     */
    public UnitOfMeasurement getOutdoorTemperatureUnit() {
        return outdoorTemperatureUnit;
    }

    /**
     * Legt den Wert der outdoorTemperatureUnit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasurement }
     *     
     */
    public void setOutdoorTemperatureUnit(UnitOfMeasurement value) {
        this.outdoorTemperatureUnit = value;
    }

    /**
     * Ruft den Wert der outdoorTemperatureUnitT-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutdoorTemperatureUnitT() {
        return outdoorTemperatureUnitT;
    }

    /**
     * Legt den Wert der outdoorTemperatureUnitT-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutdoorTemperatureUnitT(String value) {
        this.outdoorTemperatureUnitT = value;
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
     * Ruft den Wert der rainfallAmountUnit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasurement }
     *     
     */
    public UnitOfMeasurement getRainfallAmountUnit() {
        return rainfallAmountUnit;
    }

    /**
     * Legt den Wert der rainfallAmountUnit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasurement }
     *     
     */
    public void setRainfallAmountUnit(UnitOfMeasurement value) {
        this.rainfallAmountUnit = value;
    }

    /**
     * Ruft den Wert der rainfallAmountUnitT-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRainfallAmountUnitT() {
        return rainfallAmountUnitT;
    }

    /**
     * Legt den Wert der rainfallAmountUnitT-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRainfallAmountUnitT(String value) {
        this.rainfallAmountUnitT = value;
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

    /**
     * Ruft den Wert der windVelocityUnit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasurement }
     *     
     */
    public UnitOfMeasurement getWindVelocityUnit() {
        return windVelocityUnit;
    }

    /**
     * Legt den Wert der windVelocityUnit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasurement }
     *     
     */
    public void setWindVelocityUnit(UnitOfMeasurement value) {
        this.windVelocityUnit = value;
    }

    /**
     * Ruft den Wert der windVelocityUnitT-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindVelocityUnitT() {
        return windVelocityUnitT;
    }

    /**
     * Legt den Wert der windVelocityUnitT-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWindVelocityUnitT(String value) {
        this.windVelocityUnitT = value;
    }

}
