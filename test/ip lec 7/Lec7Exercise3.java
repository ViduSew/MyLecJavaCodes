import java.util.Scanner;

public class Lec7Exercise3{

	public static void main(String[] args){
            Scanner input=new Scanner(System.in);
            
            char shirts[]=new char[10];
            int i;
            
            for(i=0;i<shirts.length;i++){
                System.out.println("Customer"+(i+1)+":Please Enter Your Size(Small/Medium/Large)");
                shirts[i]=input.next().toLowerCase().charAt(0);
            }
            int count1=0,count2=0,count3=0;
            for(i=0;i<shirts.length;i++){
                if(shirts[i]=='s'){
                    ++count1;
                }
                if(shirts[i]=='m'){
                    ++count2;
                }
                if(shirts[i]=='l'){
                    ++count3;
                }
            }
            System.out.println("Small:"+count1);
            System.out.println("Medium:"+count2);
            System.out.println("Large:"+count3);
        }		
}