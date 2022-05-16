package loops_working;

public class DoWhileDemo {

    public static void main(String[] args) {

        // SYNTAX do {CODE } while (condition);


        int i=0;

        do {

            System.out.println("Do While loop Demo...."+i);
             i++;
        }
        while (i<5);

        i=10;

        do{
            System.out.println("Decrement do while "+i);
            i--;
        }
        while(i>0);


    }
}
