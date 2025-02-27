import java.util.Scanner;

// ISumming the elements of a @D Number Array
public class Lec7Page17{

    public static void main(String[] args){
       Scanner value=new Scanner(System.in);
       
       int numbers[][]=new int[2][3];
       int i,j,tot=0;
       
       for(i=0;i<numbers.length;++i){
           for(j=0;j<numbers[i].length;++j){
               System.out.print("Enter a Number:");
               numbers[i][j]=value.nextInt();
           }
       }
       
       for(i=0;i<numbers.length;++i){
           for(j=0;j<numbers[i].length;++j){
               tot+=numbers[i][j];
           }
       }
       System.out.print("summation="+tot);
    }		
}