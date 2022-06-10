package oops.polymorphism;

public class DemoMethodOverLoading {


    //TODO  SYNTAX: access_specifier return_type  method_name (Datatype var1,Datatype var2...Datatypen VarN) {CODE}

    //TODO : Same method with different input parameter, it will happen only in same class
    // Because it is decided in compile time which method should get executed ...

    public void m1(){

        System.out.println("Hello , This is normal m1 method");
    }

    //overload m1
    public void m1(String name){

        System.out.println("Hello , This is overloaded m1 method: "+name);
    }
    //overload m1 again

    public void m1(int age){

        System.out.println("Hello , This is normal m1 method: "+age);
    }
    //overload m1 again with two parameter

    public void m1(String name, int age){

        System.out.println("Hello , This is normal m1 method: "+age + ": "+name);
    }

    public static void main(String[] args) {
        DemoMethodOverLoading obj= new DemoMethodOverLoading();
        obj.m1();
        obj.m1("Raj");
        obj.m1(23);
        obj.m1("Rahul", 24);
    }
}
