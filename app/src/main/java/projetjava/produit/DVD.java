package projetjava.produit;


public class DVD extends SupportNumerique {

    /**
     * crée un objet DVD
     * @param id id du DVD
     * @param titre titre du DVD
     * @param tarif tarif du DVD
     */

    public DVD(double id, String titre, float tarif) {
        super(id, titre, tarif);
    }
    
}
