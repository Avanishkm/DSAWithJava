public class Mock2 {
    public static void main(String[] args) {
        
//         Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right, which minimizes the sum of all numbers along its path.
// Note: You can only move either down or right at any point in time.
// Example 1:
// Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
// Output: 7
// Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.
// Example 2:
// Input: grid = [[1,2,3],[4,5,6]]
// Output: 12
// int[][] arr = {{1,2,3},{4,5,6}};

        int[][] arr = {{1,3,1},{1,5,1}, {4,2,1}};
        int[][] arr2 = {{1,2,3},{4,5,6}};
        
        System.out.println(minPathSum(arr));
        System.out.println(minPathSum(arr2));
    }
    public static int minPathSum(int[][] arr){
    
        int m = arr.length;
        int n = arr[0].length;
        for(int i = 1; i<m; i++){
            arr[i][0] += arr[i-1][0];
        }
        for(int j = 1; j<n; j++){
            arr[0][j] += arr[0][j-1];
        }
        
        for(int i=1;i<m; i++){
            for(int j=1; j<n; j++){
                arr[i][j] += Math.min(arr[i][j-1], arr[i-1][j]);
            }
        }
        return arr[m-1][n-1];
    }
}
