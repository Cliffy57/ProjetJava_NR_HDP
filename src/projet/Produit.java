package projet;


public class Produit {
	private double id;
	private String titre;
	private float tarif;
	
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
	
}
