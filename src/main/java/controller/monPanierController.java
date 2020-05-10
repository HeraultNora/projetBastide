package controller;

import comptoirs.model.dao.ClientFacade;
import comptoirs.model.dao.LigneFacade;
import comptoirs.model.dao.ProduitFacade;
import comptoirs.model.entity.Ligne;
import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.mvc.View;
import javax.ws.rs.GET;
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
    
    @Inject 
    LigneFacade lFacade;
    
    @Inject
    ProduitFacade pFacade;
    
    @Inject
    Ligne ligne;
    
    @GET
    public void show(){
        models.put("affiche le contenu du panier", panier.getPanierLignes());
        
    }
    
}
