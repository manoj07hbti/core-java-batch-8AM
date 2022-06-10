package oops.polymorphism;

public class Doctor extends Person{

    public void m1(){

        System.out.println("I am in Doctor class");
    }

    public static void main(String[] args) {

        Doctor obj= new Doctor();
        obj.m1();// which method should get executed ?

        //Q1:
        Person person= new Doctor();

        person.m1();// which method should get executed ?
        // Whichever object is created that class method will get executed
        //Q2
        Person obj2= new Person();
        obj2.m1();

        //Q3: This will be compile time error as Child can not hold parent object
       // Doctor doctor= new Person();// This is not possible
    }
}
