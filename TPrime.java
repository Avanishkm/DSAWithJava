import java.util.Scanner;

public class TPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int[] a = new int[1000001];

        for (int i = 2; i <= 1000000; i++) {
            if (a[i] == 0) {
                for (int j = 2; i * j <= 1000000; j++) {
                    a[i * j] = 1;
                }
            }
        }

        

        long b;
        long sq;

        for (int i = 0; i < x; i++) {
            b = scanner.nextLong();
            sq = (long) Math.sqrt(b);
            if (b == 1) {
                System.out.println("NO");
            } else if ((sq * sq == b) && (a[(int) sq] == 0)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
