import java.util.Scanner; 

public class DisSchool{
	public static void main(String[] args){

		System.out.println("Hello!Plz Enter Your Name:"); 
		Scanner name = new Scanner(System.in);
		String name1 = name.next();

		System.out.println("Hi "+name1+" Now,Enter Your School Name:");
		Scanner school = new Scanner(System.in);
		String school1 = school.next();

		System.out.println("Hi"+" "+ name1+","+"Your School is "+school1+".");
		System.out.println("Thank You!");
	}
}