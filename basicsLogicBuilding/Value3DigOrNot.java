package basicsLogicBuilding;

import java.util.Scanner;

public class Value3DigOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0){
            n = -n;
        }
        if(n>=100 && n<=999){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
