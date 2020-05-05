/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import comptoirs.model.dao.ClientFacade;
import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.Controller;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import comptoirs.model.entity.Client;
import javax.mvc.View;
import javax.mvc.binding.BindingResult;
import javax.validation.executable.ExecutableType;
import javax.validation.executable.ValidateOnExecution;
import javax.ws.rs.FormParam;
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
    @Inject // Le DAO (auto-généré) qui gère les entités "Client"
    ClientFacade dao;
    @Inject
    BindingResult formValidationErrors;
    @Inject
    Models models; // Pour transmettre les infos à la vue
    @Inject
    SessionClient client;

    @GET
    public void afficheDonneesClient(@QueryParam("code") String codeClient) {
        Client c = facade.find(client.getCodeClient());
        models.put("client", c);
    }

    @POST
    @ValidateOnExecution(type = ExecutableType.ALL)
    public String editDonneesClient(
            @FormParam("code") String code,
            @FormParam("societe") String societe,
            @FormParam("contact") String contact,
            @FormParam("fonction") String fonction,
            @FormParam("adresse") String adresse,
            @FormParam("ville") String ville,
            @FormParam("region") String region,
            @FormParam("cp") String cp,
            @FormParam("pays") String pays,
            @FormParam("tel") String tel,
            @FormParam("fax") String fax) {
        if (formValidationErrors.isFailed()) {
            return "redirect:/projetBastide";
        } else {
            Client c = new Client();
            c.setCode(code);
            c.setSociete(societe);
            c.setContact(contact);
            c.setFonction(fonction);
            c.setAdresse(adresse);
            c.setVille(ville);
            c.setRegion(region);
            c.setCodePostal(cp);
            c.setPays(pays);
            c.setTelephone(tel);
            c.setFax(fax);
            try {

                facade.edit(c);

            } catch (Exception e) {
                models.put("test", e);
            }
            return "redirect:pageClient";

        }
    }
}
