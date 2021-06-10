package projetjava.models;

import java.sql.*;
import java.util.ArrayList;

import projetjava.controllers.client.Client;
import projetjava.controllers.client.Commande;
import projetjava.controllers.client.Emprunt;
import projetjava.controllers.produit.Produit;

public class BDD {
    Connection con = null;

    public BDD() {
        String bdd = "jdbc:mysql:devbdd.iut-metz.univ-lorraine.fr/robert287u_bddprojetjava";
        String user = "";
        String pass = "";

        try {
            this.con = DriverManager.getConnection(bdd, user, pass);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public ArrayList<Client> getClients() throws SQLException {
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM Clients");
        ResultSetMetaData rsmd = rs.getMetaData();
        int nbCols = rsmd.getColumnCount();

        boolean continuer = rs.next();

         while (continuer) {

           

            for (int i = 1; i <= nbCols; i++)
                System.out.print(rs.getString(i) + " ");
                System.out.println();
                continuer = rs.next();
         }

        rs.close();

        return new ArrayList<>();
    }

    public ArrayList<Produit> getProduits() throws SQLException {
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM Produits");
        ResultSetMetaData rsmd = rs.getMetaData();
        int nbCols = rsmd.getColumnCount();

        boolean continuer = rs.next();

         while (continuer) {

           

            for (int i = 1; i <= nbCols; i++)
                System.out.print(rs.getString(i) + " ");
                System.out.println();
                continuer = rs.next();
         }

        rs.close();

        return new ArrayList<>();
    }

    public ArrayList<Commande> getCommandes() throws SQLException {
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM Commandes");
        ResultSetMetaData rsmd = rs.getMetaData();
        int nbCols = rsmd.getColumnCount();

        boolean continuer = rs.next();

         while (continuer) {

           

            for (int i = 1; i <= nbCols; i++)
                System.out.print(rs.getString(i) + " ");
                System.out.println();
                continuer = rs.next();
         }

        rs.close();

        return new ArrayList<>();
    }

    public ArrayList<Emprunt> getEmprunts() throws SQLException {
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM Emprunts");
        ResultSetMetaData rsmd = rs.getMetaData();
        int nbCols = rsmd.getColumnCount();
        
        boolean continuer = rs.next();
         while (continuer) {
            for (int i = 1; i <= nbCols; i++)
                System.out.print(rs.getString(i) + " ");
                System.out.println();
                continuer = rs.next();
         }

        rs.close();

        return new ArrayList<>();
    }
}
