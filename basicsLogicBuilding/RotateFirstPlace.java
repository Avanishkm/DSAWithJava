package basicsLogicBuilding;

import java.util.Scanner;

public class RotateFirstPlace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 0){
            n = -n;
        }
        if(n>=100 && n<=999){
            int temp = n%10; // 3
            n /= 10; // 12
            temp *= 100; // 3*100=300
            temp += n; // 300 + 12=312
            System.out.println(temp);
        }
    }
}
