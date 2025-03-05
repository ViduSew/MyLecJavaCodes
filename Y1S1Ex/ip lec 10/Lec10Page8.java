import java.util.Scanner;

public class Lec10Page8{
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int number;
        System.out.println("Enter An Integer:");
        number=input.nextInt();
        assert number>10:"Input is less than or equal to 10";
        
    }
}