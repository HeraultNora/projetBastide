package controller;

import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.mvc.View;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import comptoirs.model.dao.ProduitFacade;
import comptoirs.model.entity.Produit;
import java.math.BigDecimal;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;

@Controller
@Path("afficheTousLesProduits")
public class afficheTousLesProduitsController {
	@Inject
	ProduitFacade facadeP;
	
	@Inject
	Models models;

	@GET
	@View("afficheTousLesProduits.jsp")
	public void show() {
		models.put("afficheTousLesProduits", facadeP.findAll());
        }
}
