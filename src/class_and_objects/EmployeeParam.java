package class_and_objects;

public class EmployeeParam {

    // data member or properties
    String name;
    int age;
    String dept;

    //parameterized constructor
    public EmployeeParam(String name, int age, String dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    public static void main(String[] args) {

        // Classname Objname = new ClassName(value of properties);

        EmployeeParam obj= new EmployeeParam("RAJ",24,"CS");

        System.out.println("Printing Object "+obj.name + " Age:"+obj.age +" Dept :"+obj.dept);

        EmployeeParam obj1= new EmployeeParam("Rahul",20,"IT");

        System.out.println("Printing Object "+obj1.name + " Age:"+obj1.age +" Dept :"+obj1.dept);

        EmployeeParam obj2= new EmployeeParam("Mukesh",21,"CS");
        System.out.println("Printing Object "+obj2.name + " Age:"+obj2.age +" Dept :"+obj2.dept);
    }
}
