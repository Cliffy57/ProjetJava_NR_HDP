package projetjava.client;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import projetjava.produit.Produit;

public class Emprunt {
    private Calendar dateDeb;
    private Calendar dateFin;
    private ArrayList<Produit> listeProduits;

    public Emprunt(Calendar dateDeb, Calendar dateFin) {
        this.dateDeb = dateDeb;
        this.dateFin = dateFin;
        this.listeProduits = new ArrayList<Produit>();
    }

    public Calendar getDateDeb() {
        return dateDeb;
    }

    public Calendar getDateFin() {
        return dateFin;
    }

    public ArrayList<Produit> getListeProduits() {
        return listeProduits;
    }

    public void addProduit(Produit produit) {
        this.listeProduits.add(produit);
    }
}
