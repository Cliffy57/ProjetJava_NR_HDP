
package projetjava.controllers.client;

public class Occasionnel extends Client {

	/**
	 * crée un objet Occasionnel
	 * @param identifiant identifiant du client
	 * @param nom nom du client
	 * @param prenom prenom du client
	 */

	public Occasionnel(int identifiant, String nom, String prenom) {
		super(identifiant, nom, prenom);
        this.setReduction(10.f);
	}
  

	
}


