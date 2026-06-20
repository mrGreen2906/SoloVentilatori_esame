package model.funs.cls;

import model.alimentazione.abs.AbstractAlimentazione;
import model.alimentazione.abs.AbstractElettrico;
import model.funs.abs.AbstractFun;
import model.funs.enums.FunNomeEnum;
import model.funs.enums.FunTipoEnum;

public class FunSoffitto extends AbstractFun {
    public FunSoffitto(FunNomeEnum n, AbstractElettrico a) {
        super(n);
        this.prezzo+=2;
        this.ali=a;
        this.tipoenum=FunTipoEnum.SOFFITTO;
    }
}
