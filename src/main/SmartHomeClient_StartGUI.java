package sample;

import connection.webservices.consumer.stubs.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ResourceBundle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        java.net.URL url = getClass().getResource("sample.fxml");
        Parent root = FXMLLoader.load(url);
        //primaryStage.setTitle("Hello World");
        //primaryStage.setScene(new Scene(root, 300, 275));
        //primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);

        System.out.println("Hello World!");

        SmartHomeManagerWebServices service = new SmartHomeManagerWebServiceDescriptorService().getSmartHomeManagerWebServicesPort();

        //Object for authorization
        UserTransferObject o = new UserTransferObject();

        //Test some stuff..
        //System.out.println("" + service.getMessage(ResponseCode.SHUTTER_COULD_NOT_BE_CREATED));

        //CommandResponseObject responseObject = service.moveShutterUp(o, new ShutterTransferObject());
        //System.out.println(responseObject.getMessage());
        //service.login(o);

        //Read and print logs
        StringArray array = service.readLogs(o,10);

        for (String item: array.getItem()) {
            System.out.println(item);
        }
    }
}
