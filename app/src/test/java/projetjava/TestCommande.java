package projetjava;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Calendar;
import java.util.Calendar;

import org.junit.Test;

import projetjava.controllers.client.Commande;
import projetjava.controllers.client.Emprunt;
import projetjava.controllers.produit.BD;

public class TestCommande {
    @Test 
    public void getIdentifiant() {
        Calendar deb = Calendar.getInstance();
        deb.set(2002, 8, 25);

     

        Commande com = new Commande(0, deb.getTime(), 0.f);

        assertEquals(com.getIndentifiant(), 0);
    }

    @Test
    public void setIdentifiant() {
        Calendar deb = Calendar.getInstance();
        deb.set(2002, 8, 25);

        Calendar fin = Calendar.getInstance();
        fin.set(2002, 8, 26);

        Commande com = new Commande(0, deb.getTime(), 0f);

        com.setIndentifiant(1);

        assertEquals(com.getIndentifiant(), 1);
    }

    @Test 
    public void getCalendar() {
        Calendar deb = Calendar.getInstance();
        deb.set(2002, 8, 25);

        Calendar fin = Calendar.getInstance();
        fin.set(2002, 8, 26);
        Commande com = new Commande(0, deb.getTime(), 0f);
        
        assertEquals(com.getDateCrea(), deb);
        assertEquals(com.getDateFin(), 0f);
    }

    @Test 
    public void getListeClients() {
        Calendar deb = Calendar.getInstance();
        deb.set(2002, 8, 25);

        Calendar fin = Calendar.getInstance();
        fin.set(2002, 8, 26);
        Commande com = new Commande(0, deb.getTime(), 0f);

        assertEquals(com.getListeEmprunts(), new ArrayList<Emprunt>());
    }

    @Test 
    public void addListeEmprunt() {
        Calendar deb = Calendar.getInstance();
        deb.set(2002, 8, 25);

        Calendar fin = Calendar.getInstance();
        fin.set(2002, 8, 26);
        Commande com = new Commande(0, deb.getTime(), 0f);

        Emprunt emprunt = new Emprunt(deb.getTime(), fin.getTime(), new BD(0, "a", 0f));
        

        com.addEmprunt(emprunt);

        assertEquals(com.getListeEmprunts().get(0), emprunt);
    }
}
