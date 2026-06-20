package model.alimentazione.cls;

import model.alimentazione.AlimentazioneTipoEnum;
import model.alimentazione.abs.AbstractElettrico;

public class AlimentazionePresa extends AbstractElettrico {
    public AlimentazionePresa() {
        super(AlimentazioneTipoEnum.PRESA, 2);
    }
}
