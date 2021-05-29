package projetjava.client;

import java.util.ArrayList;
import java.util.Calendar;

public class Commande {
    protected int indentifiant;
    protected Calendar dateCrea;
    protected Calendar dateFin;
    protected float reduction;
    protected ArrayList<Emprunt> listeEmprunts;

    /**
     * cree un objet Commande 
     * @param identifiant l'identifiant de l'objet
     * @param dateCrea la date de création
     * @param dateFin la date de fin
     */
    
    public Commande(int identifiant, Calendar dateCrea, Calendar dateFin) {
        this.indentifiant = identifiant;
        this.dateCrea = dateCrea;
        this.dateFin = dateFin;
        this.reduction = 0.2f;
        this.listeEmprunts = new ArrayList<Emprunt>();
    }

    /**
     * renvoie l'identifiant de la commande
     * @return un identifiant
     */

    public int getIndentifiant() {
        return this.indentifiant;
    }

    /**
     * permet de définir l'identifiant d'une commande
     * @param indentifiant
     */

    public void setIndentifiant(int indentifiant) {
        this.indentifiant = indentifiant;
    }

    /**
     * renvoie la date de création de la Commande
     * @return date de création de la Commande
     */

    public Calendar getDateCrea() {
        return this.dateCrea;
    }

    /**
     * permet de définir la date de création d'une Commande
     * @param dateCrea
     */

    public void setDateCrea(Calendar dateCrea) {
        this.dateCrea = dateCrea;
    }

    /**
     * renvoie la date de fin d'une Commande
     * @return la date de fin de la Commande
     */

    public Calendar getDateFin() {
        return this.dateFin;
    }

    /**
     * permet de définir la date de fin d'une Commande
     * @param la date de fin de la COmmande
     */

    public void setDateFin(Calendar dateFin) {
        this.dateFin = dateFin;
    }

    /**
     * renvoie la réduction d'une COmmande
     * @return réduction
     */

    public float getReduction() {
        return this.reduction;
    }

    /**
     * permet de définir une réduction sur une Commande
     * @param reduction
     */

    public void setReduction(float reduction) {
        this.reduction = reduction;
    }

    /**
     * renvoie la liste des Emprunts compris dans cette Commande
     * @return
     */

    public ArrayList<Emprunt> getListeEmprunts() {
        return this.listeEmprunts;
    }

    /*public void setEmprunts(ArrayList<Produit> listeEmprunts) {
        this.listeEmprunts = listeEmprunts;
    }*/

    /**
     * permet d'ajouter un objet Emprunt a la liste des emprunts
     * @param emprunt l'emprunt a ajouter a la liste
     */

    public void addEmprunt(Emprunt emprunt) {
        this.listeEmprunts.add(emprunt);
    }
    
    public void montantCommande(){}

    public void montantCommandeReduction(){}
}
