
package connection.webservices.consumer.stubs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für unitOfMeasurement.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="unitOfMeasurement">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="temperature_DegreesCelsius"/>
 *     &lt;enumeration value="temperature_DegreesFahrenheit"/>
 *     &lt;enumeration value="velocity_KilometersPerHour"/>
 *     &lt;enumeration value="velocity_MilesPerHour"/>
 *     &lt;enumeration value="volume_LitresPerSquareMeter"/>
 *     &lt;enumeration value="volume_GallonsPerSquareInch"/>
 *     &lt;enumeration value="pressure_Bar"/>
 *     &lt;enumeration value="pressure_PoundForcePerSquareInch"/>
 *     &lt;enumeration value="distance_meters"/>
 *     &lt;enumeration value="distance_feet"/>
 *     &lt;enumeration value="relation_percent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "unitOfMeasurement")
@XmlEnum
public enum UnitOfMeasurement {

    @XmlEnumValue("temperature_DegreesCelsius")
    TEMPERATURE_DEGREES_CELSIUS("temperature_DegreesCelsius"),
    @XmlEnumValue("temperature_DegreesFahrenheit")
    TEMPERATURE_DEGREES_FAHRENHEIT("temperature_DegreesFahrenheit"),
    @XmlEnumValue("velocity_KilometersPerHour")
    VELOCITY_KILOMETERS_PER_HOUR("velocity_KilometersPerHour"),
    @XmlEnumValue("velocity_MilesPerHour")
    VELOCITY_MILES_PER_HOUR("velocity_MilesPerHour"),
    @XmlEnumValue("volume_LitresPerSquareMeter")
    VOLUME_LITRES_PER_SQUARE_METER("volume_LitresPerSquareMeter"),
    @XmlEnumValue("volume_GallonsPerSquareInch")
    VOLUME_GALLONS_PER_SQUARE_INCH("volume_GallonsPerSquareInch"),
    @XmlEnumValue("pressure_Bar")
    PRESSURE_BAR("pressure_Bar"),
    @XmlEnumValue("pressure_PoundForcePerSquareInch")
    PRESSURE_POUND_FORCE_PER_SQUARE_INCH("pressure_PoundForcePerSquareInch"),
    @XmlEnumValue("distance_meters")
    DISTANCE_METERS("distance_meters"),
    @XmlEnumValue("distance_feet")
    DISTANCE_FEET("distance_feet"),
    @XmlEnumValue("relation_percent")
    RELATION_PERCENT("relation_percent");
    private final String value;

    UnitOfMeasurement(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnitOfMeasurement fromValue(String v) {
        for (UnitOfMeasurement c: UnitOfMeasurement.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
