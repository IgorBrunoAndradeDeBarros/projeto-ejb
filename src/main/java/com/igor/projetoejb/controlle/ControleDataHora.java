package com.igor.projetoejb.controlle;

import com.igor.projetoejb.ejb.BeanDataHora;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named(value = "controleDataHora")
@RequestScoped
public class ControleDataHora implements Serializable {

    @EJB
    BeanDataHora beanDataHora;

    public ControleDataHora() {
    }

    public BeanDataHora getBeanDataHora() {
        return beanDataHora;
    }

    public void setBeanDataHora(BeanDataHora beanDataHora) {
        this.beanDataHora = beanDataHora;
    }
}
