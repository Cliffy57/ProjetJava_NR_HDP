package projet;

import java.util.ArrayList;
import java.util.Iterator;

import projet.client.Client;
import projet.client.Produit;

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

        do {
            /*
            if (produit.estDisponible()) {
                tempProduits.add(produit);
            }*/

        } while (produitIterator.hasNext());

        return tempProduits;
    }

    public ArrayList<Produit> recupererStockIndisponible() {
        ArrayList<Produit> tempProduits = new ArrayList<Produit>();
        Iterator<Produit> produitIterator = listeProduits.iterator();
        Produit produit = produitIterator.next();

        do {

            /*if (!(produit.estDisponible())) {
                tempProduits.add(produit);
            }*/

        } while (produitIterator.hasNext());

        return tempProduits;
    }

    /*

    public int recupererQuantiteStock {
        int quantiteStock = 0;
        Iterator<Produit> produitIterator = listeProduits.iterator();
        Produit produit = produitIterator.next();

        do {

            if (!(produit.estDisponible())) {
                tempProduits.add(produit);
            }

        } while (produitIterator.hasNext());

        return quantiteStock;
    } */

    
}
