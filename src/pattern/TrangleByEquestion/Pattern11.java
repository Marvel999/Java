package pattern.TrangleByEquestion;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 1;
        for (int i=0; i<n; i++){
            for (int j=0; j<=i; j++){
                System.out.print(count+"\t");
                count++;
            }
            System.out.println();
        }
    }
}
