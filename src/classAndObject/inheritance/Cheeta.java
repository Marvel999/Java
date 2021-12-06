package classAndObject.inheritance;

import classAndObject.inheritance.Cat;

public class Cheeta extends Cat {
    @Override
    public void farColor() {
        super.farColor();
        System.out.println("Yellow");
    }

    public void chal(){
        System.out.println("Ok");
    }

    @Override
    protected void HowManyEyes() {
        super.HowManyEyes();
    }
}
