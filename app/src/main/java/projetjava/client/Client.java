package projetjava.client;

import java.util.ArrayList;

public abstract class Client {
	private int identifiant;
	private String nom;
	private String prenom;
	private float reduction;
	ArrayList<Commande> listeCommande;

	/**
	 * crée un objet Client
	 * @param identifiant identifiant
	 * @param nom nom
	 * @param prenom prenom
	 */
	
	public Client(int identifiant, String nom, String prenom) {
		super();
		this.identifiant = identifiant;
		this.nom = nom;
		this.prenom = prenom;
		this.listeCommande = new ArrayList<Commande>();
	}
	
	/**
	 * renvoie l'identifiant
	 * @return identifiant identifiant
	 */

	public int getIdentifiant() {
		return identifiant;
	}

	/**
	 * définis un identifiant
	 * @param identifiant identifiant
	 */

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	/**
	 * renvoie un nom
	 * @return nom nom
	 */

	public String getNom() {
		return this.nom;
	}

	/**
	 * définis le nom
	 * @param nom nom
	 */
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * renvoie le prénom
	 * @return prenom prenom
	 */

	public String getPrenom() {
		return prenom;
	}

	/**
	 * définis le prénom
	 * @param prenom prenom
	 */

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * renvoie la réduction
	 * @return réduction réduction
	 */

	public float getReduction() {
		return reduction;
	}

	/**
	 * définis la réduction
	 * @param reduction réduction
	 */

	public void setReduction(float reduction) {
		this.reduction = reduction;
	}
	
	/**
	 * renvoie la liste des commandes
	 * @return liste des commandes
	 */
	
	public ArrayList<Commande> getCommandeList() {
	    return this.listeCommande;
	  }

	  /**
	   * ajoute une commande a la liste
	   * @param commande commande
	   */

	public void addCommande(Commande commande) {
	    this.listeCommande.add(commande);
	  
	  }
	
}
