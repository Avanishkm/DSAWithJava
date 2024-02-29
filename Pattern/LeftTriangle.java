package Pattern;

import java.util.Scanner;

public class LeftTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        
        // // right triangle
        // for(int i=1; i<=row; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // reverse left triangle
        // for(int i=row; i>=1; i--){
        //     for(int j=i; j>=1; j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


            // left triangle
        // for(int i=0; i<=row; i++){
        //     for(int j=2*(row-i); j>=0; j--){
        //         // printing spaces
        //         System.out.print(" ");
        //     }
        //     for(int j=0; j<=i; j++){
        //         // printing spaces
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // reverse left triangle 
        for(int i=row; i>=0; i--){
            for(int j=2*(row-i); j>=0; j--){
                // printing spaces
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                // printing spaces
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
