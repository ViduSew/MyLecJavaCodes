import java.util.Scanner;

public class Lec10Page11{
   public static char calculateGrade(int marks1){
       char result;
       
       if (marks1>=0 && marks1<=39){
            result='S';
       }
       else if(marks1>=40 && marks1<=59){
           result='C';
       }
       else if(marks1>=60 && marks1<=74){
           result='B';
       }
       else if(marks1>=75 && marks1<=100){
           result='A';
       }
       else{
           result='X';
       }
       
       return result;
   }
   public static void testCalculateGrade(){
    assert calculateGrade(95) == 'A' : "Error: 95 should return A";
    assert calculateGrade(85) == 'A' : "Error: 85 should return A";
    assert calculateGrade(75) == 'A' : "Error: 75 should return C";
    assert calculateGrade(65) == 'B' : "Error: 65 should return D";
    assert calculateGrade(55) == 'C' : "Error: 55 should return F";
    assert calculateGrade(30) == 'F' : "Error: 30 should return F"; // Test case for F grade
    assert calculateGrade(100) == 'A' : "Error: 100 should return A"; // Edge case
    assert calculateGrade(25) == 'F' : "Error: 25 should return F"; // Edge case

    System.out.println("All test cases passed!"); 
   }
   
   public static void main(String[] args){
       Scanner input=new Scanner(System.in);
       int marks;
       System.out.println("Enter Your Marks:");
       marks=input.nextInt();
       calculateGrade(marks);
       testCalculateGrade();
   }
}