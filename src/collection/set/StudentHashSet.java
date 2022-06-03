package collection.set;

import model.Employee;
import model.Student;

import java.util.HashSet;

public class StudentHashSet {

    public void createStudentSet(){

        // HashSet <DataType>  var_name= new HashSet<>();

        HashSet <Student> studentHashSet= new HashSet<>();

        // create object of student model class
        Student student1=new Student("raj",22,"SCIENCE");
        Student student2=new Student("Rahul",23,"ARTS");
        Student student3=new Student("Mukesh",22,"BIO");
        System.out.println("Hash code of Student 3 "+student3.hashCode());
        Student student4=new Student("Mukesh",22,"BIO");
        System.out.println("Hash code of Student 4 "+student4.hashCode());

        studentHashSet.add(student1);
        studentHashSet.add(student2);
        studentHashSet.add(student3);
        studentHashSet.add(student4);

        for (Student var: studentHashSet){

            System.out.println("Printing "+var.getName()+ " Age: "+var.getAge()+" Section: "+var.getSection());
        }

        HashSet <Employee> employeeHashSet= new HashSet<>();
        Employee employee1= new Employee("Raj",21,"CS");
        Employee employee2= new Employee("Mukesh",23,"IT");
        Employee employee3= new Employee("Rohit",21,"IT");
        Employee employee4= new Employee("Rohit",21,"IT");


        employeeHashSet.add(employee1);
        employeeHashSet.add(employee2);
        employeeHashSet.add(employee3);
        employeeHashSet.add(employee4);

        for (Employee var: employeeHashSet){

            System.out.println("Printing employee : "+var.getName());
        }


    }

    public static void main(String[] args) {

        StudentHashSet obj= new StudentHashSet();
        obj.createStudentSet();
    }
}
