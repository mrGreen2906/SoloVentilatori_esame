package model.alimentazione.abs;

import model.alimentazione.AlimentazioneTipoEnum;

public abstract class AbstractElettrico extends AbstractAlimentazione {
    protected AbstractElettrico(AlimentazioneTipoEnum t, int m) {
        super(t, m);
    }
}
