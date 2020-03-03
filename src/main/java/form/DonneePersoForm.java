/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.io.Serializable;
import javax.mvc.binding.MvcBinding;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;

public class DonneePersoForm implements Serializable {

    private static final long serialVersionUID = -3523783484400524581L;

    @MvcBinding
    @FormParam("societe")
    @Size(min = 1, max = 40)
    @Pattern(regexp = "[A-Za-z0-9-()._éè]+", message = "Uniquement des lettres ou des chiffres")
    private String societe;

    @MvcBinding
    @FormParam("contact")
    //@NotEmpty
    @Size(min = 1, max = 30)
    @Pattern(regexp = "[A-Za-z0-9-()._éè]+", message = "Uniquement des lettres ou des chiffres")
    private String contact;

    @MvcBinding
    @FormParam("fonction")
    @Size(min = 1, max = 30)
    @Pattern(regexp = "[A-Za-z0-9-()._éè]+", message = "Uniquement des lettres ou des chiffres")
    private String fonction;

    @MvcBinding
    @FormParam("adresse")
    @Size(min = 1, max = 60)
    @Pattern(regexp = "[A-Za-z0-9-()._éè]+", message = "Uniquement des lettres ou des chiffres")
    private String adresse;

    @MvcBinding
    @FormParam("ville")
    @Size(min = 1, max = 15)
    @Pattern(regexp = "[A-Za-z0-9-()._éè]+", message = "Uniquement des lettres ou des chiffres")
    private String ville;

    @MvcBinding
    @FormParam("region")
    @Size(min = 1, max = 15)
    @Pattern(regexp = "[A-Za-z0-9-()._éè]+", message = "Uniquement des lettres ou des chiffres")
    private String region;

    @MvcBinding
    @FormParam("cp")
    @Size(min = 1, max = 10)
    @Pattern(regexp = "[0-9]+", message = "Uniquement des chiffres")
    private String cp;

    @MvcBinding
    @FormParam("pays")
    @Size(min = 1, max = 15)
    @Pattern(regexp = "[A-Za-z0-9-()._éè]+", message = "Uniquement des lettres ou des chiffres")
    private String pays;

    @MvcBinding
    @FormParam("tel")
    @Size(min = 1, max = 24)
    @Pattern(regexp = "[0-9]+", message = "Uniquement des chiffres")
    private String tel;

    @MvcBinding
    @FormParam("fax")
    @Size(min = 1, max = 24)
    @Pattern(regexp = "[0-9]+", message = "Uniquement des chiffres")
    private String fax;

    // Getters, setters
    public String getSociete() {
        return societe;
    }

    public void setSociete(final String societe) {
        this.societe = societe;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(final String contact) {
        this.contact = contact;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(final String fonction) {
        this.fonction = fonction;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getVille() {
        return ville;
    }

    public String getRegion() {
        return region;
    }

    public String getCp() {
        return cp;
    }

    public String getPays() {
        return pays;
    }

    public String getTel() {
        return tel;
    }

    public String getFax() {
        return fax;
    }

    public void setAdresse(final String adresse) {
        this.adresse = adresse;
    }

    public void setVille(final String ville) {
        this.ville = ville;
    }

    public void setRegion(final String region) {
        this.region = region;
    }

    public void setCp(final String cp) {
        this.cp = cp;
    }

    public void setPays(final String pays) {
        this.pays = pays;
    }

    public void setTel(final String tel) {
        this.tel = tel;
    }

    public void setFax(final String fax) {
        this.fax = fax;
    }

}
