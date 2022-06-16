package imp_keywords;

public class DemoStatic {

    //TODO   Static keyword : it provide compile time loading
    // we can call static methods or variable without creating object
    // Classname.MethodName();
    // Q1- Can we override static methods in java ?
    // yes, but there will be no meaning of overriding because we call static method by class name so runtime
    // polymorphism will not happen
    // Q2- Can we use non static data inside a static method ?
    // NO , we can not : non static data it is always part of object and it is available after object creation
    // but to call static method we do not create object .

    public static String city="AGRA";
    public int age=23;

    public static void hello(){
        //System.out.println("non static data "+age);
        System.out.println("This is Static method ");
    }

    public static void main(String[] args) {

        DemoStatic.hello();//Classname.MethodName();

        System.out.println(DemoStatic.city);
    }


}
