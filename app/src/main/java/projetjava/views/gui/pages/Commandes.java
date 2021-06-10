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
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Commandes extends Tableau {
    public Commandes(Videotheque v) {


        super(new String[] {"idclient", "idcommande", "datedebut", "reduction", "totalcommandesansreduc", "totalcommandevecreduc", "supprimer"}, new Object[][] {});

        JPanel panel = this;

        JTable tableau = (JTable) this.getComponent(1);
        DefaultTableModel tableModel = (DefaultTableModel) tableau.getModel();

        ArrayList<Commande> listeCommandes = v.getListeCommande();

        int totalCommandes = 0;

        for (Client cl : v.getListeClients()) {
            for (Commande c : cl.getCommandeList()) {
                totalCommandes += 1;
                tableModel.addRow(new Object[] {cl.getIdentifiant(), c.getIndentifiant(), c.getDateCrea(), c.getReduction(), c.montantCommande(), c.montantCommandeReduction(), false});
            }
        }

        JPanel controles = new JPanel();
        JButton add = new JButton("+");
    
        String[] choix = {"bd", "dvd", "roman", "cd"};

        JPanel options = new JPanel();
        options.add(new JLabel("idclient"));
        options.add(new JTextField(5));
        options.add(new JLabel("idcom"));
        options.add(new JTextField(5));
        options.add(new JLabel("datedeb"));
        options.add(new JTextField(5));
    

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(panel.getParent(), options, "titre", JOptionPane.ERROR_MESSAGE);
                
                tableModel.addRow(new Object[] {
                    ((JTextField) options.getComponent(1)).getText(),
                    ((JTextField) options.getComponent(3)).getText(), 
                    ((JTextField) options.getComponent(5)).getText(), 
                    0,
                    0,
                    0,
                    false
                });

                int id = Integer.valueOf(((JTextField) options.getComponent(1)).getText());
                String datedeb = ((JTextField) options.getComponent(3)).getText();
                String datefin = ((JTextField) options.getComponent(5)).getText();
                String type = ((JTextField) options.getComponent(7)).getText();

                try {
                    v.ajouterCommande(new Commande(id, new SimpleDateFormat("dd/MM/yyyy").parse(datedeb), 0f));
                } catch (ParseException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
        });
        JButton del = new JButton("x");

        del.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                tableModel.removeRow(tableau.getSelectedRow());

                String a = (String) tableModel.getValueAt(tableau.getSelectedRow(), 0);
                Integer b = Integer.valueOf(a);
                v.supprimerClient(b);
            }
        });

        controles.add(del);
        controles.add(add);
        this.add(controles, BorderLayout.SOUTH);

        //this.add(table);
        this.add(new JLabel(String.format("Il y a au total %s clients dans la Vidéothèque", totalCommandes)), BorderLayout.EAST);
    }
}