package controller;

import model.Inventario;
import model.funs.FunInterface;
import view.InventarioView;
import view.MainView;
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
        MainView.getInstance().getV().aggiornaVentilatori();
    }

    public void prossimoMese(){
        this.m.aggiornaMese();
        setInfo();
        MainView.getInstance().getV().aggiornaVentilatori();
    }

    public boolean isAbbonato(FunInterface f){
        return this.m.isAbbonato(f);
    }

    public boolean bastanoFondi(FunInterface f){
        return this.m.fondiSufficienti(f);
    }

    public void aggiungi(FunInterface f){
        this.m.aggiungiVentilatore(f);
        MainView.getInstance().getV().aggiornaVentilatori();
    }

    public void rimuovi(FunInterface f){
        this.m.rimuoviVentilatore(f);
        setInfo();
        MainView.getInstance().getV().aggiornaVentilatori();
    }

}
