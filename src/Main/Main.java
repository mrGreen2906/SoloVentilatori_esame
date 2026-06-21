package Main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.MainView;

public class Main extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        MainView m=  MainView.getInstance();
        stage.setTitle("Fun Ventilatori");
        stage.setScene(new Scene(m,600,500));
        stage.show();

    }
    public static void main(String[] args){launch(args);}
}