package controller;

import comptoirs.model.dao.LigneFacade;
import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.mvc.View;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import comptoirs.model.dao.ProduitFacade;
import comptoirs.model.entity.Ligne;
import comptoirs.model.entity.Produit;
import java.math.BigDecimal;
import javax.validation.executable.ExecutableType;
import javax.validation.executable.ValidateOnExecution;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;

@Controller
@Path("afficheTousLesProduits")
public class afficheTousLesProduitsController {

    @Inject
    ProduitFacade pFacade;

    @Inject
    Models models;

    @Inject
    SessionPanier panier;

    @Inject
    LigneFacade lFacade;

    @GET
    @View("afficheTousLesProduits.jsp")
    public void show() {
        models.put("afficheTousLesProduits", pFacade.findAll());
    }

    @POST
    @ValidateOnExecution(type = ExecutableType.ALL)
    public void newLigne(@FormParam("ref") Integer ref, @FormParam("qte") short qte) 
    {
        Ligne uneLigne = new Ligne();
        Produit leProduit = new Produit();
        for (Produit unProduit : pFacade.findAll()) {
            if (unProduit.getReference().equals(ref)) {
                leProduit = unProduit;
            }
        }
        
        if (leProduit != null) 
        {
            models.put("produit", leProduit.getReference());
            uneLigne.setProduit1(leProduit);
            uneLigne.setQuantite(qte);

            lFacade.create(uneLigne);

            panier.addLignePanier(uneLigne);
            models.put("new ligne panier", panier);
        }
    }
}
