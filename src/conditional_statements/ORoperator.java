package conditional_statements;

public class ORoperator {

    public static void main(String[] args) {

        String brand="LENOVO";
        int ram=8;

        // TRUE||TRUE= TRUE

        if(brand=="LENOVO" || ram==8){

            System.out.println("Good Configuration Laptop");
        }
        else {
            System.out.println("NOT Good Configuration Laptop");
        }

        //TRUE||FALSE=TRUE

        ram=2;

        if(brand=="LENOVO" || ram==8){

            System.out.println("Good Configuration Laptop");
        }
        else {
            System.out.println("NOT Good Configuration Laptop");
        }

       //FASLE||TRUE=TRUE

        brand="DELL";
        ram=8;

        if(brand=="LENOVO" || ram==8){

            System.out.println("Good Configuration Laptop");
        }
        else {
            System.out.println("NOT Good Configuration Laptop");
        }

        //FALSE|| FALSE= FALSE(0+0=0)
        brand="DELL";
        ram=2;

        if(brand=="LENOVO" || ram==8){

            System.out.println("Good Configuration Laptop");
        }
        else {
            System.out.println("NOT Good Configuration Laptop");
        }


    }
}
