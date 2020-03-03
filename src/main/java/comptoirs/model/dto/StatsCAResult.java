package comptoirs.model.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * un "Data Transfer Object" (DTO) pour les statistiques
 * "CA par catégorie"
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class StatsCAResult {

	public StatsCAResult(String libelle, Long unites, Long prix) {
		this.unites = unites;
		this.libelle = libelle;
                this.prix = prix;
	}
	
	public StatsCAResult() {
		this("Inconnu", 0l);
	}
	
	// Pas utile de mettre des "getter" ici (final)
	@XmlElement
	public final Long unites;

	@XmlElement
	public final String libelle;

        @XmlElement
	public final Long prix;
	
}
