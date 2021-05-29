package projetjava;

import java.util.ArrayList;
import java.util.Iterator;

import projetjava.client.Client;
import projetjava.produit.Produit;

public class Videotheque {
    protected ArrayList<Client> listeClients; 
    protected ArrayList<Produit> listeProduits; 

    Videotheque () {
        this.listeClients = new ArrayList<Client>();
        this.listeProduits = new ArrayList<Produit>();
    }

    public void ajouterClient(Client c) {
        this.listeClients.add(c);
    }

    public void ajouterProduit(Produit p) {
        this.listeProduits.add(p);
    }

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

    public ArrayList<Client> getListeClients() {
        return this.listeClients;
    }

    public ArrayList<Produit> getListeProduits() {
        return this.listeProduits;
    }
}
