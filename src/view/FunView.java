package view;

import controller.FunController;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

public class FunView extends HBox {
    Circle cer;
    VBox v;

    public FunView(String tipo, String info, String costo, FunController c){
        cer= new Circle(40);
        cer.setStrokeWidth(5);
        setColoreCerchio(false);
        setBordo(true, false);
        v = new VBox();
        Text t1= new Text(tipo);
        Text t2 = new Text(info);
        Text t3 = new Text(costo);

        this.v.getChildren().add(t1);
        this.v.getChildren().add(t2);
        this.v.getChildren().add(t3);

        this.getChildren().add(cer);
        this.getChildren().add(v);
        this.setSpacing(10);
        this.setOnMouseClicked(event -> {c.operazione();});

    }

    public void setColoreCerchio(boolean b){
            cer.setFill(b ? Color.RED : Color.BLUE);
    }

    public void setBordo(boolean bastano, boolean abbonato){
        if(abbonato)
            cer.setStroke(bastano ? Color.BLACK : Color.GRAY);
        else
            cer.setStroke(Color.BLACK);
    }


}
