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
	 * @param identifiant
	 * @param nom
	 * @param prenom
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
	 * @return identifiant
	 */

	public int getIdentifiant() {
		return identifiant;
	}

	/**
	 * définis un identifiant
	 * @param identifiant
	 */

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	/**
	 * renvoie un nom
	 * @return nom
	 */

	public String getNom() {
		return this.nom;
	}

	/**
	 * définis le nom
	 * @param nom
	 */
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * renvoie le prénom
	 * @return prenom
	 */

	public String getPrenom() {
		return prenom;
	}

	/**
	 * définis le prénom
	 * @param prenom
	 */

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * renvoie la réduction
	 * @return réduction
	 */

	public float getReduction() {
		return reduction;
	}

	/**
	 * définis la réduction
	 * @param reduction
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
	   * @param commande
	   */

	public void addCommande(Commande commande) {
	    this.listeCommande.add(commande);
	  
	  }
	
}
