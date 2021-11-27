package pattern.equestion;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for (int c=0; c<n; c++){
            for( int r=0; r<n; r++){
                if(c-r==0){
                    System.out.print("*\t");
                }else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
}
