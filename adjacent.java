import java.util.Scanner;
public class adjacent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read matrix size
        int N = sc.nextInt();
        int[][] matrix = new int[N][N];
        // Read matrix elements
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // Read number of queries
        int Q = sc.nextInt();
        // Process queries
        for (int q = 0; q < Q; q++) {
            String queryType = sc.next();
            int x = sc.nextInt();
            if (queryType.equals("ADJACENT")) {
                int sum = findAdjacentSum(matrix, x);
                System.out.println(sum);
            } else if (queryType.equals("DIAGONAL")) {
                int sum = findDiagonalSum(matrix, x);
                System.out.println(sum);
            }
        }
        sc.close();
    }
    private static int findAdjacentSum(int[][] matrix, int x) {
        int sum = 0;
        int N = matrix.length;
        // Check if x is a valid position
        if (x >= 0 && x < N * N) {
            int row = x / N;
            int col = x % N;
            // Top
            if (row - 1 >= 0) {
                sum += matrix[row - 1][col];
            }
            // Right
            if (col + 1 < N) {
                sum += matrix[row][col + 1];
            }
            // Bottom
            if (row + 1 < N) {
                sum += matrix[row + 1][col];
            }
            // Left
            if (col - 1 >= 0) {
                sum += matrix[row][col - 1];
            }
        }
        return sum;
    }
    private static int findDiagonalSum(int[][] matrix, int x) {
        int sum = 0;
        int N = matrix.length;
        // Check if x is a valid position
        if (x >= 0 && x < N * N) {
            int row = x / N;
            int col = x % N;
            // Top-Right
            if (row - 1 >= 0 && col + 1 < N) {
                sum += matrix[row - 1][col + 1];
            }
            // Top-Left
            if (row - 1 >= 0 && col - 1 >= 0) {
                sum += matrix[row - 1][col - 1];
            }
            // Bottom-Right
            if (row + 1 < N && col + 1 < N) {
                sum += matrix[row + 1][col + 1];
            }
            // Bottom-Left
            if (row + 1 < N && col - 1 >= 0) {
                sum += matrix[row + 1][col - 1];
            }
        }
        return sum;
    } 
}




