package controller;

import comptoirs.model.dao.CategorieFacade;
import comptoirs.model.dao.LigneFacade;
import comptoirs.model.dao.ProduitFacade;
import java.util.List;

import comptoirs.model.entity.Categorie;
import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.mvc.View;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import comptoirs.model.entity.Categorie;
import comptoirs.model.entity.Ligne;
import comptoirs.model.entity.Produit;
import javax.validation.executable.ExecutableType;
import javax.validation.executable.ValidateOnExecution;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;

@Controller
@Path("produitsCategoriesVendus")
@View("produitsCategoriesVendus.jsp")
public class produitsCategoriesVendusController {

    @Inject
    CategorieFacade facadeC;

    @Inject
    ProduitFacade pFacade;

    @Inject
    Models models;

    @Inject
    SessionPanier panier;

    @Inject
    LigneFacade lFacade;

    @GET
    public void produitsParCategorie(@QueryParam("code") Integer codeCategorie) {
        // On cherche la liste des catégories pour l'afficher dans la liste de choix
        List<Categorie> touteslesCategories = facadeC.findAll();
        // On cherche la catégorie à partir de son code passé en paramètre
        Categorie categorieChoisie;
        if (codeCategorie != null) // Est-ce qu'on a un paramètre ?
        // On va chercher la catégorie 
        {
            categorieChoisie = facadeC.find(codeCategorie); // Et si on ne trouve pas ?
        } else // On prend la première de la liste (encore faut-il qu'il y en ait une !)
        {
            categorieChoisie = touteslesCategories.get(0);
        }
        // On transmet les informations à la vue
        models.put("categories", touteslesCategories);
        models.put("selected", categorieChoisie);
    }

    @POST
    @ValidateOnExecution(type = ExecutableType.ALL)
    public void newLigne(@FormParam("ref") Integer ref, @FormParam("qte") short qte) {
        Ligne uneLigne = new Ligne();
        Produit leProduit = new Produit();
        for (Produit unProduit : pFacade.findAll()) {
            if (unProduit.getReference().equals(ref)) {
                leProduit = unProduit;
            }
        }

        if (leProduit != null) {
            models.put("produit", leProduit.getReference());
            uneLigne.setProduit1(leProduit);
            uneLigne.setQuantite(qte);

            lFacade.create(uneLigne);

            panier.addLignePanier(uneLigne);
            models.put("new ligne panier (categ)", panier);
        }
    }
}
