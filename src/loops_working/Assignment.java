package loops_working;

import java.util.Arrays;
import java.util.HashMap;

public class Assignment {

    public static void main(String[] args) {


        HashMap<Integer,String > hm= new HashMap<>();

        hm.put(1,"TEST");

        System.out.println(Arrays.asList(hm));


        int number=2;

        for (int i=1; i<=10; i++){

            int result=number*i;

          System.out.println("Table of Two is : "+ number + "*"+ i +"="+result);
        }

    }
}
