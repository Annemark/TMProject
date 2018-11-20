package fr.dawan.dao;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;


import fr.dawan.beans.Joueur;

@Transactional
public class JoueurDao implements InterfaceJoueurDao<Joueur> {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Joueur createOrUpdate(Joueur item) {
		Session session = sessionFactory.getCurrentSession();
		
		if(item.getId()==null) {
			session.persist(item);
		}
		
		else {
			session.merge(item);
		}
		
		return item;
	}

	@Override
	public Joueur findById(int id) {
		Session session = sessionFactory.getCurrentSession();
		return session.find(Joueur.class, id);
	}

	@Override
	public List<Joueur> findAll() {
		Session session = sessionFactory.getCurrentSession();
		TypedQuery <Joueur> query = session.createQuery("SELECT entity FROM Joueur entity", Joueur.class);
		return query.getResultList();
	}

	@Override
	public void delete(int id) {
		Session session = sessionFactory.getCurrentSession();
		Joueur joueur = findById(id);
		session.remove(joueur);
	}
	
	
	  public Joueur findByEmail(String email) {
	        Session session = sessionFactory.getCurrentSession();
	        TypedQuery<Joueur> query = session
	                .createQuery("SELECT entity FROM Joueur entity WHERE entity.email='" + email + "'", Joueur.class);
	        return query.getSingleResult();
	    }

}