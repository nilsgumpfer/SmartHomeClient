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

        //System.out.printf( "Dein BMI ist %.1f%n", service.bodyMassIndex(183,74));
        UserTransferObject o = new UserTransferObject();
        o.setInt1(17);
        o.setVar1("Das ist ein relativ langer Text - nicht.");
        StringArray array = service.readLogs(o,1);

        for (String item: array.getItem()) {
            System.out.println(item);
        }
    }
}
