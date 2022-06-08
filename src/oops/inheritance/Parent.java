package oops.inheritance;

public class Parent {

    public void m1(){

        System.out.println("This is M1 method of Parent Class...");
    }
    public void m2(){

        System.out.println("This is M2 method of Parent Class...");
    }

    public static void main(String[] args) {

        Parent obj = new Parent();
        obj.m1();
    }

}
