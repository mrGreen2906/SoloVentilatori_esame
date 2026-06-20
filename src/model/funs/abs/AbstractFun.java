package model.funs.abs;

import model.alimentazione.abs.AbstractAlimentazione;
import model.funs.FunInterface;
import model.funs.enums.FunNomeEnum;
import model.funs.enums.FunTipoEnum;

public abstract class AbstractFun implements FunInterface {

    static final int PREZZO_INIZIALE = 10;
    FunNomeEnum nome;
    protected int prezzo;
    protected FunTipoEnum tipoenum;
    protected AbstractAlimentazione ali;

    protected AbstractFun(FunNomeEnum n) {
        this.nome = n;
        this.prezzo = PREZZO_INIZIALE;


    }


    public String getNome() {
        return this.nome + "";
    }

    public String getInfo() {
        return "Tipo FUN: " + this.getTipo() + " Alim: " + this.ali;
    }
    public FunTipoEnum getTipo(){return this.tipoenum;}
    public String getCosto(){ return ali.totCosto(this.prezzo)+"";}
    public String getCostoInfo() {
        return "Costo: " + this.getCosto();
    }
}
