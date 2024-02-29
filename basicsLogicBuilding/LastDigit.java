package basicsLogicBuilding;

import java.util.Scanner;

/**
 * LastDigit
 */
class LastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int ans = n%10; // with last digit
        if(n>=1 && n<=9){
            System.out.println(n);
            return;
        }
        int ans = n/10; // without last digit
        System.out.println(ans); 
    }
}