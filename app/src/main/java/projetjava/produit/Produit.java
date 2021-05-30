package projetjava.produit;

public abstract class Produit {
	protected double id;
	protected String titre;
	protected float tarif;
	protected boolean disponible;

	/**
	 * crée un objet produit
	 * @param id identifiant du Produit
	 * @param titre titre du Produit
	 * @param tarif tarif du Produit
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
	 * @return identifiant du Produit
	 */

	public double getId() {
		return id;
	}

	/**
	 * définis l'identifiant du Produit
	 * @param id identifiant du Produit
	 */
	
	public void setId(double id) {
		this.id = id;
	}

	/**
	 * renvoie le titre du Produiit
	 * @return titre du Produit
	 */
	
	public String getTitre() {
		return titre;
	}

	/**
	 * définis le titre du Produit
	 * @param titre titre du Produit
	 */
	
	public void setTitre(String titre) {
		this.titre = titre;
	}
	

	/**
	 * renvoie le tarif du Produit
	 * @return tarif du Produit
	 */

	public float getTarif() {
		return tarif;
	}

	/**
	 * définis le tarif du Produit
	 * @param tarif du Produit
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
