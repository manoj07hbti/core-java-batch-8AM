package imp_keywords;

public final class DemoFinal {

    //TODO FINAL KEYWORD : IT CAN NOT BE CHANGED
    // 1 CLASS : no one can make child of that class
    // 2 METHOD: No one can override final method
    // 3 VARIABLE: No one can change value of final variable

    public final void m1(){

        final int age =24;

       // age=25;// no one can change value of final variables
        System.out.println("This is a final methods");
    }




}
