import java.util.Scanner;

public class Circle{
	public static final double PI=3.14159;

	public static void main(String[] args){
		double area,circumference;
		System.out.println("Enter the Radius");
		Scanner input = new Scanner(System.in);
		double radius=input.nextDouble();
		area = PI*radius*radius;
		circumference=2*PI*radius;
		System.out.println("area="+area);
		System.out.println("Circumference"+circumference);

	}
}