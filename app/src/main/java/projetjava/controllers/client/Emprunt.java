package projetjava.controllers.client;

import java.util.ArrayList;
import java.util.Date;

import projetjava.controllers.produit.Produit;

import java.util.Date;

public class Emprunt {
    private Date dateDeb;
    private Date dateFin;
    private ArrayList<Produit> listeProduits;
    protected Produit produit;

    /**
     * Crée un objet Emprunt
     * @param dateDeb date de début de l'emprunt 
     * @param dateFin date de fin de l'emprunt
     */

    public Emprunt(Date dateDeb, Date dateFin, Produit produit) {
        this.dateDeb = dateDeb;
        this.dateFin = dateFin;
        this.listeProduits = new ArrayList<Produit>();
        this.produit = produit;
    }

    /**
     * renvoie la date de début de l'objet
     * @return la date de début
     * @see Date
     */

    public Date getDateDeb() {
        return dateDeb;
    }

    /**
     * renvoie ladate de fin de l'objet
     * @return une date
     * @see Date
     */

    public Date getDateFin() {
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

    public Produit getProduit() {
        return this.produit;
    }
}
