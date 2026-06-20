package model.funs.comparatori;

import model.funs.FunInterface;

import java.util.Comparator;

public class FunComparatorByTipo implements Comparator<FunInterface> {
    @Override
    public int compare(FunInterface o1, FunInterface o2) {
        int r1 = o1.getTipo().compareTo(o2.getTipo());
        if(r1==0)
            return Integer.compare(o1.getCosto(),o2.getCosto());
        return r1;
    }
}
