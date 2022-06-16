package imp_keywords;



public class ChildStatic extends DemoStatic {

    public static void hello(){

        System.out.println("CHILD This is Static method ");
    }

    public static void main(String[] args) {

        ChildStatic.hello();
    }
}
