package projet.client;

public abstract class Produit {
	protected double id;
	protected String titre;
	protected float tarif;
	protected boolean disponible;
	
	public Produit(double id, String titre, float tarif) {
		super();
		this.id = id;
		this.titre = titre;
		this.tarif = tarif;
	}
	
	public double getId() {
		return id;
	}
	
	public void setId(double id) {
		this.id = id;
	}
	
	public String getTitre() {
		return titre;
	}
	
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public float getTarif() {
		return tarif;
	}
	
	public void setTarif(float tarif) {
		this.tarif = tarif;
	}

	public boolean estDisponible() {
		return this.disponible;
	}

	public void setDisponible(boolean bool) {
		this.disponible = bool;
	}
	
}
