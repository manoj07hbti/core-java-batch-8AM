package oops.abstraction;

public class Child implements DemoInterface {
    @Override
    public void m1() {
       System.out.println("This is m1");
    }

    @Override
    public void m2() {
        System.out.println("This is m2");
    }

    @Override
    public void m3() {
        System.out.println("This is m3");
    }
}
