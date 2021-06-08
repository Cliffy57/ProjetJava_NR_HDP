package projetjava.views.gui.pages;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import projetjava.controllers.Videotheque;
import projetjava.controllers.client.Client;
import projetjava.controllers.client.Commande;
import projetjava.views.gui.elements.Tableau;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Commandes extends Tableau {
    public Commandes(Videotheque v) {


        super(new String[] {"idclient", "idcommande", "datedebut", "reduction", "totalcommandesansreduc", "totalcommandevecreduc", "supprimer"}, new Object[][] { });

        JPanel panel = this;

        JTable tableau = (JTable) this.getComponent(1);
        DefaultTableModel tableModel = (DefaultTableModel) tableau.getModel();

        ArrayList<Commande> listeCommandes = v.getListeCommande();

        for (Client cl : v.getListeClients()) {
            for (Commande c : cl.getCommandeList()) {
                tableModel.addRow(new Object[] {cl.getIdentifiant(), c.getIndentifiant(), c.getDateCrea(), c.getReduction(), c.montantCommande(), c.montantCommandeReduction(), false});
            }
        }

        
        JButton add = new JButton("+");
    
        String[] choix = {"bd", "dvd", "roman", "cd"};

        JPanel options = new JPanel();
        options.add(new JLabel("datedeb"));
        options.add(new JTextField(5));
        options.add(new JLabel("remise"));
        options.add(new JTextField(5));
    

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(panel.getParent(), options, "tirte", JOptionPane.ERROR_MESSAGE);
                
                tableModel.addRow(new Object[] {
                    0,
                    ((JTextField) options.getComponent(1)).getText(), 
                    ((JTextField) options.getComponent(3)).getText(), 
                    false
                });
            }
        });
        this.add(add, BorderLayout.SOUTH);

        //this.add(table);
        this.add(new JLabel(String.format("Il y a au total %s clients dans la Vidéothèque", listeCommandes.size())), BorderLayout.EAST);
    }
}