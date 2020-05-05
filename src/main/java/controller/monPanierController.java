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
@Path("monPanier")
@View("monPanier.jsp")
public class monPanierController {
    
    @Inject // Le DAO généré par netBeans
    ClientFacade dao;

    @Inject
    Models models;

    @Inject
    SessionPanier panier;

}
