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
import comptoirs.model.entity.Produit;
import java.util.Collection;
import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.mvc.View;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author Emma
 */
@Controller
@Path("adminPage")
public class AdminPageController {

    @Inject
    Models models;
    
    @Inject
    ClientFacade cFacade;
    
    @Inject
    SessionClient cSession;
    
    @Inject
    ProduitFacade pFacade;
    
    @Inject
    LigneFacade lFacade;
    
    //@Inject
    //panier

    @GET
    @View("adminPage.jsp")
    public void show() {
    }
}
