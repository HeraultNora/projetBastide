package controller;

import comptoirs.model.dao.ClientFacade;
import comptoirs.model.entity.Client;
import java.util.List;
import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.mvc.View;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;


@Controller
@Path("commandeClient")
@View("showCommandeClient.jsp")
public class BonDeCommandeController {
	@Inject // Le DAO généré par netBeans
	ClientFacade dao;

	@Inject
	Models models;

	@GET
	public void show(@QueryParam("code") String code) {
                Client c = dao.find(code);
		models.put("client", c);
	}
}