package loops_working;

public class Demo {

    public static void main(String[] args) {

        // repeated work
        System.out.println("Hello..");
        System.out.println("Hello..");
        System.out.println("Hello..");
        System.out.println("Hello..");
        System.out.println("Hello..");

        // for(initialization; condition; increment){
        //          statement or code to be executed
        //}

        for (int i=0; i<5; i++){

            System.out.println(" INCREMENT Inside loop Hello.."+i);
        }

        // for(initialization; condition; decrement){
        //          statement or code to be executed
        //}

        for (int i=10; i>0; i--){

            System.out.println("DECREMENT  Inside loop Hello.."+i);
        }



    }
}
