import java.util.Scanner;
import java.util.Arrays;

public class Lec7Excercise2{

	public static void main(String[] args){
            Scanner input=new Scanner(System.in);
            double salary[]=new double[8];
            int i;
            
            for(i=0;i<salary.length;i++){
                System.out.println("Enter the salary of the employee"+(i+1)+":");
                salary[i]=input.nextDouble();
            }
            
            System.out.println("Employee Number\t\tSalary");
            
            for(i=0;i<salary.length;i++){
                System.out.println((i+1)+"\t\t\t"+salary[i]);
            }
            int count1=0,count2=0,count3=0;
            
            for(i=0;i<salary.length;i++){
                if (salary[i]<10000){
                    count1=++count1;
                }
                else if (10000<=salary[i] && salary[i]<=50000){
                    count2=++count2;
                }
                else if (salary[i]>50000){
                    count3=++count3;
                }
            }
            
            System.out.println("Number of Employees Below Rs.10,000:"+count1);
            System.out.println("Number of Employees From Rs.10,000 To Rs.50,000:"+count2);
            System.out.println("Number of Employees Above Rs.50,000:"+count3); 
        }		
}