package projetjava.produit;


public class Livre extends Document {
    private String auteur;

    public Livre(double id, String titre, float tarif) {
        super(id, titre, tarif);
        
    }

    public String getAuteur() {
        return this.auteur;
    }
    
}
