//Read Flavor and Display Flavour with If-Else 
import java.util.Scanner;

public class Lec4Page17{

	public static void main(String[] args){
            Scanner input=new Scanner(System.in);
            char flavourType;
            
            System.out.print("Welcome!\n\nThis is our Flavour Menue\n\n");
            System.out.print("Type\tFlavour\nC\tChocolate\nS\tStrawbery\nV\tVanila\n\n");
            System.out.print("Please Let Us Know Your Flavour.\nEnter Your Flavour Type:");
            flavourType=input.next().toLowerCase().charAt(0);
            
           if(flavourType=='c'){
               System.out.println("You Entered You Prefer Chocolate.");
           }
           else if(flavourType=='s'){
               System.out.println("You Entered You Prefer Strawberry.");
           }
           else if(flavourType=='v'){
               System.out.println("You Entered You Prefer Vanila.");
           }
        }		
}