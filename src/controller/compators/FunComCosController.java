package controller.compators;

import controller.FunController;
import model.funs.comparatori.FunComparatorByCosto;

import java.util.Comparator;

public class FunComCosController implements Comparator<FunController> {
    @Override
    public int compare(FunController o1, FunController o2) {
        return new FunComparatorByCosto().compare(o1.getI(), o2.getI());
    }
}
