package sample;

import connection.webservices.consumer.stubs.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    public static void main(String[] args) {
        //launch(args);
        /*ChrisWebServices port = new MyWebServicesService().getChrisWebServicesPort();
        System.out.printf( "%s Dein BMI ist %.1f%n",
                port.hello( "Chris" ),
                port.bodyMassIndex( 183, 84 ) );*/
        System.out.println("Hello World!");

        SmartHomeManagerWebServices service = new SmartHomeManagerWebServiceDescriptorService().getSmartHomeManagerWebServicesPort();

        //Object for authorization
        UserTransferObject o = new UserTransferObject();

        //Test some stuff..
        //System.out.println("" + service.getMessage(ResponseCode.SHUTTER_COULD_NOT_BE_CREATED));

        CommandResponseObject responseObject = service.moveShutterUp(o, new ShutterTransferObject());
        System.out.println(responseObject.getMessage());
        //service.login(o);

        //Read and print logs
        StringArray array = service.readLogs(o,1);

        for (String item: array.getItem()) {
            System.out.println(item);
        }
    }
}
