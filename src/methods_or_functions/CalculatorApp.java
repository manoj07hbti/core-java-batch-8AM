package methods_or_functions;

public class CalculatorApp {

    //add
    //SYNTAX : access_specifier Datatype  method_name (input param) {CODE}

    public int addition(int a,int b){

        int sum=a+b;

        return a+b;
    }

    public static void main(String[] args) {

        CalculatorApp obj= new CalculatorApp();
       int result= obj.addition(3,7);
       System.out.println("Addition is "+result);
    }

}
