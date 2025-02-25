import java.util.Scanner;
import java.util.Arrays;

public class Lec7Exercise1{

	public static void main(String[] args){
            Scanner input=new Scanner(System.in);
            int counts[]=new int[10];
            int i;
            
            for(i=0;i<counts.length;i++){
               counts[i]=-1; 
            }
            
            for(i=0;i<counts.length;i++){
                
                System.out.println("Enter a number between 1-100");
                int userInput=input.nextInt();
                
                if (userInput<10||userInput>100){
                    System.out.println("The number you entered is out of range.Plz enter a value in range.Thank You!");
                    i=--i;                    
                }
                
                else{
                counts[i]=userInput;
                }
            }
            
            System.out.println("Index\t\tValue");
            
            for(i=0;i<counts.length;i++){
                System.out.println(i+"\t\t"+counts[i]);
            }
            
            int max=Arrays.stream(counts).max().orElseThrow();
            System.out.println("Maximum number is "+max);           
        }		
}