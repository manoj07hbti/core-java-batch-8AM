package class_and_objects;

public class Book {

    // Data Members or properties
    String  name="Java";
    int pages=500;
    String writerName="Games Gosling";


    public static void main(String[] args) {

        // how to create Object
        // ClassName objName= new ClassName();

        Book obj=new Book();// object created

        System.out.println("Printing Object Properties "+obj.name);
        System.out.println("Printing Object Properties "+obj.writerName);
        System.out.println("Printing Object Properties "+obj.pages);

        Book obj2= new Book();

        System.out.println("Printing Object 2 Properties "+obj2.name);
        System.out.println("Printing Object 2 Properties "+obj2.writerName);
        System.out.println("Printing Object 2 Properties "+obj2.pages);

    }

}
