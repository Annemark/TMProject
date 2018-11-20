package fr.dawan.dao;

import java.util.List;

public interface DaoInterface <T>{
	
	T createOrUpdate(T item);
	
	List<T> findAll();
	
	T findById(int id);
	
	void delete(int id);
	
}


