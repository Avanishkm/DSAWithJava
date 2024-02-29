package leetcode;

public class leet238 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(productExceptSelf(arr));
    }

    public static int[] productExceptSelf(int[] arr){
        int n = arr.length;
        int prefix = 1;
        int suffix = 1;

        int[] arr2 = new int[n];

        for(int i=0; i<n; i++){
            arr2[i] = prefix;
            prefix =  prefix * arr[i];
        }
        for(int i=n-1; i>=0; i--){
            arr2[i] = arr2[i]*suffix;
            suffix = suffix * arr[i];

        }
        return arr2;
    }
}
