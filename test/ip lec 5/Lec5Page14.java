import java.util.Scanner;
// Prompt the user to enter a series of integers from the keyboard. If the user enters-1, the program should display ”End of Program” and terminate.
public class Lec5Page14{

	public static void main(String[] args){
            Scanner input=new Scanner(System.in);
            int number=0;
            while (number!=-1){
                System.out.println("Enter A Number");
                number=input.nextInt();
            }
            System.out.println("End Of Program.");
        }		
}