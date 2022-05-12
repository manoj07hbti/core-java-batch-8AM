package conditional_statements;

public class DemoSwitchAge {

    public static void main(String[] args) {

        int age=80;

        switch(age){

            case 18:
                  System.out.println("Young :Eligible for voting ");
                  break;
            case 40:
                System.out.println("Men with mid age ");
                break;
            case 70:
                System.out.println("Men with old age");
                break;
            default:
                System.out.println("No Age Match found");
        }

    }
}
