package projetjava.client;

import java.util.ArrayList;
import java.util.Calendar;

public class Commande {
    protected int indentifiant;
    protected Calendar dateCrea;
    protected Calendar dateFin;
    protected float reduction;
    protected ArrayList<Emprunt> listeEmprunts;
    
    public Commande(int identifiant, Calendar dateCrea, Calendar dateFin) {
        this.indentifiant = identifiant;
        this.dateCrea = dateCrea;
        this.dateFin = dateFin;
        this.reduction = 0.2f;
        this.listeEmprunts = new ArrayList<Emprunt>();
    }

    public int getIndentifiant() {
        return this.indentifiant;
    }

    public void setIndentifiant(int indentifiant) {
        this.indentifiant = indentifiant;
    }

    public Calendar getDateCrea() {
        return this.dateCrea;
    }

    public void setDateCrea(Calendar dateCrea) {
        this.dateCrea = dateCrea;
    }

    public Calendar getDateFin() {
        return this.dateFin;
    }

    public void setDateFin(Calendar dateFin) {
        this.dateFin = dateFin;
    }

    public float getReduction() {
        return this.reduction;
    }

    public void setReduction(float reduction) {
        this.reduction = reduction;
    }

    public ArrayList<Emprunt> getListeEmprunts() {
        return this.listeEmprunts;
    }

    /*public void setEmprunts(ArrayList<Produit> listeEmprunts) {
        this.listeEmprunts = listeEmprunts;
    }*/

    public void addEmprunt(Emprunt emprunt) {
        this.listeEmprunts.add(emprunt);
    }
    
    public void montantCommande(){}

    public void montantCommandeReduction(){}
}
