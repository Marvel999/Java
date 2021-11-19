package InputInJava;

import java.util.Scanner;

public class InputJava {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter int");
        int a= sc.nextInt();
        System.out.println("enter string");
        String s= sc.nextLine();
        System.out.print(a);
        System.out.print(s);
    }
}
