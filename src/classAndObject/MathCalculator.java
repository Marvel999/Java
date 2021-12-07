package classAndObject;

public class MathCalculator implements Calculator {
    @Override
    public int Add(int a, int b) {
        return a+b;
    }

    @Override
    public int Sub(int a, int b) {
        return a-b;
    }
}
