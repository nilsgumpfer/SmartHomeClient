package view.dashboard;

import connection.webservices.consumer.stubs.*;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import logger.SmartHomeClientLogger;

import static connection.webservices.consumer.stubs.DeviceManufacturer.*;

public class DashboardController {

    @FXML
    private ImageView thermometer_AddDeviceButton;

    @FXML
    private Label shutter_Model2;

    @FXML
    private Label thermometer_Serialnumber;

    @FXML
    private Label shutter_Model1;

    @FXML
    private ImageView shutter_MoveDown1;

    @FXML
    private ImageView shutter_MoveDown2;

    @FXML
    private Label shutter_Model4;

    @FXML
    private ImageView shutter_MoveDown3;

    @FXML
    private Label shutter_Model3;

    @FXML
    private ImageView shutter_MoveDown4;

    @FXML
    private Label thermometer_Name;

    @FXML
    private Label weatherstation_Model;

    @FXML
    private Label heating_Manufacturer;

    @FXML
    private Label shutter_Serialnumber3;

    @FXML
    private Label shutter_Serialnumber4;

    @FXML
    private Label shutter_Serialnumber1;

    @FXML
    private Label shutter_Serialnumber2;

    @FXML
    private ImageView connectionIndicatorImage;

    @FXML
    private ImageView shutter_StepUp3;

    @FXML
    private ImageView shutter_StepUp4;

    @FXML
    private ImageView shutter_StepUp1;

    @FXML
    private ImageView shutter_StepUp2;

    @FXML
    private ImageView weatherstation_EditDeviceButton;

    @FXML
    private ImageView weatherstation_DeleteDeviceButton;

    @FXML
    private ImageView shutter_AddDeviceButton;

    @FXML
    private Label heating_Serialnumber;

    @FXML
    private Label heating_PowerState;

    @FXML
    private ImageView weatherstation_DeviceImage;

    @FXML
    private Label weatherstation_Serialnumber;

    @FXML
    private Label shutter_Position3;

    @FXML
    private Label weatherstation_Temperature;

    @FXML
    private Label shutter_Position4;

    @FXML
    private Label weatherstation_Pressure;

    @FXML
    private Label shutter_Manufacturer3;

    @FXML
    private Label shutter_Manufacturer4;

    @FXML
    private Label shutter_Position1;

    @FXML
    private Label shutter_Position2;

    @FXML
    private ImageView heating_AddDeviceButton;

    @FXML
    private Label thermometer_Manufacturer;

    @FXML
    private Label shutter_Manufacturer1;

    @FXML
    private Label shutter_Manufacturer2;

    @FXML
    private ImageView shutter_StepDow3;

    @FXML
    private ImageView shutter_StepDow4;

    @FXML
    private ImageView shutter_EditDeviceButton;

    @FXML
    private Label heating_Model;

    @FXML
    private ImageView undoButton;

    @FXML
    private ImageView thermometer_DeleteDeviceButton;

    @FXML
    private Label weatherstation_WindVelocity;

    @FXML
    private Label statusMessage;

    @FXML
    private ImageView heating_PowerButton;

    @FXML
    private Label heating_Temperature;

    @FXML
    private ImageView shutter_DeviceImage;

    @FXML
    private ImageView shutter_CollectiveDownButton;

    @FXML
    private Label thermometer_Model;

    @FXML
    private Label heating_Mode;

    @FXML
    private Label thermometer_Temperature;

    @FXML
    private ImageView heating_DeviceImage;

    @FXML
    private Label shutter_Name1;

    @FXML
    private Label shutter_Name2;

    @FXML
    private Label shutter_Name3;

    @FXML
    private ImageView shutter_CollectiveUpButton;

    @FXML
    private Label shutter_Name4;

    @FXML
    private ImageView shutter_DeleteDeviceButton;

    @FXML
    private ImageView thermometer_EditDeviceButton;

    @FXML
    private ImageView heating_DeleteDeviceButton;

    @FXML
    private Label weatherstation_Rainfall;

    @FXML
    private ImageView shutter_MoveUp4;

    @FXML
    private ImageView shutter_MoveUp3;

    @FXML
    private ImageView shutter_MoveUp2;

    @FXML
    private ImageView shutter_MoveUp1;

    @FXML
    private ImageView shutter_StepDown1;

    @FXML
    private ImageView shutter_StepDown2;

    @FXML
    private Label weatherstation_Name;

    @FXML
    private ImageView weatherstation_AddDeviceButton;

    @FXML
    private Label weatherstation_Manufacturer;

    @FXML
    private ImageView heating_EditDeviceButton;

    @FXML
    private ImageView thermometer_DeviceImage;

    @FXML
    private Label heating_Name;

    @FXML
    private TextField heating_TemperatureInput;

    private SmartHomeManagerWebServices wsProvider = null;
    private UserTransferObject userTransferObject = new UserTransferObject();


    public void initialize(){
        statusMessage.setText("");
        heating_PowerState.setText("");
        heating_Manufacturer.setText("");
        heating_Temperature.setText("");
        heating_TemperatureInput.setVisible(false);
        heating_Name.setText("");
        heating_Serialnumber.setText("");
        heating_Mode.setText("");
        heating_Model.setText("");
        heating_DeviceImage.setVisible(false);

        shutter_Name1.setText("");
        shutter_Name2.setVisible(false);
        shutter_Name3.setVisible(false);
        shutter_Name4.setVisible(false);
        shutter_Serialnumber1.setText("");
    }

    public void heating_PowerButton_mouseReleased(){
        if(testOrEstablishConnection()) {
            if (wsProvider.getHeatingData(userTransferObject).getPowerState() == Power.OFF) {
                CommandResponseObject response = wsProvider.switchHeatingOn(userTransferObject);

                if (response.getResponseCode() == ResponseCode.SWITCHED_ON)
                    heating_PowerState.setText("Eingeschaltet");
            } else {
                CommandResponseObject response = wsProvider.switchHeatingOff(userTransferObject);

                if (response.getResponseCode() == ResponseCode.SWITCHED_ON)
                    heating_PowerState.setText("Ausgeschaltet");
            }
        }
    }

    public void heating_AddDeviceButton_mouseReleased(){
        //TODO: Open Add-Device-View
    }

    public void heating_EditDeviceButton_mouseReleased(){
        //TODO: Open Edit-View
    }

    public void heating_DeleteDeviceButton_mouseReleased(){
        //TODO: Delete Device, stop Connection, etc.
    }

    public void shutter_CollectiveDownButton_mouseReleased(){
        if(testOrEstablishConnection()) {
            wsProvider.moveAllShuttersDown(userTransferObject);
            //TODO: Show Message
        }
    }

    public void shutter_CollectiveUpButton_mouseReleased(){
        if(testOrEstablishConnection()) {
            wsProvider.moveAllShuttersUp(userTransferObject);
            //TODO: Show Message
        }
    }

    public void shutter_AddDeviceButton_mouseReleased(){
        //TODO: Open Add-Device-View
    }

    public void shutter_EditDeviceButton_mouseReleased(){
        //TODO: Open Edit-View
    }

    public void shutter_DeleteDeviceButton_mouseReleased(){
        //TODO: Delete Device, stop Connection, etc.
    }

    public void shutter_StepUp1_mouseReleased(){
        if(testOrEstablishConnection()) {
            ShutterTransferObject shutterTransferObject = new ShutterTransferObject();
            shutterTransferObject.setShutterID("1");
            shutterTransferObject.setMoveComplete(false);

            wsProvider.moveShutterUp(userTransferObject, shutterTransferObject);
            //TODO: Show Message
        }
    }

    public void shutter_StepUp2_mouseReleased(){
        //TODO: Make this realistic
    }

    public void shutter_StepUp3_mouseReleased(){
        //TODO: Make this realistic
    }

    public void shutter_StepUp4_mouseReleased(){
        //TODO: Make this realistic
    }

    public void shutter_StepDown1_mouseReleased(){
        if(testOrEstablishConnection()) {
            ShutterTransferObject shutterTransferObject = new ShutterTransferObject();
            shutterTransferObject.setShutterID("1");
            shutterTransferObject.setMoveComplete(false);

            wsProvider.moveShutterDown(userTransferObject, shutterTransferObject);
            //TODO: Show Message
        }
    }

    public void shutter_StepDown2_mouseReleased(){
        //TODO: Make this realistic
    }

    public void shutter_StepDown3_mouseReleased(){
        //TODO: Make this realistic
    }

    public void shutter_StepDown4_mouseReleased(){
        //TODO: Make this realistic
    }

    public void shutter_MoveUp1_mouseReleased(){
        if(testOrEstablishConnection()) {
            ShutterTransferObject shutterTransferObject = new ShutterTransferObject();
            shutterTransferObject.setShutterID("1");
            shutterTransferObject.setMoveComplete(true);

            wsProvider.moveShutterUp(userTransferObject, shutterTransferObject);
            //TODO: Show Message
        }
    }

    public void shutter_MoveUp2_mouseReleased(){
        //TODO: Make this realistic
    }

    public void shutter_MoveUp3_mouseReleased(){
        //TODO: Make this realistic
    }

    public void shutter_MoveUp4_mouseReleased(){
        //TODO: Make this realistic
    }

    public void shutter_MoveDown1_mouseReleased(){
        if(testOrEstablishConnection()) {
            ShutterTransferObject shutterTransferObject = new ShutterTransferObject();
            shutterTransferObject.setShutterID("1");
            shutterTransferObject.setMoveComplete(true);

            wsProvider.moveShutterDown(userTransferObject, shutterTransferObject);
            //TODO: Show Message
        }
    }

    public void shutter_MoveDown2_mouseReleased(){
        //TODO: Make this realistic
    }
    public void shutter_MoveDown3_mouseReleased(){
        //TODO: Make this realistic
    }

    public void shutter_MoveDown4_mouseReleased(){
        //TODO: Make this realistic
    }

    public void weatherstation_AddDeviceButton_mouseReleased(){
        //TODO: Open Add-Device-View
    }

    public void weatherstation_EditDeviceButton_mouseReleased(){
        //TODO: Open Edit-View
    }

    public void weatherstation_DeleteDeviceButton_mouseReleased(){
        //TODO: Delete Device, stop Connection, etc.
    }

    public void thermometer_AddDeviceButton_mouseReleased(){
        //TODO: Open Add-Device-View
    }

    public void thermometer_EditDeviceButton_mouseReleased(){
        //TODO: Open Edit-View
    }

    public void thermometer_DeleteDeviceButton_mouseReleased(){
        //TODO: Delete Device, stop Connection, etc.
    }

    public void undoButton_mouseReleased(){
        if(testOrEstablishConnection()) {
            wsProvider.undoLastCommand(userTransferObject);
            //TODO: Show message
        }
    }

    public void heating_Temperature_mouseEntered(){
        heating_TemperatureInput.setVisible(true);
        heating_TemperatureInput.setText(heating_Temperature.getText());
    }

    public void heating_Temperature_mouseExited(){
        String oldValue = heating_Temperature.getText();
        String newValue = heating_TemperatureInput.getText();

            if (! oldValue.equals(newValue)){
                try {
                    double temperature = Double.parseDouble(newValue);

                    if(testOrEstablishConnection()) {
                        wsProvider.setHeatingTemperature(userTransferObject, temperature);
                        heating_Temperature.setText(newValue);
                    }
                }
                catch (Exception e) {
                    logMessage("Ungültiger Zahlenwert!");
                }
            }

        heating_TemperatureInput.setVisible(false);
    }

    public void refreshButton_mouseReleased(){
        if(testOrEstablishConnection()) {
            ShutterTransferObject shutterTransferObject = new ShutterTransferObject();
            shutterTransferObject.setShutterID("1");

            updateHeatingData(wsProvider.getHeatingData(userTransferObject));
            updateShutterData(wsProvider.getShutterData(userTransferObject, shutterTransferObject));
            updateWeatherstationData(wsProvider.getWeatherStationData(userTransferObject));
            updateThermometerData(wsProvider.getThermometerData(userTransferObject));
        }
    }

    public void connectionIndicatorImage_mouseReleased(){
        testOrEstablishConnection();
    }

    public void updateHeatingData(HeatingTransferObject heatingTransferObject){
        heating_DeviceImage.setVisible(true);

        switch (heatingTransferObject.getManufacturer())
        {
            case VIESSMANN:
                heating_DeviceImage.setImage(new Image("@../../resources/Vitorodens.png"));
                break;
            case VAILLANT:
                heating_DeviceImage.setImage(new Image("@../../resources/VaillantXY.png"));
                break;
            case BUDERUS:
                heating_DeviceImage.setImage(new Image("@../../resources/BuderusXY.png"));
                break;
        }

        heating_Manufacturer.setText(heatingTransferObject.getManufacturerT());
        heating_Model.setText(heatingTransferObject.getModel());
        heating_Mode.setText(heatingTransferObject.getMode());
        heating_Serialnumber.setText(heatingTransferObject.getSerialnumber());
        heating_PowerState.setText(heatingTransferObject.getPowerStateT());
        heating_Name.setText(heatingTransferObject.getHeatingName());
        heating_Temperature.setText(heatingTransferObject.getTemperature() + " " + heatingTransferObject.getTemperatureUnit());
    }

    public void updateShutterData(ShutterTransferObject shutterTransferObject){
        shutter_DeviceImage.setVisible(true);
        shutter_Manufacturer1.setText(shutterTransferObject.getManufacturerT());
        shutter_Model1.setText(shutterTransferObject.getModel());
        shutter_Serialnumber1.setText(shutterTransferObject.getSerialnumber());
        shutter_Name1.setText(shutterTransferObject.getShutterID());
    }

    public void updateThermometerData(ThermometerTransferObject thermometerTransferObject){
        thermometer_DeviceImage.setVisible(true);
        thermometer_Manufacturer.setText(thermometerTransferObject.getManufacturerT());
        thermometer_Model.setText(thermometerTransferObject.getModel());
        thermometer_Name.setText(thermometerTransferObject.getName());
        thermometer_Serialnumber.setText(thermometerTransferObject.getSerialnumber());
        thermometer_Temperature.setText(thermometerTransferObject.getTemperature() + " " + thermometerTransferObject.getTemperatureUnitT());
    }

    public void updateWeatherstationData(WeatherStationTransferObject weatherStationTransferObject){
        weatherstation_DeviceImage.setVisible(true);
        weatherstation_Manufacturer.setText(weatherStationTransferObject.getManufacturerT());
        weatherstation_Model.setText(weatherStationTransferObject.getModel());
        weatherstation_Name.setText(weatherStationTransferObject.getName());
        weatherstation_Serialnumber.setText(weatherStationTransferObject.getSerialnumber());
        weatherstation_Temperature.setText(weatherStationTransferObject.getOutdoorTemperature() + " " + weatherStationTransferObject.getOutdoorTemperatureUnitT());
        weatherstation_Pressure.setText(weatherStationTransferObject.getAirPressure() + " " + weatherStationTransferObject.getAirPressureUnitT());
        weatherstation_Rainfall.setText(weatherStationTransferObject.getRainfallAmount() + " " + weatherStationTransferObject.getRainfallAmountUnitT());
        weatherstation_WindVelocity.setText(weatherStationTransferObject.getWindVelocity() + " " + weatherStationTransferObject.getWindVelocityUnitT());
    }

    public boolean testOrEstablishConnection(){
        //if(wsProvider == null) {
            try {
                wsProvider = MySmartHomeServiceProvider.getInstance().getPort();
                logMessage("Verbindung zum SmartHomeManager wurde hergestellt.");
                connectionIndicatorImage.setImage(new Image("@../../resources/connectionIndicator_connected.png"));
                return true;
            }
            catch (Exception e) {
                wsProvider = null;
                logMessage("Verbindung zum SmartHomeManager konnte nicht hergestellt werden.");
                connectionIndicatorImage.setImage(new Image("@../../resources/connectionIndicator_disconnected.png"));
                return false;
            }
       /* }
        else {
            SmartHomeClientLogger.log("Verbindung zum SmartHomeManager besteht bereits.");
            connectionIndicatorImage.setImage(new Image("@../../resources/connectionIndicator_connected.png"));
            return true;
        }*/
    }

    public void logMessage(String message){
        statusMessage.setText(message);
        SmartHomeClientLogger.log(message);
    }
}
