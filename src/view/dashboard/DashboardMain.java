package view.dashboard;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DashboardMain extends Application {

    private Parent parentRoot;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        parentRoot = FXMLLoader.load(getClass().getResource("DashboardView.fxml"));
        primaryStage.setTitle("SmartHomeClient");
        primaryStage.setScene(new Scene(parentRoot, 1000, 600));
        primaryStage.show();
    }
}
