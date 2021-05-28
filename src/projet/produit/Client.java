import java.util.ArrayList;

public abstract class Client {
	private int identifiant;
	private String nom;
	private String prenom;
	private float reduction;
	ArrayList<String> listeCommande = new ArrayList<String>();
	
	public int getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public float getReduction() {
		return reduction;
	}
	public void setReduction(float reduction) {
		this.reduction = reduction;
	}
	
	
	public Client(int identifiant, String nom, String prenom) {
		super();
		this.identifiant = identifiant;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public void addOrder() {
	    // code to be executed
	  }
	public void delOrder() {
	    // code to be executed
	  
	  }
	
}
