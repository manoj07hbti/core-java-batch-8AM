package conditional_statements;

public class Demo {

    public static void main(String[] args) {

// SYNTAX :   if (condition ){ } else{}


        int age=17;

        if (age>18){

           System.out.println("Person is eligible for voting ");
        }
        else {

            System.out.println("Person is NOT eligible for voting ");
        }

        String city= "AGRA";

        if (city== "AGRA"){

            System.out.println("You are in Agra ...");
        }
        else {
            System.out.println("You are NOT  in Agra ...");
        }

        double salary=35020.5;

        if (salary>35000){
            System.out.println("Good Package");
        }
        else {
            System.out.println("Not a Good Package");
        }


    }
}
