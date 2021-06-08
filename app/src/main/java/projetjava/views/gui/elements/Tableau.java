package projetjava.views.gui.elements;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tableau extends JPanel {
    public Tableau(String[] nomColonnes, Object[][] donnees) {
        this.setLayout(new BorderLayout());

        JPanel panel = this;

        // tableau
        DefaultTableModel model = new DefaultTableModel(donnees, nomColonnes);
        
        JTable table = new JTable(model) {
            /*public Class getColumnClass(int column) {
                //renvoie Boolean.class
                return getValueAt(0, column).getClass(); 
            }*/
        };

        
        
        // ajout de lignes
        

        this.add(table.getTableHeader(), BorderLayout.NORTH);
        this.add(table, BorderLayout.CENTER);
        
        this.add(new JButton("x"), BorderLayout.SOUTH);
        

        

    }

    public void ajouterInfo() {

    }
} 