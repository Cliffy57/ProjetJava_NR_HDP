package projetjava.produit;


public class Livre extends Document {
    private String auteur;

    /**
     * crée un objet Livre
     * @param id id du Livre 
     * @param titre titre du Livre
     * @param tarif tarif du Livre
     */

    public Livre(double id, String titre, float tarif) {
        super(id, titre, tarif);
        
    }

    /**
     * renvoie l'auteur du Livre
     * @return auteur du Livre
     */

    public String getAuteur() {
        return this.auteur;
    }

}
