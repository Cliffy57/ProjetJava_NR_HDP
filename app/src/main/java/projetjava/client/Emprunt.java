package projetjava.client;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import projetjava.produit.Produit;

public class Emprunt {
    private Calendar dateDeb;
    private Calendar dateFin;
    private ArrayList<Produit> listeProduits;

    /**
     * Crée un objet Emprunt
     * @param dateDeb date de début de l'emprunt 
     * @param dateFin date de fin de l'emprunt
     */

    public Emprunt(Calendar dateDeb, Calendar dateFin) {
        this.dateDeb = dateDeb;
        this.dateFin = dateFin;
        this.listeProduits = new ArrayList<Produit>();
    }

    /**
     * renvoie la date de début de l'objet
     * @return la date de début
     * @see Calendar
     */

    public Calendar getDateDeb() {
        return dateDeb;
    }

    /**
     * renvoie ladate de fin de l'objet
     * @return une date
     * @see Calendar
     */

    public Calendar getDateFin() {
        return dateFin;
    }

    /**
     * renvoie la liste des produits de l'objets
     * @return une liste de produit
     * @see Produit
     */

    public ArrayList<Produit> getListeProduits() {
        return listeProduits;
    }

    /**
     * ajoute un produit a la liste de produits
     * @param produit un produit a ajouter a la liste
     * @see Produit
     */

    public void addProduit(Produit produit) {
        this.listeProduits.add(produit);
    }
}
