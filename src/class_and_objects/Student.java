package class_and_objects;

public class Student {

    String name="Raj";
    int age=25;
    String section="CS";


    public static void main(String[] args) {
        // ClassName objName= new ClassName();

        Student obj= new Student();

        System.out.println("Printing Student 1 "+obj.name);
        System.out.println("Printing Student 1 "+obj.age);
        System.out.println("Printing Student 1 "+obj.section);
    }
}
