package conditional_statements;

public class NOToperator {

    public static void main(String[] args) {

        int age=17;
        //!(FALSE)=TRUE
        if (!(age>18)){
            System.out.println("Eligible for voting ");
        }
        else{
            System.out.println("NOT Eligible for voting ");
        }
//!(TRUE)= FALSE
        age=19;

        if (!(age>18)){
            System.out.println("Eligible for voting ");
        }
        else{
            System.out.println("NOT Eligible for voting ");
        }

    }
}
