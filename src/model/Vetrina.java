package model;

import model.alimentazione.AlimentazioneTipoEnum;
import model.alimentazione.cls.AlimentazioneBatteria;
import model.alimentazione.cls.AlimentazioneMeccanica;
import model.alimentazione.cls.AlimentazionePresa;
import model.funs.FunInterface;
import model.funs.cls.FunParete;
import model.funs.cls.FunPiantana;
import model.funs.cls.FunSoffitto;
import model.funs.enums.FunNomeEnum;

import java.util.ArrayList;

public class Vetrina extends ArrayList<FunInterface> {
    static Vetrina istance;

    private Vetrina() {
        FunPiantana f1 = new FunPiantana(FunNomeEnum.ARIETE, new AlimentazioneBatteria());
        FunParete f2 = new FunParete(FunNomeEnum.BOSH, new AlimentazionePresa());
        FunParete f3 = new FunParete(FunNomeEnum.BOSH, new AlimentazioneMeccanica());
        FunSoffitto f4 = new FunSoffitto(FunNomeEnum.BOSH, new AlimentazioneBatteria());
        FunSoffitto f5 = new FunSoffitto(FunNomeEnum.PARKSIDE, new AlimentazionePresa());

        this.add(f1);
        this.add(f2);
        this.add(f3);
        this.add(f4);
        this.add(f5);


    }

    public static Vetrina getIstance() {
        if (istance == null)
            istance = new Vetrina();
        return istance;
    }
}
