package projetjava.produit;

public class Dictionnaire extends Document {
    // utiliser un enum??
    private String langue;

    /**
     * crée un objet Dictionnaire
     * @param id id du Dictionnaire
     * @param titre titre du Dictionnaire
     * @param tarif tarif du Dictionnaire
     */

    public Dictionnaire(double id, String titre, float tarif) {
        super(id, titre, tarif);
    }
    
    /**
     * renvoie la langue du Dictionnaire
     * @return langue du Dictionnaire
     */

    public String getLangue() {
        return this.langue;
    }
    
}
