package projetjava.views.gui.pages;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import projetjava.controllers.Videotheque;
import projetjava.controllers.client.Client;
import projetjava.controllers.client.Fidele;
import projetjava.controllers.client.Occasionnel;
import projetjava.controllers.produit.Produit;
import projetjava.views.gui.elements.Tableau;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Clients extends Tableau {

    public Clients(Videotheque v) {


        super(new String[] {"id", "nom", "prenom", "type", "supprimer"}, new Object[][] { });

        JPanel panel = this;

        JTable tableau = (JTable) this.getComponent(1);
        DefaultTableModel tableModel = (DefaultTableModel) tableau.getModel();

        ArrayList<Client> listeClients = v.getListeClients();

        for (Client c : listeClients) {
            tableModel.addRow(new Object[] {c.getIdentifiant(), c.getNom(), c.getPrenom(), c.getClass().getSimpleName(), false});
        }

        JPanel controles = new JPanel();
        JButton add = new JButton("+");

        JPanel options = new JPanel();
        options.add(new JLabel("id"));
        options.add(new JTextField(5));
        options.add(new JLabel("nom"));
        options.add(new JTextField(5));
        options.add(new JLabel("prenom"));
        options.add(new JTextField(5));
        options.add(new JLabel("type"));
        options.add(new JTextField(5));


        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(panel.getParent(), options, "titre", JOptionPane.ERROR_MESSAGE);
                
                tableModel.addRow(new Object[] {
                    ((JTextField) options.getComponent(1)).getText(), 
                    ((JTextField) options.getComponent(3)).getText(), 
                    ((JTextField) options.getComponent(5)).getText(), 
                    ((JTextField) options.getComponent(7)).getText(), 
                    false
                });

                Integer id = Integer.valueOf(((JTextField) options.getComponent(1)).getText());
                String nom = ((JTextField) options.getComponent(3)).getText();
                String prenom = ((JTextField) options.getComponent(5)).getText();
                String type = ((JTextField) options.getComponent(7)).getText();

                if (type == "occasionnel") {
                    v.ajouterClient(new Occasionnel(id, nom, prenom));
                } else if (type == "fidele") {
                    v.ajouterClient(new Fidele(id, nom, prenom));
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
        this.add(new JLabel(String.format("Il y a au total %s clients dans la Vidéothèque", listeClients.size())), BorderLayout.EAST);
    }
}