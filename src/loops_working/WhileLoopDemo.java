package loops_working;

public class WhileLoopDemo {

    public static void main(String[] args) {

        // SYNTAX  while(condition){CODE; incr/decr}

        int i=0;
// increment
        while (i<5){

            System.out.println("Increment : This is While Loop..."+i);

            i++;// i=i+1;
        }

// decrement
       i=10;

       while (i>0){

           System.out.println("Decrement: While Loop..."+i);
           i--;  // i= i-1;
       }


    }
}
