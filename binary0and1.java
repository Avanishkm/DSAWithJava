import java.util.Arrays;
import java.util.Scanner;

public class binary0and1 {
    
//     in = [1,0,1,1,0,0,1,0,1,0,0]
// out = [0,0,0,0,0,0,0,1,1,1,1]
// 1 0 1 1 0 0 1 0 1 0 0

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int[] arr ={1,0,0,0,0,0,0,0,0,0,0} ;
        // int[] arr = new int[n];

        // for(int i=0; i<n; i++){
        //     arr[i] = sc.nextInt();
        // }
        solution(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void solution(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end) { 
            while (arr[start] == 0 && start < end) {
                start++;
            }
            while (arr[end] == 1 && start < end){
                end--;  
            }
            if(start < end){
                // swap the array
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }  
        }
    }
}
