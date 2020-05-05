/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import comptoirs.model.dao.ClientFacade;
import comptoirs.model.dao.LigneFacade;
import comptoirs.model.dao.ProduitFacade;
import comptoirs.model.entity.Client;
import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.mvc.View;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Controller
@Path("pageClient")
public class PageClientController {

    @Inject
    ClientFacade cFacade;

    @Inject
    SessionClient client;

    @Inject
    ProduitFacade pFacade;

    @Inject
    LigneFacade lFacade;

    @Inject
    Models models;
    
    @GET
    @View("pageClient.jsp")
    public void show() {
        Client c = cFacade.find(client.getCodeClient());
        models.put("client", c);
    }
}
