package projetjava.views.gui;

import javax.swing.*;

import projetjava.controllers.Videotheque;
import projetjava.controllers.client.Client;
import projetjava.controllers.client.Commande;
import projetjava.controllers.client.Emprunt;
import projetjava.controllers.client.Fidele;
import projetjava.controllers.client.Occasionnel;
import projetjava.controllers.produit.BD;
import projetjava.views.gui.elements.MenuGauche;
import projetjava.views.gui.pages.Accueil;
import projetjava.views.gui.pages.Clients;
import projetjava.views.gui.pages.Commandes;
import projetjava.views.gui.pages.Emprunts;
import projetjava.views.gui.pages.Produits;

import java.awt.*;
import java.util.Calendar;


public class GUI extends JFrame {
    public GUI() {
        Videotheque v = new Videotheque();

        for (int i=0;i<10;i++) {
            BD bd = new BD(i, "aze", 10.f);
            v.ajouterProduit(bd);
        }

        for (int i=0;i<5;i++) {
            double random = Math.random();

            Client cl;

            if (random > 0.5) {
                cl = new Occasionnel(i, "a", "b");
            } else {
                cl = new Fidele(i, "a", "b");
            }
           
            for (int x=0;x<10;x++) {
                Commande com = new Commande(x, Calendar.getInstance().getTime(), cl.getReduction());
                cl.addCommande(com);
    
                for (int j=0;j<5;j++) {
                    Emprunt e = new Emprunt(Calendar.getInstance().getTime(), Calendar.getInstance().getTime(), v.getListeProduits().get(0));
                    com.addEmprunt(e);   
                }
            }

            v.ajouterClient(cl);
        }

        // afficher l'accuiel 
        this.setLayout(new BorderLayout());

        // Elements
        JPanel affichage = new JPanel();
        affichage.setLayout(new CardLayout());
        
        affichage.add(new Accueil(), "Accueil");
        affichage.add(new Produits(v), "Produits");
        affichage.add(new Clients(v), "Clients");
        affichage.add(new Commandes(v), "Commandes");
        affichage.add(new Emprunts(v), "Emprunts");

        // Menu de navigation
        MenuGauche menu = new MenuGauche(affichage);
       
        // ajout des éléments
        this.add(menu, BorderLayout.WEST);
        this.add(affichage, BorderLayout.CENTER);

        // paramètres
        this.setVisible(true);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    // changer la page qui est actuellement affichée
    public void changerPage() {

    }
}