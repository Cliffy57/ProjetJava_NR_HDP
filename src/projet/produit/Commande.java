import java.util.ArrayList;
import java.util.Date;

public class Commande {

    protected int indentifiant;
    protected Date dateCrea;
    protected Date dateFin;
    protected float reduction;
    protected ArrayList<String> Emprunts = new ArrayList<String>();


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

    public ArrayList<String> getEmprunts() {
        return this.Emprunts;
    }

    public void setEmprunts(ArrayList<String> Emprunts) {
        this.Emprunts = Emprunts;
    }
    
    public void montantCommande(){}

    public void montantCommandeReduction(){}
}
