package scanner_demo;

import java.util.Scanner;

public class DemoScanner {

    public static void main(String[] args) {

        // Create object of Scanner class
        // className obj = new ClassName();

        Scanner obj= new Scanner(System.in);// created object of scanner class

       // 1- Input  String Value

        System.out.println("Please enter your name ");

        String name= obj.nextLine();// Reads String input

        System.out.println("You have entered "+name);

        //2- read input of int values

        System.out.println("Please enter your age : ");
         int age=obj.nextInt();// reads int input

        System.out.println("You have entered age as "+age);

        //3- read input of decimal value

        System.out.println("Please enter your salary ");
              Double salary=obj.nextDouble();// reads decimal values
        System.out.println("Salary is "+salary);
    }
}
