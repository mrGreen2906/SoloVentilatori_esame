package model.alimentazione.cls;

import model.alimentazione.AlimentazioneTipoEnum;
import model.alimentazione.abs.AbstractElettrico;

public class AlimentazioneBatteria extends AbstractElettrico {
    public AlimentazioneBatteria() {
        super(AlimentazioneTipoEnum.BATTERIA,3);
    }
}
