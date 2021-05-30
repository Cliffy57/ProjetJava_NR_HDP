package projetjava.produit;

public class Document extends Produit {

    /**
     * crée un objet Document
     * @param id id du Document
     * @param titre titre du Document
     * @param tarif tarif du Document
     */

    public Document(double id, String titre, float tarif) {
        super(id, titre, tarif);
    }
    
}

