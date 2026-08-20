package com.igor.projetoejb.ejb;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.io.Serializable;
import java.text.SimpleDateFormat;

@Stateless
public class BeanDataHora implements Serializable {

    @EJB
    private BeanContador beanContador;

    public BeanDataHora() {
        System.out.println("Contrutor do bean utilizado");
    }

    public String getDataHoraServidor(){
        beanContador.incrementaContador();
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

    public BeanContador getBeanContador() {
        return beanContador;
    }

    public void setBeanContador(BeanContador beanContador) {
        this.beanContador = beanContador;
    }

}
