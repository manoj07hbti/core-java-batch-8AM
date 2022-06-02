package collection.arraylist;

import model.Employee;

import java.util.ArrayList;

public class EmployeeList {

    public void createEmployeeList(){

        // ArrayList <Datatype> objName= new ArrayList<>();

        ArrayList <Employee>  employeeArrayList= new ArrayList<>();

        // create object of employee

        Employee employee1= new Employee("Raj",21,"CS");
        Employee employee2= new Employee("Mukesh",23,"IT");
        Employee employee3= new Employee("Rohit",21,"IT");

        //add
        employeeArrayList.add(employee1);
        employeeArrayList.add(employee2);
        employeeArrayList.add(employee3);

        for (int i=0; i<employeeArrayList.size(); i++){

            System.out.println("Printing Employee Object "+employeeArrayList.get(i).getName());
            System.out.println("Printing Employee Object "+employeeArrayList.get(i).getAge());
            System.out.println("Printing Employee Object "+employeeArrayList.get(i).getDept());
        }

        for (Employee employee: employeeArrayList){

            System.out.println("Advanced loop "+ employee.getName() +" Age: "+employee.getAge()+" Dept: "+employee.getDept());
        }

    }

    public static void main(String[] args) {

        EmployeeList obj= new EmployeeList();
        obj.createEmployeeList();
    }
}
