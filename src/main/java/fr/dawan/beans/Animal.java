package fr.dawan.beans;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Animal extends DbObject {

	private String nom;
	private int satiete;
	private int bonheur;
	private int sommeil;
	private String couleur;

	public Animal() {

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getSatiete() {
		return satiete;
	}

	public void setSatiete(int satiete) {
		this.satiete = satiete;
	}

	public int getBonheur() {
		return bonheur;
	}

	public void setBonheur(int bonheur) {
		this.bonheur = bonheur;
	}

	public int getSommeil() {
		return sommeil;
	}

	public void setSommeil(int sommeil) {
		this.sommeil = sommeil;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

}
