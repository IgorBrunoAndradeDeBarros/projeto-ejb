package com.igor.projetoejb;

import com.igor.projetoejb.ejb.BeanDataHora;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/teste")
public class TesteResource {
    @EJB
    private BeanDataHora beanDataHora;

    @GET
    @Produces("text/plain")
    public String executarTeste() {
        String dataHora = beanDataHora.getDataHoraServidor();

        return "A data e hora do servidor EJB é: " + dataHora;
    }
}