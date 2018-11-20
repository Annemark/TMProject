package fr.dawan.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Caractere {

	private boolean sportif;
	private boolean marmotte;
	private boolean gourmand;

	public Caractere() {

	}

	
	public Caractere(boolean sportif, boolean marmotte, boolean gourmand) {
		super();
		this.sportif = sportif;
		this.marmotte = marmotte;
		this.gourmand = gourmand;
	}


	public boolean isSportif() {
		return sportif;
	}

	public void setSportif(boolean sportif) {
		this.sportif = sportif;
	}

	public boolean isMarmotte() {
		return marmotte;
	}

	public void setMarmotte(boolean marmotte) {
		this.marmotte = marmotte;
	}

	public boolean isGourmand() {
		return gourmand;
	}

	public void setGourmand(boolean gourmand) {
		this.gourmand = gourmand;
	}

}
