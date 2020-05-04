/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@SessionScoped
@Named("Client")
public class SessionClient implements Serializable {

    private String codeClient = null;

    public void login(String name) {
        this.codeClient = name;
    }

    public void logout() {
        this.codeClient = null;
    }

    public boolean isConnected() {
        return codeClient != null;
    }

    public String getCodeClient() {
        return codeClient;
    }

    public void setCode(String code){
        this.codeClient = code;

    }
}
