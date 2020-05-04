/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package controller;

import comptoirs.model.dao.ClientFacade;
import comptoirs.model.entity.Client;
import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.View;
import javax.validation.executable.ExecutableType;
import javax.validation.executable.ValidateOnExecution;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("LoginCheck")
@View("LoginCheck.jsp")
public class LoginController {
    @Inject
    ClientFacade dao;
    
    @Inject
    Models models;
    
    @Inject
    clientController client;
    
    @POST
    @ValidateOnExecution(type = ExecutableType.All)
    public String login(@FormParam("contact") String contact, @FormParam("code") String code){
        if((contact.equals("admin")) && (code.equals("mdp"))){
            return "redirect:admin";
        }
        else{
            try{
                Client p = dao.find(code);
                if(p.getContact().equals(contact)){
                    client.setCode(code);
                    return "redirect:client";
                }
                else{
                    models.put("databaseErrorMessage", "Cet id est inconnu.");
                }
            }catch (Exception e) {
                models.put("databaseErrorMessage", "Mot de pass erroné.");
            }
        }
        return null;
    }
}
*/