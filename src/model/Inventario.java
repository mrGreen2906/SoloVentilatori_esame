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

    public String Info(){
        return "Capitale: "+contante+" Spesa Mensile: "+spesaMese+" Mesi Trascorsi: "+mesi;
    }

    public void aggiornaMese(){
        this.mesi+=1;
        this.contante-= this.spesaMese;
    }
    public void aggiungiSoldi(){
        this.contante+=CONTANTE_INIZ;
    }

    public int getContante() {
        return contante;
    }

    public int getMesi() {
        return mesi;
    }

    public int getSpesaMese() {
        return spesaMese;
    }

    public void setSpesaMese(int spesaMese) {
        this.spesaMese += spesaMese;
    }

    public void aggiungiVentilatore(FunInterface i){
        this.setSpesaMese(i.getCosto());
        this.lista.add(i);

    }

    public void rimuoviVentilatore(FunInterface i){
        this.setSpesaMese(-i.getCosto());
        this.lista.remove(i);
    }

    public ArrayList<FunInterface> getLista() {
        return lista;
    }

}
