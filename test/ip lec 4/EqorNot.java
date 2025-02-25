import java.util.Scanner;

public class EqorNot{
	public static void main(String[] args){
		int I1,I2;
		Scanner input=new Scanner (System.in);
		System.out.println("Enter an Integer");
		I1=input.nextInt();
		System.out.println("Enter another Integer");
		I2=input.nextInt();
		if (I1==I2){
			System.out.println(I1+" and "+I2+" are Equal");
		}
		else{
			System.out.println(I1+" and "+I2+" are not Equal");
		}
	}
}