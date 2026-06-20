package model.funs.comparatori;

import model.funs.FunInterface;

import java.util.Comparator;

public class FunComparatorByCosto implements Comparator<FunInterface> {
    @Override
    public int compare(FunInterface o1, FunInterface o2) {
        int r1 = Integer.compare(o1.getCosto(),o2.getCosto());
        if(r1==0)
            return o1.getTipo().compareTo(o2.getTipo());
        return r1;
    }
}
