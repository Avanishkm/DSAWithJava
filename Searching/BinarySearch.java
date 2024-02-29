package Searching;
import java.util.*;

public class BinarySearch {

    public static boolean binarySearch(int [] arr, int target){
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return true;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return false;

        
    }
    public static boolean recursiveBinarySearch(int[] arr, int start, int end, int target){
        if(start > end) return false;
        int mid = start + (end -start)/2;
        if(target == arr[mid]){
            return true;
        }else if(target < arr[mid]){
            return recursiveBinarySearch(arr, start, mid-1, target);
        }else{
            return recursiveBinarySearch(arr,  mid+1,end, target);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        // System.out.print(binarySearch(arr, k)+ " ");
        System.out.print(recursiveBinarySearch(arr, 0,n-1, k)+ " ");

    }
}
