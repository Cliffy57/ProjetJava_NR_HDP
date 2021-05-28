import java.util.Scanner;  // Import the Scanner class

public class Ajout_Client extends Client{

  public Ajout_Client(int identifiant, String nom, String prenom) {
    super(identifiant, nom, prenom);
    //TODO Auto-generated constructor stub
  }
  public static void main(String[] args) {
    Scanner Scanid = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Entrer l'identifiant");

    int identifiant = Scanid.nextInt();  // Read user input
    System.out.println("L'identifiant est: " + identifiant);  // Output user input


    Scanner Scannom = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Entrer le nom");

    String nom = Scannom.nextLine();  // Read user input
    System.out.println("Le nom est: " + nom);  // Output user input

    
    Scanner Scanprenom = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Entrer le prenom");

    String prenom = Scanprenom.nextLine();  // Read user input
    System.out.println("Le prenom est: " + prenom);  // Output user input

    Occasionnel ajdOccasionnel=new Occasionnel(identifiant, nom, prenom);
    
  }
  
}
