package projetjava.controllers;

import java.util.ArrayList;
import java.util.Iterator;

import projetjava.controllers.client.Client;
import projetjava.controllers.client.Commande;
import projetjava.controllers.client.Emprunt;
import projetjava.controllers.produit.Produit;

public class Videotheque {
    protected ArrayList<Client> listeClients; 
    protected ArrayList<Produit> listeProduits; 
    protected ArrayList<Commande> listeCommandes;

    /**
     * crée un objet Videotheque
     * 
     */

    public Videotheque () {
        this.listeClients = new ArrayList<Client>();
        this.listeProduits = new ArrayList<Produit>();
        //this.listeCommandes = new ArrayList<Commande>();
    }

    /**
     * ajoute un Client à la Vidéothèque
     * @param c
     */

    public void ajouterClient(Client c) {
        this.listeClients.add(c);
    }

    /**
     * ajoute un Produit à la Vidéothèque
     * @param p
     */

    public void ajouterProduit(Produit p) {
        this.listeProduits.add(p);
    }

    /**
     * renvoie la liste des Produits disponibles
     * @return liste des Produits disponibles
     */

     // TODO : utiliser une fonction privée
    public ArrayList<Produit> recupererStockDisponible() {
        ArrayList<Produit> tempProduits = new ArrayList<Produit>();
        Iterator<Produit> produitIterator = listeProduits.iterator();
        Produit produit = produitIterator.next();

        while (produitIterator.hasNext()) {
            
            if (produit.estDisponible()) {
                tempProduits.add(produit);
            }

        }

        return tempProduits;
    }

    /**
     * renvoie la liste des Produits indisponibles
     * @return liste des Produits indisponibles
     */

    public ArrayList<Produit> recupererStockIndisponible() {
        ArrayList<Produit> tempProduits = new ArrayList<Produit>();
        Iterator<Produit> produitIterator = listeProduits.iterator();
        Produit produit = produitIterator.next();


        while (produitIterator.hasNext()) {

            if (!(produit.estDisponible())) {
                tempProduits.add(produit);
            }

        };

        return tempProduits;
    }

    /**
     * renvoie la quantité de Produit dans la Vidéothèque
     * @return quantité de Produit dans la Vidéothèque
     */

    public int recupererQuantiteStock() {
        int quantiteStock = 0;
        Iterator<Produit> produitIterator = listeProduits.iterator();
        Produit produit = produitIterator.next();

        do {

            if (!(produit.estDisponible())) {
                quantiteStock += 1;
            }

        } while (produitIterator.hasNext());

        return quantiteStock;
    }

    /**
     * renvoie la liste des clients
     * @return liste des clients
     */

    public ArrayList<Client> getListeClients() {
        return this.listeClients;
    }

    /**
     * renvoie la l iste des produits
     * @return liste des produits
     */

    public ArrayList<Produit> getListeProduits() {
        return this.listeProduits;
    }

    public ArrayList<Commande> getListeCommande() {
        return this.listeCommandes;
    }

    public void ajouterCommande(Commande commande) {
        this.listeCommandes.add(commande);
    }

    public void supprimerClient(Integer i) {
        for (Client c : this.getListeClients()) {
            if (c.getIdentifiant() == i) {
                this.listeClients.remove(c);
            }
        }
    }

    public void ajouterEmprunt(Emprunt e) {
        for (Commande c : this.getListeCommande()) {
            //c.addEmprunt(e);
        }
    }
}
