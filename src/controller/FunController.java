package controller;


import model.funs.FunInterface;
import view.FunView;
import view.MainView;

public class FunController{
    FunInterface i;
    FunView v;

    public FunController(FunInterface f){
        this.i=f;
        this.v = new FunView(i.getTipo(), i.getInfo(), i.getCostoInfo(), this);
    }

    public FunInterface getI() {
        return i;
    }

    public FunView getV() {
        return v;
    }

    public void operazione(){
        InventarioController ic = MainView.getInstance().getI();
        if (ic.isAbbonato(this.i)){
            ic.rimuovi(this.i);
        } else {
            ic.aggiungi(this.i);
        }
        aggiornaColori();
        MainView.getInstance().getI().setInfo();
    }

    public void aggiornaColori(){
        InventarioController ic = MainView.getInstance().getI();
        this.v.setColoreCerchio(ic.isAbbonato(this.i));
        this.v.setBordo(ic.bastanoFondi(this.i));
    }
}
