/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import comptoirs.model.dao.CategorieFacade;
import comptoirs.model.dao.ClientFacade;
import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.Controller;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import comptoirs.model.entity.Categorie;
import comptoirs.model.entity.Client;
import form.CategorieForm;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJBException;
import javax.mvc.View;
import javax.mvc.binding.BindingResult;
import javax.validation.Valid;
import javax.validation.executable.ExecutableType;
import javax.validation.executable.ValidateOnExecution;
import javax.ws.rs.QueryParam;

/**
 *
 * @author edupuy01
 */
@Controller
@Path("donneesPersoEditor")
@View("donneesPersoEditor.jsp")
public class DonneesPersoEditorController {

    @Inject // Le DAO (auto-généré) qui gère les entités "Client"
    ClientFacade facade;
    @Inject
    Models models; // Pour transmettre les infos à la vue

    @GET
    public void afficheDonneesClient(
        @QueryParam("code") String codeClient) {
        // On utilise le DAO pour trouver le client 
        // qui correspond au paramètre
        Client c = facade.find(codeClient);
        // TODO : gérer les erreurs : et si le client n'existe pas ?
        // On transmet les informations à la vue
        models.put("client", c);
    }
    
    /*@POST
    public void editDonneesClient(
        @QueryParam("code") String codeClient) {
        // On utilise le DAO pour trouver le client 
        // qui correspond au paramètre
        Client c = facade.edit(codeClient);
        // TODO : gérer les erreurs : et si le client n'existe pas ?
        // On transmet les informations à la vue
        models.put("client", c);
    }*/

}


