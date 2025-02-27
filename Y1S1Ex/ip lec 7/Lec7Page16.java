import java.util.Scanner;

// Initialize a 2D Array using User Input via KeyBoard
public class Lec7Page16{

    public static void main(String[] args){
       Scanner value=new Scanner(System.in);
       
       int numbers[][]=new int[2][3];
       int i,j;
       
       for(i=0;i<numbers.length;++i){
           for(j=0;j<numbers[i].length;++j){
               System.out.print("Enter a Number:");
               numbers[i][j]=value.nextInt();
           }
       }
       
       for(i=0;i<numbers.length;++i){
           for(j=0;j<numbers[i].length;++j){
               System.out.print(numbers[i][j]+" ");
           }
        System.out.print("\n");
       }
    }		
}