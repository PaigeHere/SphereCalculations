/**
 * Author: Paige Margaret Bartusiak
 * Assignment: 3.3b
 * Date: September 19, 2018
 * 
 *ReadMe: This code takes user input to assign a double value to the variable radius-- the radius being the radious of
 * a sphere. It then uses that double to compute the diameter, circumference, surface area, and volume of the sphere. 
 */
import java.util.Scanner;
  public class SphereCalculations
  {
   public static void main (String [] args) 
  {
     
    Scanner reader = new Scanner(System.in); //reader later used for user input
    final double PI = 3.14; //the constant of pi
    
    //Gets user input for radius
    System.out.print("What is the radius of your sphere (in inches)? " );
    double radius = reader.nextDouble();
    
    //performs calculations using radius
    double diameter = radius * 2.0;
    double circumference = 2.0 * PI * radius;
    double surfaceArea = 4.0 * PI * radius * radius;
    double volume = radius * radius * radius * PI * (4.0 / 3.0);
   
    
    //prints results
    System.out.println("The diameter of the sphere is: " + diameter + " inches");
    System.out.println("The circumference of the sphere is: " + circumference + " inches");
    System.out.println("The area of the sphere is: " + surfaceArea + " square inches");
    System.out.println("The volume of the sphere is: " + volume + " cubic inches");
                                                                    
   
  }
}
