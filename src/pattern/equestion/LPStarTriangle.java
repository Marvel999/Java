package pattern.equestion;

import java.util.Scanner;

public class LPStarTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for (int y=1; y<=n;y++){
            for (int x=1; x<=n; x++){
                if(x<=y && x>=1 && y<=n)
                System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
