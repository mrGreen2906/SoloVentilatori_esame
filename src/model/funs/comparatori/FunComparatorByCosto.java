package model.funs.comparatori;

import model.funs.FunInterface;

import java.util.Comparator;

public class FunComparatorByCosto implements Comparator<FunInterface> {
    @Override
    public int compare(FunInterface o1, FunInterface o2) {
        int r1 = o1.getCosto().compareTo(o2.getCosto());
        if(r1==0)
            return new FunComparatorByTipo().compare(o1,o2);
        return r1;
    }
}
