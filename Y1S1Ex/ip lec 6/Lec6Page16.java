//example code for continue
public class Lec6Page16{

	public static void main(String[] args){
 
            int number;
            number=1;
            while(number<=10){
                if (number==5){
                    ++number;
                    continue;
                }
                System.out.println(number);
                ++number;
            }
            
        }		
}