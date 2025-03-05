import java.util.Scanner;

public class Lec10Page12{
   public static char calculateGrade(int marks){
       char result;
       
       if (marks<0){
           result='X';
       }
       else if (marks<40){
           result='F';
       }
       else if (marks<60){
           result='C';
       }
       else if(marks<75){
           result='B';
       }
       else if(marks<101){
           result='A';
       }
       else {
           result='X';
       }
       System.out.println(result);
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
       int marks1;
       System.out.println("Enter Your Marks:");
       marks1=input.nextInt();
       calculateGrade(marks1);
       testCalculateGrade();
   }
}