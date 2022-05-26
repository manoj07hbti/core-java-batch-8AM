package methods_or_functions;

import java.util.Scanner;

public class CalCWithScanner {

    public int add(int a, int b){

        int sum=a+b;

        return sum;
    }

    //subtraction

    //multi

    //divide


    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter value of a: ");
        int a=scanner.nextInt();
        System.out.println("Please enter value of b: ");
        int b=scanner.nextInt();

        CalCWithScanner obj= new CalCWithScanner();
        int result =obj.add(a,b);
        System.out.println("SUM is "+result);


    }
}
