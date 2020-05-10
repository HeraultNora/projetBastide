/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import comptoirs.model.dao.CategorieFacade;
import comptoirs.model.dao.ClientFacade;
import comptoirs.model.entity.Categorie;
import comptoirs.model.entity.Client;
import java.util.List;
import javax.inject.Inject;
import javax.mvc.Models;
import javax.ws.rs.GET;

public class StatsClientsController {
    @Inject 
	ClientFacade dao;

	@Inject
	Models models;

	@GET
	public void show() {
		List<Client> toutesLesClients = dao.findAll();
		models.put("categories", toutesLesClients);
	}
}
