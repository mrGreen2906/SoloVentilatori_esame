package controller;

import controller.compators.FunComCosController;
import controller.compators.FunComTipController;
import model.Vetrina;
import model.funs.FunInterface;
import model.funs.comparatori.FunComparatorByCosto;
import model.funs.comparatori.FunComparatorByTipo;
import view.VetrinaView;

import java.util.ArrayList;
import java.util.List;

public class VetrinaController {

    Vetrina m;
    VetrinaView v;
    List<FunController> cs;

    public VetrinaController() {
        this.m = Vetrina.getIstance();
        this.cs = new ArrayList<>();
        for (FunInterface f : this.m) {
            FunController fc = new FunController(f);
            this.cs.add(fc);
        }

    }


    private void drawView() {
        this.v = new VetrinaView();
        for (FunController fc : this.cs) {
            this.v.getChildren().add(fc.getV());


        }
    }


    public void aggiornaVentilatori(){
        for(FunController fc : this.cs)
            this.v.getChildren().add(fc.getV());
    }

    public void ordinaVentilatoriTipo(){
this.m.sort(new FunComparatorByTipo());
this.cs.sort(new FunComTipController());
drawView();
    }

    public void ordinaVentilatoriCosto(){
        this.m.sort(new FunComparatorByCosto());
        this.cs.sort(new FunComCosController());
        drawView();
    }
}
