package model.funs.cls;

import model.alimentazione.abs.AbstractAlimentazione;
import model.funs.abs.AbstractFun;
import model.funs.enums.FunNomeEnum;
import model.funs.enums.FunTipoEnum;

public class FunPiantana extends AbstractFun {
    public FunPiantana(FunNomeEnum n, AbstractAlimentazione a) {
        super(n);
        this.prezzo+=10;
        this.ali=a;
        this.tipoenum=FunTipoEnum.PIANTANA;
    }
}
