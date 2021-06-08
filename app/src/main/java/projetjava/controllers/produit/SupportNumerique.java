package projetjava.controllers.produit;


public class SupportNumerique extends Produit  {

    /**
     * crée un objet SupportNumerique
     * @param id identifiant du SupportNumerique
     * @param titre titre du SupportNumerique 
     * @param tarif tarif du SupportNumerique
     */

    public SupportNumerique(double id, String titre, float tarif) {
        super(id, titre, tarif);
    }
    
}
