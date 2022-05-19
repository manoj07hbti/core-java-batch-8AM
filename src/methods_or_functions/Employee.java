package methods_or_functions;

public class Employee {

    // SYNTAX: access_specifier return_type  method_name (parameter) {}
    // work , eat , sleep, exercise , getsalary

    public void work(){

        System.out.println("This is Work Method...");
    }

    public static void main(String[] args) {

        Employee obj=new Employee();
        obj.work();
    }

}
