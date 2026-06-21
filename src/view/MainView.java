package view;

import controller.InventarioController;
import controller.VetrinaController;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MainView extends BorderPane {
    static MainView m;

    InventarioController i;
    VetrinaController v;

    private MainView() {
        i = new InventarioController();
        this.setTop(i.getV());

        v = new VetrinaController();
        this.setCenter(v.getV());

        Button b1 = new Button("Ordina per Tipo");
        b1.setOnMouseClicked(event -> {
            v.ordinaVentilatoriTipo();
        });
        Button b2 = new Button("Ordina per Costo");
        b2.setOnMouseClicked(event -> {
            v.ordinaVentilatoriCosto();
        });
        VBox box = new VBox();
        box.getChildren().add(b1);
        box.getChildren().add(b2);
        box.setSpacing(10);
        this.setRight(box);

        Button b3 = new Button("Prox Mese");
        b3.setOnMouseClicked(event -> {
            i.prossimoMese();
        });
        Button b4 = new Button("+100 Soldi");
        b4.setOnMouseClicked(event -> {
            i.aggiungiSoldi();
        });
        VBox box2 = new VBox();
        box2.getChildren().add(b3);
        box2.getChildren().add(b4);
        box2.setSpacing(10);
        this.setLeft(box2);


    }

    public static MainView getInstance() {
        if (m == null)
            m = new MainView();
        return m;
    }

    public InventarioController getI() {
        return i;
    }

    public VetrinaController getV(){
        return v;
    }



}
