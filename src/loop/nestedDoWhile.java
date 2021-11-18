package loop;

public class nestedDoWhile {
    public static void main(String[] args) {
        int i=0;
        do{
            int j=0;
            do{
                System.out.println(i+" : "+j);
                j++;
            }while (j<4);
            i++;
        }while (i<4);
    }
}
