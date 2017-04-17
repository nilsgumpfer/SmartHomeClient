package sample;

import connection.webservices.consumer.stubs.SmartHomeManagerWebServiceDescriptorService;
import connection.webservices.consumer.stubs.SmartHomeManagerWebServices;
import connection.webservices.consumer.stubs.StringArray;
import connection.webservices.consumer.stubs.UserTransferObject;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private Parent parentRoot;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        parentRoot = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(parentRoot, 1000, 600));
        primaryStage.show();

        SmartHomeManagerWebServices smartHomeManagerWebServicesPort = new SmartHomeManagerWebServiceDescriptorService().getSmartHomeManagerWebServicesPort();

        //Object for authorization
        UserTransferObject o = new UserTransferObject();

        //Test some stuff..
        //System.out.println("" + service.getMessage(ResponseCode.SHUTTER_COULD_NOT_BE_CREATED));

        //CommandResponseObject responseObject = service.moveShutterUp(o, new ShutterTransferObject());
        //System.out.println(responseObject.getMessage());
        //service.login(o);

        //Read and print logs
        StringArray array = smartHomeManagerWebServicesPort.readLogs(o,10);
    }
}
