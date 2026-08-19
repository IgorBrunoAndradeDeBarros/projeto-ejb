package com.igor.projetoejb.controlle;

import com.igor.projetoejb.ejb.BeanDataHora;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named(value = "controleDataHora")
@RequestScoped
public class ControleDataHora implements Serializable {

    @EJB
    private BeanDataHora beanDataHora;
    @Inject
    ControleUsuario controleUsuario;

    public ControleDataHora() {
    }

    public String getNomeUsuario(){
        return controleUsuario.getBeanUsuario().getUsuario() != null ?
                controleUsuario.getBeanUsuario().getUsuario() : "usuario nao informado";
    }

    public BeanDataHora getBeanDataHora() {
        return beanDataHora;
    }

    public void setBeanDataHora(BeanDataHora beanDataHora) {
        this.beanDataHora = beanDataHora;
    }

    public ControleUsuario getControleUsuario() {
        return controleUsuario;
    }

    public void setControleUsuario(ControleUsuario controleUsuario) {
        this.controleUsuario = controleUsuario;
    }
}
