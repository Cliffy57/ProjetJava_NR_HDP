package projetjava.client;

import java.util.ArrayList;
import java.util.Date;

public class Emprunt {
    private Date dateDeb;
    private Date dateFin;
    private ArrayList<Produit> listeProduits;

    public Emprunt(Date dateDeb, Date dateFin) {
        this.dateDeb = dateDeb;
        this.dateFin = dateFin;
        this.listeProduits = new ArrayList<Produit>();
    }

    public Date getDateDeb() {
        return dateDeb;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public ArrayList<Produit> getListeProduits() {
        return listeProduits;
    }

    public void addProduit(Produit produit) {
        this.listeProduits.add(produit);
    }
}
