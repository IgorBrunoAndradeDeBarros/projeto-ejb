package com.igor.projetoejb;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;
import java.io.Serializable;
import java.text.SimpleDateFormat;

@Stateless
public class BeanDataHora implements Serializable {

    public BeanDataHora() {
        System.out.println("Contrutor do bean utilizado");
    }
    public String getDataHoraServidor(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return sdf.format(new java.util.Date());
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
