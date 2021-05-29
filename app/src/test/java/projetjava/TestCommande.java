package projetjava;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import projetjava.client.Commande;
import projetjava.client.Emprunt;

public class TestCommande {
    @Test 
    public void getIdentifiant() {
        Calendar deb = Calendar.getInstance();
        deb.set(2002, 8, 25);

        Calendar fin = Calendar.getInstance();
        fin.set(2002, 8, 26);

        Commande com = new Commande(0, deb, fin);

        assertEquals(com.getIndentifiant(), 0);
    }

    @Test
    public void setIdentifiant() {
        Calendar deb = Calendar.getInstance();
        deb.set(2002, 8, 25);

        Calendar fin = Calendar.getInstance();
        fin.set(2002, 8, 26);

        Commande com = new Commande(0, deb, fin);

        com.setIndentifiant(1);

        assertEquals(com.getIndentifiant(), 1);
    }

    @Test 
    public void getDate() {
        Calendar deb = Calendar.getInstance();
        deb.set(2002, 8, 25);

        Calendar fin = Calendar.getInstance();
        fin.set(2002, 8, 26);
        Commande com = new Commande(0, deb, fin);
        
        assertEquals(com.getDateCrea(), deb);
        assertEquals(com.getDateFin(), fin);
    }

    @Test 
    public void getListeClients() {
        Calendar deb = Calendar.getInstance();
        deb.set(2002, 8, 25);

        Calendar fin = Calendar.getInstance();
        fin.set(2002, 8, 26);
        Commande com = new Commande(0, deb, fin);

        assertEquals(com.getListeEmprunts(), new ArrayList<Emprunt>());
    }

    @Test 
    public void addListeEmprunt() {
        Calendar deb = Calendar.getInstance();
        deb.set(2002, 8, 25);

        Calendar fin = Calendar.getInstance();
        fin.set(2002, 8, 26);
        Commande com = new Commande(0, deb, fin);

        Emprunt emprunt = new Emprunt(deb, fin);

        com.addEmprunt(emprunt);

        assertEquals(com.getListeEmprunts().get(0), emprunt);
    }
}
