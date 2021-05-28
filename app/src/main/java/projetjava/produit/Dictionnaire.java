package projetjava.produit;

public class Dictionnaire extends Document {
    // utiliser un enum??
    private String langue;

    public Dictionnaire(double id, String titre, float tarif) {
        super(id, titre, tarif);
    }
 
    public String getLangue() {
        return this.langue;
    }
    
}
