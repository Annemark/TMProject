package fr.dawan.dao;

import fr.dawan.beans.Joueur;

public interface InterfaceJoueurDao <T>extends DaoInterface<T>{
	
	Joueur findByEmail(String email);

}
