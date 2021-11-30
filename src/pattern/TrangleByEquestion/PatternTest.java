package pattern.TrangleByEquestion;

import java.util.Scanner;

public class PatternTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = n;
        int sum = (n*(n+1)/2);
//        int sum =0;
//        while(count>0){
//            sum += count;
//            count--;
//        }
        for (int i=0; i<n; i++){
            for (int j=0; j<=i; j++){
                System.out.print(sum+"\t");
                sum--;
            }
            System.out.println();
        }
    }
}
