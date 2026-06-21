package controller.compators;

import controller.FunController;
import model.funs.comparatori.FunComparatorByTipo;

import java.util.Comparator;

public class FunComTipController implements Comparator<FunController> {
    @Override
    public int compare(FunController o1, FunController o2) {
        return new FunComparatorByTipo().compare(o1.getI(), o2.getI());
    }
}
