package methods_or_functions;

public class InputParameter {

// SYNTAX: access_specifier return_type  method_name (Datatype var1,Datatype var2...Datatypen VarN) {}

    public void hello(String name){

        System.out.println("Welcome to Java "+name);
    }

    public void information(String name, int age){

        System.out.println("Your nae is :"+name + " You age is "+age);
    }

    public void makeSquare(int number){

        System.out.println("Square of given number is "+number*number);
    }

    public void checkAge(int age){

        if (age>18){
            System.out.println("Your age is greater than 18");
        }
        else {
            System.out.println("Your age is Less than 18");
        }
    }

    public static void main(String[] args) {
        InputParameter obj = new InputParameter();
        obj.hello("Rohit");
        obj.information("Raj",23);
        obj.makeSquare(3);
        obj.checkAge(7);

    }

}
