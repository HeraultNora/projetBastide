/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

    import javax.inject.Inject;
    import javax.mvc.Controller;
    import javax.mvc.Models;
    import javax.mvc.View;
    import javax.ws.rs.GET;
    import javax.ws.rs.Path;

    import comptoirs.model.dao.ClientFacade;
    import comptoirs.model.dao.AbstractFacade;
    import comptoirs.model.dao.CategorieFacade;
    import comptoirs.model.dao.CommandeFacade;
    import comptoirs.model.dao.LigneFacade;
    import comptoirs.model.dao.ProduitFacade;

/*
 *
 * @author perla
 */

@Controller
@Path("pageClient")

public class PageClientController {
    @Inject
    ClientFacade clientFacade;

    @Inject
    AbstractFacade abstractFacade;

    @Inject
    CategorieFacade categorieFacade;

    @Inject
    CommandeFacade commandeFacade;

    @Inject
    LigneFacade ligneFacade;  

    @Inject
    ProduitFacade produitFacade;

    @Inject 
    Models models;

    @GET
    @View("pageClient.jsp")
    public void show(){
        models.put("pageClient", clientFacade.findAll());
}

}