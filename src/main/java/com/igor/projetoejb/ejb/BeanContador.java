package com.igor.projetoejb.ejb;

import javax.ejb.Singleton;
import java.io.Serializable;

@Singleton
public class BeanContador implements Serializable {

    private Integer contador;
    public BeanContador() {
        contador = 0;
    }
    public void incrementaContador(){
        contador++;
    }
    public Integer getContador() {
        return contador;
    }
    public void setContador(Integer contador) {
        this.contador = contador;
    }
}
