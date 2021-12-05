package classAndObject;

import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        Play pl= new Play(20);
        pl.goal();
    }
}
 class Play{
    int a =10;
   public Play(int a){
       System.out.println(a);
   }
   public Play(){
   }

   public void goal(){
       System.out.println("Hii");
   }
}
