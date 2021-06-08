package projetjava;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.Date;

import org.junit.Test;

import projetjava.controllers.client.Commande;
import projetjava.controllers.client.Emprunt;

public class TestCommande {
    @Test 
    public void getIdentifiant() {
        Date deb = Date.getInstance();
        deb.set(2002, 8, 25);

        Date fin = Date.getInstance();
        fin.set(2002, 8, 26);

        Commande com = new Commande(0, deb, fin);

        assertEquals(com.getIndentifiant(), 0);
    }

    @Test
    public void setIdentifiant() {
        Date deb = Date.getInstance();
        deb.set(2002, 8, 25);

        Date fin = Date.getInstance();
        fin.set(2002, 8, 26);

        Commande com = new Commande(0, deb, fin);

        com.setIndentifiant(1);

        assertEquals(com.getIndentifiant(), 1);
    }

    @Test 
    public void getDate() {
        Date deb = Date.getInstance();
        deb.set(2002, 8, 25);

        Date fin = Date.getInstance();
        fin.set(2002, 8, 26);
        Commande com = new Commande(0, deb, fin);
        
        assertEquals(com.getDateCrea(), deb);
        assertEquals(com.getDateFin(), fin);
    }

    @Test 
    public void getListeClients() {
        Date deb = Date.getInstance();
        deb.set(2002, 8, 25);

        Date fin = Date.getInstance();
        fin.set(2002, 8, 26);
        Commande com = new Commande(0, deb, fin);

        assertEquals(com.getListeEmprunts(), new ArrayList<Emprunt>());
    }

    @Test 
    public void addListeEmprunt() {
        Date deb = Date.getInstance();
        deb.set(2002, 8, 25);

        Date fin = Date.getInstance();
        fin.set(2002, 8, 26);
        Commande com = new Commande(0, deb, fin);

        Emprunt emprunt = new Emprunt(deb, fin);

        com.addEmprunt(emprunt);

        assertEquals(com.getListeEmprunts().get(0), emprunt);
    }
}
