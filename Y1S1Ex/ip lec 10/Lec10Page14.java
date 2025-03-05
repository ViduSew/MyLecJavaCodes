import java.util.Scanner;

public class Lec10Page14{
    public static double calcHypotenuse(double side1,double side2){
        double hypotenuse;
        hypotenuse=Math.sqrt(Math.pow(side1,2)+ Math.pow(side2,2));
        System.out.println("Hypotenuse is "+hypotenuse);
        return hypotenuse;
    }
    
    public static void testCalcHypotenuse(){
        assert Math.abs(calcHypotenuse(3,4)-5)<0.000001;
        assert Math.abs(calcHypotenuse(5,12)-13)<0.000001;
        assert Math.abs(calcHypotenuse(8,15)-17)<0.000001;
        System.out.println("Assert checkup passed!");
    }
    
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double s1,s2;
        System.out.println("Enter first side length:");
        s1=input.nextDouble();
        System.out.println("Enter second side length:");
        s2=input.nextDouble();
        calcHypotenuse(s1,s2);
        testCalcHypotenuse();
    }  
}
