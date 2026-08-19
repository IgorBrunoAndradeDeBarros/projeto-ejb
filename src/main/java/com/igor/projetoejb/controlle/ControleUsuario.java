package com.igor.projetoejb.controlle;

import com.igor.projetoejb.ejb.BeanUsuario;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named(value = "controleUsuario")
@SessionScoped
public class ControleUsuario implements Serializable  {

    @EJB
    private BeanUsuario beanUsuario;

    public ControleUsuario() {}

    public String informaUsuario(){
        return "index";
    }

    public BeanUsuario getBeanUsuario() {
        return beanUsuario;
    }

    public void setBeanUsuario(BeanUsuario beanUsuario) {
        this.beanUsuario = beanUsuario;
    }
}
