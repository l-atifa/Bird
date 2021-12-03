import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    Bird b = new Bird("toucan", 43, 38, true);
    System.out.println(b);
    System.out.println("The bird laid " + b.layEggs() + " eggs.");
    

    Bird a = new Bird();
    System.out.println("\nEnter a species of bird");
    String newSpe = scan.nextLine();
    a.setSpecies(newSpe);
    System.out.println("Bird a is a " + a.getSpecies());
    System.out.println("How many miles did a travel?");
    int dist = scan.nextInt();
    a.flyTime(dist);
    

    System.out.println("\nBird a and Bird b are equal: " + a.equals(b));

    System.out.println("\nCreate your own bird!");
    System.out.println("Start by entering its species.");
    scan.nextLine();
    String ySp = scan.nextLine();
    System.out.println("Enter its wing length.");
    double yWL = scan.nextDouble();
    System.out.println("Enter its flight speed.");
    int yS = scan.nextInt();
    System.out.println("What sex is the bird?");
    scan.nextLine();
    String gender = scan.nextLine();
    boolean yGF = true;
    if (gender.equals("male"))
    {
      yGF = false;
    }
    Bird yours = new Bird(ySp, yWL, yS, yGF);
    System.out.println("Your bird's wings are " + yours.getWingLength() + " inches.");
    
    System.out.println("\nBird b and your Bird are equal: " + b.equals(yours));
  }
}