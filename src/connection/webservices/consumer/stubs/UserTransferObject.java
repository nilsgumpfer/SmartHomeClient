
package connection.webservices.consumer.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für userTransferObject complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="userTransferObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="var1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="int1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="user" type="{http://wsprovider.connection.global.smarthome.thm.de/}user" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userTransferObject", propOrder = {
    "var1",
    "int1",
    "user"
})
public class UserTransferObject {

    protected String var1;
    protected int int1;
    protected User user;

    /**
     * Ruft den Wert der var1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVar1() {
        return var1;
    }

    /**
     * Legt den Wert der var1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVar1(String value) {
        this.var1 = value;
    }

    /**
     * Ruft den Wert der int1-Eigenschaft ab.
     * 
     */
    public int getInt1() {
        return int1;
    }

    /**
     * Legt den Wert der int1-Eigenschaft fest.
     * 
     */
    public void setInt1(int value) {
        this.int1 = value;
    }

    /**
     * Ruft den Wert der user-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Legt den Wert der user-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

}
