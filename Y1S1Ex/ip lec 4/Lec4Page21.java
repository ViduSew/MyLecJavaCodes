//Read And Display Flavour Type With SwitchnCase
import java.util.Scanner;

public class Lec4Page21{

	public static void main(String[] args){
            Scanner input=new Scanner(System.in);
            char flavourType;
            
            System.out.print("Welcome!\n\nThis is our Flavour Menue\n\n");
            System.out.print("Type\tFlavour\nC\tChocolate\nS\tStrawbery\nV\tVanila\n\n");
            System.out.print("Please Let Us Know Your Flavour.\nEnter Your Flavour Type:");
            flavourType=input.next().toLowerCase().charAt(0);
            
           switch(flavourType){
               case 'c':System.out.println("You Entered You Prefer Chocolate.Thank You.");
               break;
               
               case 's':System.out.println("You Entered You Prefer Strawberry.Thank You.");
               break;
               
               case 'v':System.out.println("You Entered You Prefer Vanila.Thank You.");
               break;
           }
        }		
}