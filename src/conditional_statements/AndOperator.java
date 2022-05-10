package conditional_statements;

public class AndOperator {


    public static void main(String[] args) {

        int age=19;
        String city="AGRA";

        //  if (condition1 operator condition2) => if (TRUE & TRUE)=TRUE

        if (age>18 & city=="AGRA"){

            System.out.println("Candidate is eligible for voting in Agra");
        }
        else {
            System.out.println("Candidate is NOT eligible for voting in Agra");

        }


        //  if (condition1 operator condition2) =>  TRUE & FALSE=FALSE

        city="DELHI";
        if (age>18 & city=="AGRA"){

            System.out.println("Candidate is eligible for voting in Agra");
        }
        else {
            System.out.println("TRUE & FALSE=FALSE : Candidate is NOT eligible for voting in Agra");

        }
        //  if (condition1 operator condition2) => FALSE& TRUE =FALSE
        city="AGRA";
        age=17;
        if (age>18 & city=="AGRA"){

            System.out.println("Candidate is eligible for voting in Agra");
        }
        else {
            System.out.println(" FALSE& TRUE =FALSE : Candidate is NOT eligible for voting in Agra");

        }

        //  if (condition1 operator condition2) => FALSE& FALSE =FALSE

        age=15;
        city="PUNE";
        if (age>18 & city=="AGRA"){

            System.out.println("Candidate is eligible for voting in Agra");
        }
        else {
            System.out.println(" FALSE& FALSE =FALSE : Candidate is NOT eligible for voting in Agra");

        }


    }
}
