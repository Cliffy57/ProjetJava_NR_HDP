/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package projetjava;

import projetjava.Videotheque;
import projetjava.client.*;
import projetjava.produit.*;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.System.Logger;
import java.util.ArrayList;

public class TestVideotheque {
    private Videotheque videotheque;

    @Test
    public void init() {
        videotheque = new Videotheque();

        assertEquals(videotheque.getListeClients(), new ArrayList<Client>());
        //assertEquals(videotheque.getListeProduits(), new ArrayList<Produit>());
    }

    @Test 
    public void ajouterClient() {
        videotheque = new Videotheque();

        Client clientFidele = new Fidele(0, "ROBERT", "Nicolas");
        Client clientOccasionnel = new Occasionnel(1, "DI PAOLO", "Hugo");

        videotheque.ajouterClient(clientFidele);
        videotheque.ajouterClient(clientOccasionnel);

        assertEquals(videotheque.getListeClients().get(0), clientFidele);
        //assertEquals(videotheque.getListeClients().get(1), clientOccasionnel);

        System.out.println("aze");
    }

    @Test 
    public void ajouterProduit() {
        videotheque = new Videotheque();

        BD bd = new BD(0, "bd", 10.0f);
        Roman roman = new Roman(0, "roman", 10.0f);
        ManuelScolaire manuelScolaire = new ManuelScolaire(0, "ManuelScolaire", 10.0f);
        DVD dvd = new DVD(0, "dvd", 10.0f);
        Dictionnaire dictionnaire = new Dictionnaire(0, "dictionnaire", 10.0f);

        videotheque.ajouterProduit(bd);
        videotheque.ajouterProduit(roman);
        videotheque.ajouterProduit(manuelScolaire);
        videotheque.ajouterProduit(dvd);
        videotheque.ajouterProduit(dictionnaire);

        assertEquals(videotheque.getListeProduits().get(0), bd);
        //assertEquals(videotheque.getListeProduits().get(1), roman);
        //assertEquals(videotheque.getListeProduits().get(2), manuelScolaire);
        //assertEquals(videotheque.getListeProduits().get(3), dvd);
        //assertEquals(videotheque.getListeProduits().get(4), dictionnaire);
    }

    @Test 
    public void getListeProduit() {
        videotheque = new Videotheque();

        assertEquals(videotheque.getListeProduits(), new ArrayList<Produit>());
    }

    /*
    @Test 
    public void getListeProduitDisponible() {
        videotheque = new Videotheque();
        BD bd = new BD(0, "bd", 10.0f);
        Roman roman = new Roman(0, "roman", 10.0f);
        ManuelScolaire manuelScolaire = new ManuelScolaire(0, "ManuelScolaire", 10.0f);
        DVD dvd = new DVD(0, "dvd", 10.0f);
        Dictionnaire dictionnaire = new Dictionnaire(0, "dictionnaire", 10.0f);

        bd.setDisponible(false);
        roman.setDisponible(false);
        manuelScolaire.setDisponible(false);
        dvd.setDisponible(false);
        dictionnaire.setDisponible(true);

        videotheque.ajouterProduit(bd);
        videotheque.ajouterProduit(roman);
        videotheque.ajouterProduit(manuelScolaire);
        videotheque.ajouterProduit(dvd);
        videotheque.ajouterProduit(dictionnaire);

        assertEquals(videotheque.recupererStockDisponible().get(0), dictionnaire);
    } 

    @Test 
    public void getListeProduitIndisponible() {
        videotheque = new Videotheque();
        System.out.println(videotheque.recupererStockDisponible());
        //assertEquals(videotheque.recupererStockDisponible(), new ArrayList<Produit>());

    }*/
    

}
