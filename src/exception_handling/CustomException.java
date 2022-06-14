package exception_handling;

public class CustomException {


    public void checkEligibilty(int age) throws AgeNotEligibleException {

        if(age>18){

            System.out.println("Welcome to V0ting App....");

        }
        else {

            throw  new AgeNotEligibleException("Age should be greater than 18 for Voting ");
        }

    }

    public static void main(String[] args) {

        CustomException obj= new CustomException();

        try {
            obj.checkEligibilty(17);
        } catch (AgeNotEligibleException e) {
            e.printStackTrace();
        }

    }
}
