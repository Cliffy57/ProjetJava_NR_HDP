/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package projetjava;

import projetjava.Videotheque;
import projetjava.client.Client;
import projetjava.client.Fidele;
import projetjava.client.Occasionnel;
import projetjava.client.Produit;
import projetjava.produit.BD;
import projetjava.produit.DVD;
import projetjava.produit.Dictionnaire;
import projetjava.produit.ManuelScolaire;
import projetjava.produit.Roman;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

public class TestVideotheque {
    // vidéothèque
    private final Videotheque videotheque = new Videotheque();

    // clients
    private final Client clientFidele = new Fidele(0, "ROBERT", "Nicolas");
    private final Client clientOccasionnel = new Occasionnel(1, "DI PAOLO", "Hugo");

    // produits
    // il manque des trucs
    private final BD bd = new BD(0, "bd", 10.0f);
    private final Roman roman = new Roman(0, "roman", 10.0f);
    private final ManuelScolaire manuelScolaire = new ManuelScolaire(0, "ManuelScolaire", 10.0f);
    private final DVD dvd = new DVD(0, "dvd", 10.0f);
    private final Dictionnaire dictionnaire = new Dictionnaire(0, "dictionnaire", 10.0f);

    @Test
    public void init() {
        assertEquals(videotheque.getListeClients(), new ArrayList<Client>());
        assertEquals(videotheque.getListeProduits(), new ArrayList<Produit>());
    }

    @Test 
    public void ajouterClient() {
        videotheque.ajouterClient(clientFidele);
        videotheque.ajouterClient(clientOccasionnel);

        assertEquals(videotheque.getListeClients().get(0), clientFidele);
        assertEquals(videotheque.getListeClients().get(1), clientOccasionnel);

        System.out.println("aze");
    }

    @Test 
    public void ajouterProduit() {
        videotheque.ajouterProduit(bd);
        videotheque.ajouterProduit(roman);
        videotheque.ajouterProduit(manuelScolaire);
        videotheque.ajouterProduit(dvd);
        videotheque.ajouterProduit(dictionnaire);

        assertEquals(videotheque.getListeProduits().get(0), bd);
        assertEquals(videotheque.getListeProduits().get(1), roman);
        assertEquals(videotheque.getListeProduits().get(2), manuelScolaire);
        assertEquals(videotheque.getListeProduits().get(3), dvd);
        assertEquals(videotheque.getListeProduits().get(4), dictionnaire);
    }
}