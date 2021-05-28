package projetjava.client;

import java.util.ArrayList;
import java.util.Date;

public class Commande {
    protected int indentifiant;
    protected Date dateCrea;
    protected Date dateFin;
    protected float reduction;
    protected ArrayList<Emprunt> listeEmprunts;
    
    public Commande(int identifiant, Date dateCrea, Date dateFin) {
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

    public Date getDateCrea() {
        return this.dateCrea;
    }

    public void setDateCrea(Date dateCrea) {
        this.dateCrea = dateCrea;
    }

    public Date getDateFin() {
        return this.dateFin;
    }

    public void setDateFin(Date dateFin) {
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
