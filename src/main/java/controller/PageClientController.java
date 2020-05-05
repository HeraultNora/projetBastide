/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;
/**
 *
 * @author perla
 */
@controller
@path("pageClient")
@view("pageClient.jsp")

public class PageClientController {
    @Inject
    ClientFacade facade;

    @Inject 
    Models models;

    @GET
    public void show(){
        models.put("pageClient", facade.findAll());
}

}
