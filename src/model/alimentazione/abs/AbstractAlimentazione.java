package model.alimentazione.abs;

import model.alimentazione.AlimentazioneTipoEnum;

public abstract class AbstractAlimentazione {
    protected AlimentazioneTipoEnum t;
    protected int mul;

    protected AbstractAlimentazione(AlimentazioneTipoEnum t, int m){
        this.t=t;
        this.mul=m;
    }

    public int totCosto(int c){return c*this.mul;}

    public String toString(){
        return "Alimentazione:" + this.t.toString();
    }


}
