package controller;

import comptoirs.model.dao.LigneFacade;
import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.mvc.View;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import comptoirs.model.dao.ProduitFacade;
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
	ProduitFacade facadeP;
	
	@Inject
	Models models;
        
        @Inject
        SessionPanier panier;
        
        @Inject
        LigneFacade lFacade;

	@GET
	@View("afficheTousLesProduits.jsp")
	public void show() {
		models.put("afficheTousLesProduits", facadeP.findAll());
        }
        
        @POST
        @ValidateOnExecution(type = ExecutableType.ALL)
        public void newLigne(@FormParam("nomP") String nomP, @FormParam("qteP") Short qteP) {}
}
