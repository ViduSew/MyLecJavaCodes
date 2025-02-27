import java.util.Scanner;
//Display the summation and average of five numbers entered through the keyboard with while statement.
public class Lec5Page9{

	public static void main(String[] args){
            Scanner input=new Scanner(System.in);
            int number=1,userInput,tot=0;
            double avg;
            while (number<=5){
                System.out.println("Enter A Number:");
                userInput=input.nextInt();
                tot+=userInput;
                ++number;
            }
            System.out.println("Total="+tot);
            avg=(double)tot/5;
            System.out.println("Average="+avg);
        }		
}