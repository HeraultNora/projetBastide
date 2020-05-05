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
import javax.validation.executable.ExecutableType;
import javax.validation.executable.ValidateOnExecution;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Controller
@Path("LoginCheck")
@View("LoginCheck.jsp")
public class LoginController {

    @Inject // Le DAO généré par netBeans
    ClientFacade dao;

    @Inject
    Models models;

    @Inject
    SessionClient client;

    @GET
    public void show() {
        models.put("client", dao.findAll());
    }

    @POST
    @ValidateOnExecution(type = ExecutableType.ALL)
    public String connexion(
            @FormParam("contact") String contact, 
            @FormParam("code") String code) {
        if (contact.equals("adminId") && code.equals("adminMdp")) {
            return "redirect:admin";
        } else {
            try {
                Client p = dao.find(code);
                if (p.getContact().equals(contact)) {
                    client.setCode(code);
                    return "redirect:client";

                } else {
                    models.put("databaseErrorMessage", "Erreur d'id");
                }
            } catch (Exception e) {
                models.put("databaseErrorMessage", "Erreur de mot de passe");
            }
        }

        return null;
    }
}
