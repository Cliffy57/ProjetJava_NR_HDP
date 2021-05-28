import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class GUI {

 public GUI() {

  JFrame frame = new JFrame();

  JPanel panel = new JPanel();   
  panel.setBorder(BorderFactory.createEmptyBorder(300,300,100,300));
  frame.add(panel,BorderLayout.CENTER);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setTitle("Vidéotheque");
  frame.pack();
  frame.setVisible(true);
  frame.setResizable(true);
  frame.getContentPane().setBackground(Color.green); //le fond de la Frame est verte
  panel.setBackground(new Color(46,32,156)); //le fond du panel est bleu fonce

  ImageIcon image = new ImageIcon("Icon.png");
  frame.setIconImage(image.getImage());//change l'icone de la Frame

  JLabel label = new JLabel("Videotheque");
  label.setIcon(image);
  label.setHorizontalAlignment(JLabel.CENTER);
  label.setVerticalAlignment(JLabel.CENTER);
  label.setForeground(new Color(255,30,24));
  panel.add(label);

  Border border = BorderFactory.createLineBorder(Color.pink,3);
  

 }

 public static void main(String [] args){

    new GUI();

    /*
    JFrame test = new JFrame();
    test.setTitle("Vive La Vie");
    test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    test.setResizable(false);
    test.setSize(300, 300);
    test.setVisible(true);

    ImageIcon logo = new ImageIcon("Icon.png");
    test.setIconImage(logo.getImage());
    test.getContentPane().setBackground(new ColorUIResource(80,21,244));*/

  }


}