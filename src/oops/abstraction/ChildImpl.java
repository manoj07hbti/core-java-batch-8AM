package oops.abstraction;

public class ChildImpl extends  DemoAbstraction {

    @Override
    public void m1() {
        System.out.println("This is implemented method ");
    }

    public static void main(String[] args) {

        ChildImpl obj = new ChildImpl();
        obj.m1();
    }
}
