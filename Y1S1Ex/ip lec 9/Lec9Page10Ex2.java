import java.util.Scanner;

/*a method called max to determine and return the largest of
 two integers. The integers should be input from the keyboard in the
 main program and pass to max method.*/

public class Lec9Page10Ex2{
    public static void max(int int1,int int2){
        if(int1>int2){
            System.out.println(int1+" is the Largest Number.");
        }
        else{
            System.out.println(int2+" is the Largest Number");
        }
       
    }

    public static void main(String[] args){
        int n1,n2;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an Integer");
        n1=input.nextInt();
        System.out.println("Enter another Integer");
        n2=input.nextInt();
        max(n1,n2);
        
            
    }		
}