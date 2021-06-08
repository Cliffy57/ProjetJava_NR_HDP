package projetjava.controllers.client;

public class Fidele extends Client {

	/**
	 * créer un objet Fidele
	 * @param identifiant identifiant du client
	 * @param nom nom du client
	 * @param prenom prenom du client
	 */

	public Fidele(int identifiant, String nom, String prenom) {
		super(identifiant, nom, prenom);
        this.setReduction(20.f);
	}


	   
}
