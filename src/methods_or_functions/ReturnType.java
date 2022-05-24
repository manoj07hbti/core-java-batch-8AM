package methods_or_functions;

public class ReturnType {

    //SYNTAX : access_specifier Datatype  method_name (input param) {CODE}

    public String hello(String name){

        String message="Welcome to java "+name;

       // System.out.println(message);

        return message;
    }

    public int makeSquare(int number){

        int square= number*number;

        return square;
    }

    public String checkPrice(double price){


        if(price>5000){
          return "Product is costly ";
        }
        else {
            return "Product is not costly";
        }

    }

    public static void main(String[] args) {

        ReturnType obj= new ReturnType();
       String result= obj.hello("Raj");// store the output

       System.out.println("Printing in main method "+result);

      int output= obj.makeSquare(3);// store the output

      System.out.println("Square is "+output);

      String var= obj.checkPrice(300.56);// store the output
      System.out.println("output is "+var);


    }
}
