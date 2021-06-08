package projetjava.views.gui.pages;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JViewport;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import projetjava.controllers.Videotheque;
import projetjava.controllers.produit.Produit;
import projetjava.views.gui.elements.Tableau;

public class Produits extends Tableau  {
    public Produits(Videotheque v) {
     
        super(new String[] {"id", "titre", "tarif" , "type", "supprimer"}, new Object[][] { });
        
        JPanel panel = this;
        

        JTable tableau = (JTable) this.getComponent(1);
        DefaultTableModel tableModel = (DefaultTableModel) tableau.getModel();

        ArrayList<Produit> listeProduits = v.getListeProduits();

        for (Produit p : listeProduits) {
            tableModel.addRow(new Object[] {p.getId(), p.getTitre(), p.getTarif(), p.getClass().getSimpleName(), false});
        }

        JButton add = new JButton("+");
    
        String[] choix = {"bd", "dvd", "roman", "cd"};

        JPanel options = new JPanel();
        options.add(new JLabel("titre"));
        options.add(new JTextField(5));
        options.add(new JLabel("tarif"));
        options.add(new JTextField(5));
        options.add(new JLabel("type"));
        options.add(new JComboBox<>(choix));

        add.addActionListener(new ActionListener() {
           
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(panel.getParent(), options, "tirte", JOptionPane.ERROR_MESSAGE);
                
                tableModel.addRow(new Object[] {
                    0,
                    ((JTextField) options.getComponent(1)).getText(), 
                    ((JTextField) options.getComponent(3)).getText(), 
                    ((JComboBox) options.getComponent(5)).getSelectedItem().toString(), 
                    false
                });
                
            }
        });
        this.add(add, BorderLayout.SOUTH);

        //this.add(table);
        this.add(new JLabel(String.format("Il y a au total %s produits dans la Vidéothèque", listeProduits.size())), BorderLayout.EAST);
    

        
    }
}