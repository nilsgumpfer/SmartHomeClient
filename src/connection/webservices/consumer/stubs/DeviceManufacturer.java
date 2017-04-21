
package connection.webservices.consumer.stubs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für deviceManufacturer.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="deviceManufacturer">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VIESSMANN"/>
 *     &lt;enumeration value="BUDERUS"/>
 *     &lt;enumeration value="VAILLANT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "deviceManufacturer")
@XmlEnum
public enum DeviceManufacturer {

    VIESSMANN,
    BUDERUS,
    VAILLANT;

    public String value() {
        return name();
    }

    public static DeviceManufacturer fromValue(String v) {
        return valueOf(v);
    }

}
