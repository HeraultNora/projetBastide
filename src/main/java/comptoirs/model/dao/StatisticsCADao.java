package comptoirs.model.dao;

import comptoirs.model.dto.StatsCAResult;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class StatisticsCADao {
	private static final String CACateg_SOLD = 
		"SELECT cat.libelle, SUM(li.quantite*p.Prix_unitaire) " +
		"FROM Categorie cat " + 
		"JOIN cat.produitCollection p " + 
		"JOIN p.ligneCollection li " + 
		"GROUP BY cat.libelle";
	
	private static final String CACateg_SOLD_DTO =
		"SELECT new comptoirs.model.dto.StatsCAResult" +
		"(cat.libelle, SUM(li.quantite*p.Prix_unitaire)) " + 
		"FROM Categorie cat " +
		"JOIN cat.produitCollection p " + 
		"JOIN p.ligneCollection li " + 
		"GROUP BY cat.libelle";
	
	private static final String CAPRODUCTS_SOLDS_DTO =
		"SELECT new comptoirs.model.dto.StatsResult" +
				        "(p.nom, SUM(li.quantite*p.Prix_unitaire)) " + 
		"FROM Produit p " +
		"JOIN p.categorie cat " +
		"JOIN p.ligneCollection li " + 
		"WHERE cat.code = :code " +
		"GROUP BY p.nom " ;
	
	@PersistenceContext(unitName = "comptoirs")
	private EntityManager em;

	public List CAParCategorie() {
		Query query = em.createQuery(CACateg_SOLD);
		List results = query.getResultList();
		return results;
	}

	public List<StatsCAResult> CAParCategorieDTO() {
		Query query = em.createQuery(CACateg_SOLD_DTO, StatsCAResult.class);
		List<StatsCAResult> results = query.getResultList();
		return results;
	}		
	
	public List<StatsCAResult> CAproduitsVendusPour(Integer codeCategorie) {
		Query query = em.createQuery(CAPRODUCTS_SOLDS_DTO, StatsCAResult.class);
		List<StatsResult> results = query.setParameter("code", codeCategorie).getResultList();
		return results;
	}
}
