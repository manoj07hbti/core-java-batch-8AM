package methods_or_functions;

public class Student {


    // method--> capability -->  study , eat , play

   /* todo    Member function or method -- capabilities
        Syntax : access_specifier return_type  method_name (parameter) {}
        access_specifier -> public , private , protected, default   THEORY PART
        return_type   -> output of function or method :  void : no return type
        method_name -> can be anything: it should be meaningful
        parameter ->  input parameter : optional*/

// SYNTAX: access_specifier return_type  method_name (parameter) {}

    public void study(){
        System.out.println("This is Study Method .....");
    }

    public void eat(){
        System.out.println("This is eat Method........");
    }
    public void play(){

        System.out.println("This is Play method.......");
    }

    public static void main(String[] args) {

        // how to call methods
        // step 1 : create object of class
        Student obj= new Student();
        //Step 2: obj.methodName();
        obj.study();// it will call study method

        obj.eat();// it will call eat method
        obj.play();// it will call play method
    }



}
