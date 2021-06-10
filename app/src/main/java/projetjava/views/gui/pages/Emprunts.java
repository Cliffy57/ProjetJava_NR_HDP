package projetjava.views.gui.pages;


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
import projetjava.controllers.client.Emprunt;
import projetjava.controllers.produit.BD;
import projetjava.views.gui.elements.Tableau;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class Emprunts extends Tableau {

    public Emprunts(Videotheque v) {
        super(new String[] {"idcom", "produit", "datedebut", "datefin", "supprimer"}, new Object[][] { });

        JPanel panel = this;

        JTable tableau = (JTable) this.getComponent(1);
        DefaultTableModel tableModel = (DefaultTableModel) tableau.getModel();

        ArrayList<Commande> listeClients = v.getListeCommande();

        int totalEmprunts = 0;

        for (Client cl : v.getListeClients()) {
            for (Commande c : cl.getCommandeList()) {
                for (Emprunt e : c.getListeEmprunts()) {
                    totalEmprunts+=1;
                    tableModel.addRow(new Object[] {c.getIndentifiant(), e.getProduit().getTitre(), e.getDateDeb(), e.getDateFin(), false});
                }
                
            }
        }
       
        JPanel controles = new JPanel();
        JButton add = new JButton("+");
    
        String[] choix = {"bd", "dvd", "roman", "cd"};

        JPanel options = new JPanel();
        options.add(new JLabel("idcom"));
        options.add(new JTextField(5));
        options.add(new JLabel("produit"));
        options.add(new JTextField(5));
        options.add(new JLabel("datedeb"));
        options.add(new JTextField(5));
        options.add(new JLabel("datefin"));
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

                int id = Integer.valueOf(((JTextField) options.getComponent(1)).getText());
                String produit = ((JTextField) options.getComponent(3)).getText();
                String datedeb = ((JTextField) options.getComponent(5)).getText();
                String datefin = ((JTextField) options.getComponent(7)).getText();

                

                try {
                    v.ajouterEmprunt(new Emprunt(new SimpleDateFormat("dd/MM/yyyy").parse(datedeb), new SimpleDateFormat("dd/MM/yyyy").parse(datefin), new BD(0, "a", 1.f)));
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
        this.add(new JLabel(String.format("Il y a au total %s clients dans la Vidéothèque", totalEmprunts)), BorderLayout.EAST);
    }
}
