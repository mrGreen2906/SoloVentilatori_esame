package view;

import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

public class InventarioView extends HBox {
    Text t;
    public InventarioView(String info){
        t=new Text(info);
        this.getChildren().add(t);
    }

    public void setInfo(String s){
        this.t.setText(s);
    }
}
