// a method that displays a square of asterisks where the side is specified as an integer parameter.
public class Lec9Page10Ex1{
    public static void squareOfAsterisks(int side){
        int i,j;
       for(i=0;i<=side;i++){
           for(j=0;j<=side;j++){
               System.out.print("*");
           }
           System.out.println();
       }
       
    }

    public static void main(String[] args){
       squareOfAsterisks(5);     
    }		
}