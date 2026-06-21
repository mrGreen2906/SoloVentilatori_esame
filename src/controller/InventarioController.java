package controller;

import javafx.scene.control.Alert;
import model.Inventario;
import model.exceptions.NoMoneyException;
import model.funs.FunInterface;
import view.InventarioView;
import view.MainView;


public class InventarioController {
    InventarioView v;
    Inventario m;

    public InventarioController() {
        this.m = Inventario.getIstanza();
        this.v = new InventarioView(m.Info());
    }

    public void setInfo() {
        this.v.setInfo(m.Info());
    }


    public InventarioView getV() {
        return v;
    }

    public void aggiungiSoldi() {
        this.m.aggiungiSoldi();
        setInfo();
        MainView.getInstance().getV().aggiornaVentilatori();
    }

    public void prossimoMese() {

        try {
            this.m.aggiornaMese();
            setInfo();
            MainView.getInstance().getV().aggiornaVentilatori();
        } catch (NoMoneyException e) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Fondi insufficienti, rimosso il ventilatore più costoso");
            a.showAndWait();
        }
    }

    public boolean isAbbonato(FunInterface f) {
        return this.m.isAbbonato(f);
    }

    public boolean bastanoFondi(FunInterface f) {
        return this.m.fondiSufficienti(f);
    }

    public void aggiungi(FunInterface f) {
        this.m.aggiungiVentilatore(f);
        setInfo();
    }

    public void rimuovi(FunInterface f) {
        this.m.rimuoviVentilatore(f);
        setInfo();
    }

}
