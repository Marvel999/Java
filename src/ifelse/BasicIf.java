package ifelse;

public class BasicIf {
    public static void main(String[] args) {
        int marks = 78;
        if (marks >= 90)
            System.out.println("A");
        if (marks < 80)
            System.out.println("B");
        else {
            System.out.println("fail");
        }
    }
}
