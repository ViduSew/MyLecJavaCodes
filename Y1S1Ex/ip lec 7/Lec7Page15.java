// Initialize a 2D Array using an Initializer List
public class Lec7Page15{

    public static void main(String[] args){
        int values[][]={{10,2,34,84},{50,16,7,1}};
        
        System.out.println(values[0][0]);
        System.out.println(values[0][1]);
        System.out.println(values[0][2]);
        System.out.println(values[0][3]);
        System.out.println('\n');
        System.out.println(values[1][0]);
        System.out.println(values[1][1]);
        System.out.println(values[1][2]);
        System.out.println(values[1][3]);
        System.out.println('\n');
        
        int i,j;
        for(i=0;i<values.length;++i){
            for(j=0;j<values[i].length;++j){
               System.out.print(values[i][j]+" ");
            }
        System.out.print("\n");
        }
    }		
}