package Arrays;
import java.util.*;

public class Matrix {

    static void printMatrix(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }

    static void multiply(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
        if(c1 != r2){
            System.out.println("Multiplication not possible - wrong dimension");
            return;
        }
        int[][] mul = new int[r1][c2];

        for(int i=0; i<r1; i++){
            for(int j=0; j<c2; j++){
                for(int k=0; k<c1; k++){
                    mul[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        System.out.println("Multiplication of 2 matrices");
        printMatrix(mul);
    }

    static void add(int[][] a,int[][] b, int r1, int r2, int c1, int c2){
        if(r1 != r2 || c1 != c2){
            System.out.println("Wrong Input");
            return;
        }

        int[][] sum = new int[r1][c1];
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Sum of matrix 1 and matrix 2");
        printMatrix(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns of matrix 1");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] arr = new int[r1][c1];
        System.out.println("Enter matrix values");
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter number of rows and columns");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] brr = new int[r2][c2];
        System.out.println("Enter matrix values");
        for(int i=0; i<r2; i++){
            for(int j=0; j<c2; j++){
                brr[i][j] = sc.nextInt();
            }
        }

        System.out.println("matrix 1");
        printMatrix(arr);
        System.out.println("marix 2");
        printMatrix(brr);
        // add(arr, brr, r1, r2, c1, c2);
        multiply(arr, r1,c1,brr, r2,c2);
    }
}
