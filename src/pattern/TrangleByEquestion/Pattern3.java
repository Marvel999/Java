package pattern.TrangleByEquestion;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        for (int i=1; i<=n; i++){
            //Print Space
            for(int j=1; j<=(n-i); j++)
                System.out.print("\t");
            //Print Star
                for (int j=1; j<=i; j++)
                    System.out.print("*\t");
            System.out.println();
        }
    }
}
