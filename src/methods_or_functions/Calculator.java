package methods_or_functions;

public class Calculator {

    // add, sub , multi, divide

    public void add(){

        int a=9;
        int b=8;

        int sum=a+b;

        System.out.println("Sum is "+sum);
    }

    //sub a-b;

    // multi a*b;

    // divide a/b;

    public static void main(String[] args) {
        Calculator obj= new Calculator();
        obj.add();

    }
}
