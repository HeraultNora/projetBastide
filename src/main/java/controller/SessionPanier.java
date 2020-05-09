package controller;

import comptoirs.model.entity.Ligne;
import java.io.Serializable;
import java.util.ArrayList;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@SessionScoped
@Named("Panier")
public class SessionPanier implements Serializable {
    ArrayList<Ligne> panierLignes = new ArrayList<>();
    
    public void addLignePanier(Ligne uneLigne){
        panierLignes.add(uneLigne);
    }
    
    public ArrayList<Ligne> getPanierLignes(){
        return panierLignes;
    }
    
    public void setPanierLignes(ArrayList<Ligne> p_ligne){
        this.panierLignes = p_ligne;
    }
}
