package loop;

public class nestedWhile {
    public static void main(String[] args) {
        int i = 1;
        while (i < 4) {
            int j = 1;
            while (j < 4) {
                System.out.println(i + " : " + j);
                j++;
            }
            i++;
        }
    }
}
