package projetjava.views.gui.elements;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuGauche extends JPanel {
    private JButton dernierBouttonActive;

    public MenuGauche(JPanel affichage) {
        this.setLayout(new GridLayout(10, 1));
        this.setBackground(Color.black);

        this.add(new JButton("Accueil"));
        this.add(new JButton("Produits"));
        this.add(new JButton("Clients"));
        this.add(new JButton("Commandes")); 
        this.add(new JButton("Emprunts")); 

        this.dernierBouttonActive = (JButton) this.getComponent(0);
        this.dernierBouttonActive.setBackground(Color.YELLOW);

        for(Component c : this.getComponents()) {
            JButton b = (JButton) c;
            b.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    CardLayout cl = (CardLayout) affichage.getLayout();
                    cl.show(affichage, b.getText());

                    b.setBackground(Color.YELLOW);
                    
                    
                    setDernierBouttonActive(b);
                }
            });
        } 
    }

    public JButton getDernierBouttonActive() {
        return this.dernierBouttonActive;
    }

    public void setDernierBouttonActive(JButton boutton) {
        if (this.dernierBouttonActive != boutton) {
            this.dernierBouttonActive.setBackground(new JButton().getBackground());
            this.dernierBouttonActive = boutton;
        }
       
    }
}