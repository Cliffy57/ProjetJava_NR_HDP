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
     * @param identifiant identifiant de l'objet
     * @param dateCrea date de création
     * @param dateFin date de fin
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
     * @return identifiant de la commande
     */

    public int getIndentifiant() {
        return this.indentifiant;
    }

    /**
     * définis un identifiant pour la commande
     * @param indentifiant identifiant de la commande
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
     * définis la date de création d'une Commande
     * @param dateCrea date de création de la Commande
     */

    public void setDateCrea(Calendar dateCrea) {
        this.dateCrea = dateCrea;
    }

    /**
     * renvoie la date de fin de la Commande
     * @return date de fin de la Commande
     */

    public Calendar getDateFin() {
        return this.dateFin;
    }

    /**
     * définis la date de fin d'une Commande
     * @param dateFin date de fin de la COmmande
     */

    public void setDateFin(Calendar dateFin) {
        this.dateFin = dateFin;
    }

    /**
     * renvoie la réduction à appliquer à la Commande
     * @return réduction réduction a appliquer
     */

    public float getReduction() {
        return this.reduction;
    }

    /**
     * définis la réduction à appliquer à la Commande
     * @param reduction réduction a appliquer
     */

    public void setReduction(float reduction) {
        this.reduction = reduction;
    }

    /**
     * renvoie la liste des Emprunts de la Commande
     * @return liste des emprunts
     */

    public ArrayList<Emprunt> getListeEmprunts() {
        return this.listeEmprunts;
    }

    /*public void setEmprunts(ArrayList<Produit> listeEmprunts) {
        this.listeEmprunts = listeEmprunts;
    }*/

    /**
     * ajoute un emprunt à la Commande
     * @param emprunt emprunter à ajouter a la liste
     */

    public void addEmprunt(Emprunt emprunt) {
        this.listeEmprunts.add(emprunt);
    }
    
    public void montantCommande(){}

    public void montantCommandeReduction(){}
}
