package projetjava.produit;

public abstract class Produit {
	protected double id;
	protected String titre;
	protected float tarif;
	protected boolean disponible;

	/**
	 * crée un objet produit
	 * @param id
	 * @param titre
	 * @param tarif
	 */
	
	public Produit(double id, String titre, float tarif) {
		super();
		this.id = id;
		this.titre = titre;
		this.tarif = tarif;
		this.disponible = true;
	}
	
	/**
	 * renvoie l'identifiant
	 * @return identifiant
	 */

	public double getId() {
		return id;
	}

	/**
	 * définis l'identifiant
	 * @param id
	 */
	
	public void setId(double id) {
		this.id = id;
	}

	/**
	 * renvoie titre
	 * @return titre
	 */
	
	public String getTitre() {
		return titre;
	}

	/**
	 * définis le titre
	 * @param titre
	 */
	
	public void setTitre(String titre) {
		this.titre = titre;
	}
	

	/**
	 * renvoie le tarif
	 * @return
	 */

	public float getTarif() {
		return tarif;
	}

	/**
	 * définis le tarif
	 * @param tarif
	 */
	
	public void setTarif(float tarif) {
		this.tarif = tarif;
	}

	/**
	 * renvoie si le produit est disponible ou non
	 * @return bool
	 */

	public boolean estDisponible() {
		return this.disponible;
	}

	/**
	 * définis si le produit est disponible ou non
	 * @param bool
	 */

	public void setDisponible(boolean bool) {
		this.disponible = bool;
	}
	
}
