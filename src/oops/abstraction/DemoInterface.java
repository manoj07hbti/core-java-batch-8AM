package oops.abstraction;

public interface DemoInterface {

    // all method should be abstract

    public abstract void m1();
    public abstract void m2();
    public abstract void m3();

    // it is providing 100% abstraction

    // can we have private methods in interface ?
    // NO : because child class needs to implement these methods

}
