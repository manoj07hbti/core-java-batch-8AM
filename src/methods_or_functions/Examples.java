package methods_or_functions;

public class Examples {

    // SYNTAX: access_specifier return_type  method_name (parameter) {}

    public  void makeSquare(){
     int number=9;

     int square=number*number;

     System.out.println("Square of number is :"+square);

    }

    public void eligibilityVotes(){

        int age =17;
        if(age>18){

            System.out.println("Eligible for Voting ....");
        }
        else {
            System.out.println("NOT Eligible for Voting ....");
        }
    }

    public static void main(String[] args) {
        Examples obj= new Examples();
        obj.makeSquare();
        obj.eligibilityVotes();
    }
}
