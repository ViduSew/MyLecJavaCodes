import java.util.Scanner;

public class ComInt{
	public static void main(String[] args){

		System.out.println("Enter an Integer:");
		Scanner I1=new Scanner(System.in);
		int I11=I1.nextInt();

		System.out.println("Enter another Integer:");
		Scanner I2=new Scanner(System.in);
		int I22=I1.nextInt();

		if (I11==I22){
			System.out.println(I11+"and"+I22+"are equal.");
		}
	}
}