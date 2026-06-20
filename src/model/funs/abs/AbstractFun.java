package model.funs.abs;

import model.funs.FunInterface;
import model.funs.enums.FunNomeEnum;
import model.funs.enums.FunTipoEnum;

public abstract class AbstractFun implements FunInterface {

    static final int PREZZO_INIZIALE=10;
    FunNomeEnum nome;
    int prezzo;
    FunTipoEnum tipoenum;

    protected AbstractFun(FunNomeEnum n, FunTipoEnum t){
        this.nome=n;
        this.prezzo=PREZZO_INIZIALE;
        this.tipoenum=t;


    }


}
