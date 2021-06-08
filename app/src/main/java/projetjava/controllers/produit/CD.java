package projetjava.controllers.produit;

public class CD extends SupportNumerique {

    /**
     * crée un objet CD
     * @param id id du CD
     * @param titre titre du CD
     * @param tarif tarif du CD
     */

    public CD(double id, String titre, float tarif) {
        super(id, titre, tarif);
    }
    
}
