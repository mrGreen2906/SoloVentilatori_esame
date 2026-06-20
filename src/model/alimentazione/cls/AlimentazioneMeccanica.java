package model.alimentazione.cls;

import model.alimentazione.AlimentazioneTipoEnum;
import model.alimentazione.abs.AbstractAlimentazione;

public class AlimentazioneMeccanica extends AbstractAlimentazione {
    public AlimentazioneMeccanica() {
        super(AlimentazioneTipoEnum.MECCANICA, 1);
    }
}
