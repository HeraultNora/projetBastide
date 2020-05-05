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
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Controller
@Path("showAllCommandes") // Le chemin d'accès au contrôleur
@View("showAllCommandes.jsp") // La vue qui affiche le résultat
public class showAllCommandesController {

    @Inject // Le DAO (auto-généré) qui gère les entités "Client"
    ClientFacade facade;
    
    @Inject
    SessionClient client;
    
    @Inject
    Models models; // Pour transmettre les infos à la vue

    @GET
    public void afficheCommandesPourLeClient(
        @QueryParam("code") String codeClient) {
        Client c = facade.find(client.getCodeClient());
        models.put("client", c);
    }
}
