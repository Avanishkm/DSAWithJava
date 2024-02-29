package basicsLogicBuilding;

import java.util.Scanner;

public class SwapTwoVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        // logic 1
        // int temp = x;
        // x = y; 
        // y = temp;
        
        // logic 2
        // without third variable
        // x = x + y;
        // y = x - y;
        // x = x - y;

        // logic 3
        // one line
        x = y + x-(y = x);
        System.out.print("X is " + x);
        System.out.print(" Y is " + y);
    }
}
