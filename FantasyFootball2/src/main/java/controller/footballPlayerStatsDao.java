package controller;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import model.footballPlayer;

public class footballPlayerStatsDao {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("football");

	public void cleanUp() {
		emfactory.close();
	}

	public List<footballPlayer> showPlayerStats() {
		EntityManager em = emfactory.createEntityManager();
		TypedQuery<footballPlayer> typedQuery = em.createQuery("select fb from footballPlayer fb", footballPlayer.class);
		List<footballPlayer> foundPlayer = typedQuery.getResultList();
		em.close();
		return foundPlayer;
	}
}
