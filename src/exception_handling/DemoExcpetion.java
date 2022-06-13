package exception_handling;

import java.util.ArrayList;

public class DemoExcpetion {

    public int divide(int a, int b)
    {
        System.out.println("before calling divide a/b  ....");
        int result=0;
        try{
             result =a/b;
        }
        catch (Exception e){

            System.out.println("######## Exception occurred "+e);
        }
        finally {
            System.out.println("*****This is finally block and it will get executed all time");
        }

        System.out.println("after calling divide a/b ....");
        return result;
    }

    public void checkSize(){

        ArrayList <String> list= new ArrayList<>();
        System.out.println("before calling   ....");
        try {
            list.get(0);
        }
        catch (Exception e){
            System.out.println("Exception occurred "+e);
        }

        System.out.println("after calling  ....");
    }

    public static void main(String[] args) {


        DemoExcpetion obj= new DemoExcpetion();
        System.out.println("before calling divide method ....");
        int result= obj.divide(10,0);
        System.out.println("Division of a and b : "+result);
        System.out.println("after calling divide method ....");

        obj.checkSize();
    }

}
