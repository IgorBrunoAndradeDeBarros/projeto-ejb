package com.igor.projetoejb.ejb;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateful;
import javax.ejb.StatefulTimeout;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

@Stateful
@StatefulTimeout(unit = TimeUnit.MINUTES, value = 30)
public class BeanUsuario implements Serializable {

    private String usuario;

    public BeanUsuario() {
    }

    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @PostConstruct
    public void iniciar(){
        System.out.println("BeanDataHora iniciada");
    }

    @PreDestroy
    private void destruir(){
        System.out.println("BeanDataHora destruida");
    }
}
