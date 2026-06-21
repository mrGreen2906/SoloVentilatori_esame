package controller;


import model.funs.FunInterface;
import view.FunView;

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

    }
}
