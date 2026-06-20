package model.funs;

import model.funs.enums.FunTipoEnum;

public interface FunInterface {
    public String getNome();

    public String getInfo();
    public FunTipoEnum getTipo();
    public String getCosto();
    public String getCostoInfo();

}
