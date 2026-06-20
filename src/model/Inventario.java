package model;

import model.funs.FunInterface;

import java.util.ArrayList;

public class Inventario {
    static final int CONTANTE_INIZ =100;
    int contante, mesi, spesaMese;
    ArrayList<FunInterface> lista;
    static Inventario i;
    private Inventario(){
        this.contante=CONTANTE_INIZ;
        this.spesaMese=0;
        this.mesi=0;
        this.lista = new ArrayList<>();
    }

    public static Inventario getIstanza(){
        if(i==null)
            i=new Inventario();
        return i;
    }
}
