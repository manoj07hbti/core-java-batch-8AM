package arrays_demo;

public class Demo {


    public void createStringArray(){

        String city1="AGRA";
        String city2="Delhi";
        String city3="Pune";

        // Syntax:   Datatype [] var_name= {value1,value2,value3......valuen};

        String [] cities={"Agra","Delhi","Pune","Kolkata","Jaipur"};
                        //  0       1      2       3         4
       // access element : var_name[index];

        System.out.println(cities[2]);
        System.out.println(cities[0]);
        System.out.println(cities[3]);

        // printing all elements of array

        for (int i=0; i<cities.length; i++){

            System.out.println("Printing array in loop "+ cities[i]);
        }

        // Advanced for loop :  for(Datatype var_name : Array/Collection ) { CODE }

        for (String var : cities){

          System.out.println("Advanced for loop "+var);
        }

    }

    public void createIntArray(){
        // Syntax:   Datatype [] var_name= {value1,value2,value3......valuen};

        int [] marks = {35,67,90,38,44,56,29,55};
                      // 0  1  2  3  4  5  6  7
        System.out.println(marks[2]);

        // for loop

        // advance for loop
    }
    // createDoubleArray : prices


    public static void main(String[] args) {

        Demo obj= new Demo();
        obj.createStringArray();
        obj.createIntArray();

    }
}
