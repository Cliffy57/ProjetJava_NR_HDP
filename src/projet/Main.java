package projet;

import java.util.Date;

import projet.client.*;
import projet.produit.*;

public class Main {

    Main() {
        Client nicolas = new Occasionnel(0, "robert", "nicolas");
        Videotheque videotheque = new Videotheque();
        videotheque.ajouterClient(nicolas);

        Commande commande = new Commande(0, new Date(), new Date());
        nicolas.addCommande(commande);
        
        Produit produit = new CD(0, "super cd", 100);

        Emprunt emprunt = new Emprunt(new Date(), new Date());
        emprunt.addProduit(produit);

        commande.addEmprunt(emprunt);

        
    }
    
}
