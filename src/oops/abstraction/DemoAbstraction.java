package oops.abstraction;

public abstract class DemoAbstraction {


    //normal method:  access_specifier return_type methodName(param){CODE}

    //Abstract method:  access_specifier return_type methodName(param);
    //a method without method body will be called abstract method

    // If Any class has at least one abstract method then we need to declare class as as abstract

    public abstract void  m1();//33.33%

    public void m2(){
        System.out.println("This is Normal Method of Abstract Class");
    }
    public void m3(){
        System.out.println("This is Normal Method of Abstract Class");
    }

//Abstract class provides partial abstraction
// We can not create object of Abstract Class , Why ?
    public static void main(String[] args) {
       // DemoAbstraction obj= new DemoAbstraction();//
       // obj.m1();// calling abstract method
    }

 // Child class will implement abstract method and use it
}
