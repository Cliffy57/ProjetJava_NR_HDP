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
	 * @param identifiant identifiant du client
	 * @param nom nom du client
	 * @param prenom prenom du client
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
	 * @return identifiant identifiant du client
	 */

	public int getIdentifiant() {
		return identifiant;
	}

	/**
	 * définis un identifiant
	 * @param identifiant identifiant du client
	 */

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	/**
	 * renvoie un nom
	 * @return nom nom du client
	 */

	public String getNom() {
		return this.nom;
	}

	/**
	 * définis le nom
	 * @param nom nom du client
	 */
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * renvoie le prénom
	 * @return prenom prenom du client
	 */

	public String getPrenom() {
		return prenom;
	}

	/**
	 * définis le prénom
	 * @param prenom prenom du cllient
	 */

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * renvoie la réduction du client
	 * @return réduction réduction liée au client
	 */

	public float getReduction() {
		return reduction;
	}

	/**
	 * définis la réduction du client
	 * @param reduction réduction liée au client
	 */

	public void setReduction(float reduction) {
		this.reduction = reduction;
	}
	
	/**
	 * renvoie la liste des commandes du client
	 * @return liste des commandes du client
	 */
	
	public ArrayList<Commande> getCommandeList() {
	    return this.listeCommande;
	  }

	  /**
	   * ajoute une commande a la liste des commandes du client
	   * @param commande commande a ajouter
	   */

	public void addCommande(Commande commande) {
	    this.listeCommande.add(commande);
	  
	  }
	
}
