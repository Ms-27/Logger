package ms.fr;

import java.util.logging.Logger;

import org.slf4j.LoggerFactory;

public class Voiture {
	 private String couleur;
	 private String marque;
	 private double prix;

	 public Voiture(String couleur) {
		this.couleur = couleur;
	}

	public void setCouleur(String couleur) {
		 this.couleur = couleur;
	 }
	 
	 public String getCouleur() {
		 return this.couleur;
	 }
}

