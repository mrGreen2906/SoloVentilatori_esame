package view;

import Main.Main;
import controller.InventoryController;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MainView extends BorderPane {
    static MainView m;
    InventoryController i;

    private MainView(){
        Button b1 = new Button("Ordina per Tipo");
        Button b2 = new Button("Ordina per Costo");
        VBox box = new VBox();
        box.getChildren().add(b1);
        box.getChildren().add(b2);
        box.setSpacing(10);
        this.setRight(box);


    }

    public static MainView getInstance(){
        if(m==null)
            m=new MainView();
        return m;
    }

    public InventoryController getI() {
        return i;
    }

}
