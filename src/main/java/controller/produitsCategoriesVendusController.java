/*package controller;

import comptoirs.model.dao.CategorieFacade;
import java.util.List;

import comptoirs.model.dao.ProduitFacade;
import comptoirs.model.entity.Categorie;
import comptoirs.model.entity.Produit;

import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.mvc.View;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import comptoirs.model.entity.Categorie;


@Controller
@Path("produitsCategoriesVendus")
@View("produitsCategoriesVendus.jsp")
public class produitsCategoriesVendusController {
	@Inject
	ProduitFacade facadeP;

	@Inject
	CategorieFacade facadeC;

	@Inject
	Models models;

	@GET
	@View("showAllProduits.jsp")
	public void show() {
		models.put("produits", facadeP.findAll());
	}
	
	@GET
	public void produitsParCategorie( @QueryParam("code") Integer codeCategorie ) {
		// On cherche la liste des catégories pour l'afficher dans la liste de choix
		final List<Categorie> touteslesCategories = facadeC.findAll();
		// On cherche la catégorie à partir de son code passé en paramètre
		Categorie categorieChoisie;
		if (codeCategorie != null) // Est-ce qu'on a un paramètre ?
			// On va chercher la catégorie 
			categorieChoisie = facadeC.find(codeCategorie); // Et si on ne trouve pas ?

		// On transmet les informations à la vue
		models.put("categories", touteslesCategories);
		models.put("selected", categorieChoisie);
                models.put("produits", facadeP.findAll());
	}
}
*/