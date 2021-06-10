package projetjava;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import projetjava.controllers.client.*;
import projetjava.controllers.produit.*;



public class TestClient {
    @Test 
    public void getIdentifiant() {
        Client client = new Fidele(0, "ROBERT", "Nicolas");

        assertEquals(client.getIdentifiant(), 0);
    }

    @Test
    public void setIdentifiant() {
        Client client = new Fidele(0, "ROBERT", "Nicolas");
        
        client.setIdentifiant(1);

        assertEquals(client.getIdentifiant(), 1);
    }

    @Test 
    public void getNom() {
        Client client = new Fidele(0, "ROBERT", "Nicolas");

        assertEquals(client.getNom(), "ROBERT");
    }

    @Test 
    public void setNom() {
        Client client = new Fidele(0, "ROBERT", "Nicolas");
        client.setNom("aa");

        assertEquals(client.getNom(), "aa");
    }

    @Test 
    public void getPrenom() {
        Client client = new Fidele(0, "ROBERT", "Nicolas");
        assertEquals(client.getPrenom(), "Nicolas");
    }

    @Test 
    public void setPrenom() {
        Client client = new Fidele(0, "ROBERT", "Nicolas");
        client.setPrenom("bb");
        assertEquals(client.getPrenom(), "bb");
    }

    
}
