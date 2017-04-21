
package connection.webservices.consumer.stubs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für responseCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="responseCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LoginFailed"/>
 *     &lt;enumeration value="LoginSuccessful"/>
 *     &lt;enumeration value="LogoutFailed"/>
 *     &lt;enumeration value="LogoutSuccessful"/>
 *     &lt;enumeration value="WrongPassword"/>
 *     &lt;enumeration value="WrongUsername"/>
 *     &lt;enumeration value="NotLoggedIn"/>
 *     &lt;enumeration value="HeatingCouldNotBeCreated"/>
 *     &lt;enumeration value="ShutterCouldNotBeCreated"/>
 *     &lt;enumeration value="ThermometerCouldNotBeCreated"/>
 *     &lt;enumeration value="LoggedIn"/>
 *     &lt;enumeration value="DBError"/>
 *     &lt;enumeration value="LoggedOut"/>
 *     &lt;enumeration value="UndoSuccessful"/>
 *     &lt;enumeration value="CommandInvokedSuccessfully"/>
 *     &lt;enumeration value="CommandInvocationFailed"/>
 *     &lt;enumeration value="SwitchedOn"/>
 *     &lt;enumeration value="SwitchedOff"/>
 *     &lt;enumeration value="AlreadySwitchedOn"/>
 *     &lt;enumeration value="AlreadySwitchedOff"/>
 *     &lt;enumeration value="TemperatureAdjustmentSuccessful"/>
 *     &lt;enumeration value="TemperatureAdjustmentFailed"/>
 *     &lt;enumeration value="MovedUpSuccessfully"/>
 *     &lt;enumeration value="MoveUpFailed"/>
 *     &lt;enumeration value="MoveDownFailed"/>
 *     &lt;enumeration value="MovedDownSuccessfully"/>
 *     &lt;enumeration value="UndoFailed"/>
 *     &lt;enumeration value="MoveToPositionFailed"/>
 *     &lt;enumeration value="MoveToPositionSuccessful"/>
 *     &lt;enumeration value="SwitchOnFailed"/>
 *     &lt;enumeration value="SwitchOffFailed"/>
 *     &lt;enumeration value="AlreadyMovedDown"/>
 *     &lt;enumeration value="AlreadyMovedUp"/>
 *     &lt;enumeration value="AlreadyAtThisPosition"/>
 *     &lt;enumeration value="UserCreatedSuccessfully"/>
 *     &lt;enumeration value="UserCreationFailed"/>
 *     &lt;enumeration value="UserDeletedSuccessfully"/>
 *     &lt;enumeration value="UserDeletionFailed"/>
 *     &lt;enumeration value="UserAlteredSuccessfully"/>
 *     &lt;enumeration value="UserAlterationFailed"/>
 *     &lt;enumeration value="Success"/>
 *     &lt;enumeration value="Fail"/>
 *     &lt;enumeration value="WeatherStationCouldNotBeCreated"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "responseCode")
@XmlEnum
public enum ResponseCode {

    @XmlEnumValue("LoginFailed")
    LOGIN_FAILED("LoginFailed"),
    @XmlEnumValue("LoginSuccessful")
    LOGIN_SUCCESSFUL("LoginSuccessful"),
    @XmlEnumValue("LogoutFailed")
    LOGOUT_FAILED("LogoutFailed"),
    @XmlEnumValue("LogoutSuccessful")
    LOGOUT_SUCCESSFUL("LogoutSuccessful"),
    @XmlEnumValue("WrongPassword")
    WRONG_PASSWORD("WrongPassword"),
    @XmlEnumValue("WrongUsername")
    WRONG_USERNAME("WrongUsername"),
    @XmlEnumValue("NotLoggedIn")
    NOT_LOGGED_IN("NotLoggedIn"),
    @XmlEnumValue("HeatingCouldNotBeCreated")
    HEATING_COULD_NOT_BE_CREATED("HeatingCouldNotBeCreated"),
    @XmlEnumValue("ShutterCouldNotBeCreated")
    SHUTTER_COULD_NOT_BE_CREATED("ShutterCouldNotBeCreated"),
    @XmlEnumValue("ThermometerCouldNotBeCreated")
    THERMOMETER_COULD_NOT_BE_CREATED("ThermometerCouldNotBeCreated"),
    @XmlEnumValue("LoggedIn")
    LOGGED_IN("LoggedIn"),
    @XmlEnumValue("DBError")
    DB_ERROR("DBError"),
    @XmlEnumValue("LoggedOut")
    LOGGED_OUT("LoggedOut"),
    @XmlEnumValue("UndoSuccessful")
    UNDO_SUCCESSFUL("UndoSuccessful"),
    @XmlEnumValue("CommandInvokedSuccessfully")
    COMMAND_INVOKED_SUCCESSFULLY("CommandInvokedSuccessfully"),
    @XmlEnumValue("CommandInvocationFailed")
    COMMAND_INVOCATION_FAILED("CommandInvocationFailed"),
    @XmlEnumValue("SwitchedOn")
    SWITCHED_ON("SwitchedOn"),
    @XmlEnumValue("SwitchedOff")
    SWITCHED_OFF("SwitchedOff"),
    @XmlEnumValue("AlreadySwitchedOn")
    ALREADY_SWITCHED_ON("AlreadySwitchedOn"),
    @XmlEnumValue("AlreadySwitchedOff")
    ALREADY_SWITCHED_OFF("AlreadySwitchedOff"),
    @XmlEnumValue("TemperatureAdjustmentSuccessful")
    TEMPERATURE_ADJUSTMENT_SUCCESSFUL("TemperatureAdjustmentSuccessful"),
    @XmlEnumValue("TemperatureAdjustmentFailed")
    TEMPERATURE_ADJUSTMENT_FAILED("TemperatureAdjustmentFailed"),
    @XmlEnumValue("MovedUpSuccessfully")
    MOVED_UP_SUCCESSFULLY("MovedUpSuccessfully"),
    @XmlEnumValue("MoveUpFailed")
    MOVE_UP_FAILED("MoveUpFailed"),
    @XmlEnumValue("MoveDownFailed")
    MOVE_DOWN_FAILED("MoveDownFailed"),
    @XmlEnumValue("MovedDownSuccessfully")
    MOVED_DOWN_SUCCESSFULLY("MovedDownSuccessfully"),
    @XmlEnumValue("UndoFailed")
    UNDO_FAILED("UndoFailed"),
    @XmlEnumValue("MoveToPositionFailed")
    MOVE_TO_POSITION_FAILED("MoveToPositionFailed"),
    @XmlEnumValue("MoveToPositionSuccessful")
    MOVE_TO_POSITION_SUCCESSFUL("MoveToPositionSuccessful"),
    @XmlEnumValue("SwitchOnFailed")
    SWITCH_ON_FAILED("SwitchOnFailed"),
    @XmlEnumValue("SwitchOffFailed")
    SWITCH_OFF_FAILED("SwitchOffFailed"),
    @XmlEnumValue("AlreadyMovedDown")
    ALREADY_MOVED_DOWN("AlreadyMovedDown"),
    @XmlEnumValue("AlreadyMovedUp")
    ALREADY_MOVED_UP("AlreadyMovedUp"),
    @XmlEnumValue("AlreadyAtThisPosition")
    ALREADY_AT_THIS_POSITION("AlreadyAtThisPosition"),
    @XmlEnumValue("UserCreatedSuccessfully")
    USER_CREATED_SUCCESSFULLY("UserCreatedSuccessfully"),
    @XmlEnumValue("UserCreationFailed")
    USER_CREATION_FAILED("UserCreationFailed"),
    @XmlEnumValue("UserDeletedSuccessfully")
    USER_DELETED_SUCCESSFULLY("UserDeletedSuccessfully"),
    @XmlEnumValue("UserDeletionFailed")
    USER_DELETION_FAILED("UserDeletionFailed"),
    @XmlEnumValue("UserAlteredSuccessfully")
    USER_ALTERED_SUCCESSFULLY("UserAlteredSuccessfully"),
    @XmlEnumValue("UserAlterationFailed")
    USER_ALTERATION_FAILED("UserAlterationFailed"),
    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("Fail")
    FAIL("Fail"),
    @XmlEnumValue("WeatherStationCouldNotBeCreated")
    WEATHER_STATION_COULD_NOT_BE_CREATED("WeatherStationCouldNotBeCreated");
    private final String value;

    ResponseCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResponseCode fromValue(String v) {
        for (ResponseCode c: ResponseCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
