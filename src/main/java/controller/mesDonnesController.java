/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import comptoirs.model.dao.ClientFacade;
import comptoirs.model.entity.Client;
import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.mvc.View;
import javax.mvc.binding.BindingResult;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 *
 * @author Emma
 */
@Controller
@Path("mesDonnees")
@View("mesDonnees.jsp")
public class mesDonnesController {

    @Inject // Le DAO (auto-généré) qui gère les entités "Client"
    ClientFacade facade;
    @Inject // Le DAO (auto-généré) qui gère les entités "Client"
    ClientFacade dao;
    @Inject
    BindingResult formValidationErrors;
    @Inject
    Models models; // Pour transmettre les infos à la vue
    @Inject
    SessionClient client;

    @GET
    public void afficheDonneesClient(
            @QueryParam("code") String codeClient) {
        Client c = facade.find(client.getCodeClient());
        models.put("client", c);
    }
}
