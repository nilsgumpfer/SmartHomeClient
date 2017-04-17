package view.adddevice;

import connection.webservices.consumer.stubs.SmartHomeManagerWebServiceDescriptorService;
import connection.webservices.consumer.stubs.SmartHomeManagerWebServices;
import connection.webservices.consumer.stubs.StringArray;
import connection.webservices.consumer.stubs.UserTransferObject;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AddDeviceMain extends Application {

    private Parent parentRoot;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        parentRoot = FXMLLoader.load(getClass().getResource("AddDeviceView.fxml"));
        primaryStage.setTitle("SmartHomeClient - Gerät hinzufügen");
        primaryStage.setScene(new Scene(parentRoot, 1000, 600));
        primaryStage.show();
    }
}
