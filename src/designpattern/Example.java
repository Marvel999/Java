package designpattern;

public class Example {
    public static void main(String[] args) {
        Play play = Play.getObject();
        play.Log();
        play.leg =4;
        play.Log();
        Play play1 = Play.getObject();
        play1.Log();
    }
}
