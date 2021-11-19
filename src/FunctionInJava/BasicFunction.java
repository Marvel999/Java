package FunctionInJava;

public class BasicFunction {
    public static void main(String[] args) {
        printOnOutput();
        int s = sum(30,40);
        System.out.println(s);
        printMsg(20, "Hey");

    }

    public void fun(){
        printOnOutput();
    }
    // void function
    private static void printOnOutput(){
        System.out.println("Hey guys");
        sum(20f,20);
    }
    // function return sum of number
    private static int sum(int a, int b){
        int c = a+b;
        return c;
    }
    private static int sum(int a, int b, int d){
        int c = a+b+d;
        return c;
    }
    private static void printMsg(int i, String s){
        System.out.println(s+" : "+i);
    }
    private static void printMsg(String s, int i){
        System.out.println(s+" : "+i);
    }
    public static float sum(float a, int b){
        float c = a+b;
        return c;
    }
    private static char grade(int marks){
        if (marks>90){
            return 'A';
        }else {
            System.out.println("Fail");
            return 'f';
        }
    }
}
