package pattern.equestion;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(j>=1 && i>=1 && i+j<=n+1)
                System.out.print("* ");
                else
                    System.out.print("");
            }
            System.out.println();
        }
    }
}
