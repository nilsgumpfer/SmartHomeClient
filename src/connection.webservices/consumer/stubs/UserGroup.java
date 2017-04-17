
package connection.webservices.consumer.stubs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für userGroup.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="userGroup">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Administrator"/>
 *     &lt;enumeration value="EndUser"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "userGroup")
@XmlEnum
public enum UserGroup {

    @XmlEnumValue("Administrator")
    ADMINISTRATOR("Administrator"),
    @XmlEnumValue("EndUser")
    END_USER("EndUser");
    private final String value;

    UserGroup(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserGroup fromValue(String v) {
        for (UserGroup c: UserGroup.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
