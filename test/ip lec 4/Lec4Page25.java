//Example Code For Ternary Operator(?:)
public class Lec4Page25{

	public static void main(String[] args){
            int age=65;
            String message;
            
            
/*            if(age>=60){
                message="Welcome Senior Citizen!";
            }
            else{
                message="Welcome!";
            }
            System.out.println(message);
*/
        message=(age>=60)?"Welocme Senior Citizen!":"Welocme!";
        System.out.println(message);
        }		
}