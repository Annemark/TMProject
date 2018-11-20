package fr.dawan.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import fr.dawan.beans.Animal;

@Transactional
public class AnimalDao implements DaoInterface<Animal> {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Animal createOrUpdate(Animal item) {
		Session session = sessionFactory.getCurrentSession();
		
		return item;
	}

	@Override
	public List<Animal> findAll() {
		
		return null;
	}

	@Override
	public Animal findById(int id) {
		
		return null;
	}

	@Override
	public void delete(int id) {
	
		
	}

}
