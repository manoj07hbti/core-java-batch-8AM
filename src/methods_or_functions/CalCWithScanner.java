package methods_or_functions;

import java.util.Scanner;

public class CalCWithScanner {

    public int add(int a, int b){

        int sum=a+b;

        return sum;
    }
    public int sub(int a, int b){

        int sub=a-b;

        return sub;
    }

    public int multi(int a, int b){

        int result=a*b;

        return result;
    }


    public double divide (int a , int b ){

        double result =(double) a/b;

        return result;
    }
    //subtraction

    //multi

    //divide


    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);


        CalCWithScanner obj= new CalCWithScanner();
        int result ;

        String flag="Y";

        while (flag.equals("Y")){

            System.out.println("****** Welcome to Calculator App ********* ");
            System.out.println("Please enter value of a: ");
            int a=scanner.nextInt();
            System.out.println("Please enter value of b: ");
            int b=scanner.nextInt();

            System.out.println("Please Enter you Choice : ");
            System.out.println("Press 1 for Addition, 2 for Subtraction, 3 for Multiplication and 4 for Divide  ");

            int choice=scanner.nextInt();

            if(choice==1){

                result= obj.add(a,b);
                System.out.println("Addition is :"+result);

            }

            else if(choice==2){
                result=obj.sub(a,b);
                System.out.println("Subtraction  is :"+result);
            }
            else  if (choice==3){
                result=obj.multi(a,b);

                System.out.println("Multi  is :"+result);

            }else {

                System.out.println("Divide id "+obj.divide(a,b));
            }

            System.out.println("******* Do you want to exit from App ? if Yes then press N ");

            Scanner scanner1= new Scanner(System.in);
            flag=scanner1.nextLine();

        }



    }
}
