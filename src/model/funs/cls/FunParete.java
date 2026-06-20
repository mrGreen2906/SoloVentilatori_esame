package model.funs.cls;

import model.alimentazione.abs.AbstractAlimentazione;
import model.funs.abs.AbstractFun;
import model.funs.enums.FunNomeEnum;
import model.funs.enums.FunTipoEnum;

public class FunParete extends AbstractFun {
    public FunParete(FunNomeEnum n, AbstractAlimentazione a) {
        super(n);
        this.prezzo+=20;
        this.ali=a;
        this.tipoenum=FunTipoEnum.PARETE;
    }
}
