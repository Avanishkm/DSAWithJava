package Pattern;
import java.util.*;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        //  reactangle pattern
        // for(int i=1; i<=row; i++){
        //     for(int j=1; j<=col; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // } 
        
        // hole ractangle pattern

        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                if(i== 1 || i==row || j==1 || j==col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }   

}
