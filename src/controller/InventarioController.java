package controller;

import model.Inventario;
import view.InventarioView;
import view.VetrinaView;

import java.util.List;

public class InventarioController {
    InventarioView v;


    Inventario m;

    public InventarioController(){
        this.m=Inventario.getIstanza();
        this.v =new InventarioView(m.Info());
    }

    public void setInfo(){
        this.v.setInfo(m.Info());
    }


    public InventarioView getV() {
        return v;
    }

    public void aggiungiSoldi(){
        this.m.aggiungiSoldi();
        setInfo();
    }

    public void prossimoMese(){
        this.m.aggiornaMese();
        setInfo();
    }

}
