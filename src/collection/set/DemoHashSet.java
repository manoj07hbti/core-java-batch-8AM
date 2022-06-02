package collection.set;

import java.util.HashSet;

public class DemoHashSet {

    public void createHashSet(){

        // HashSet <Datatype> objname= new HashSet<>();

        HashSet <String> cities= new HashSet<>();

        cities.add("AGRA");
        cities.add("PUNE");
        cities.add("Delhi");
        cities.add("AGRA");
        cities.add("PUNE");
        cities.add("Delhi");

        for (String city: cities){

            System.out.println("Printing city :" +city);
        }
    }

    public static void main(String[] args) {

        DemoHashSet obj= new DemoHashSet();
        obj.createHashSet();
    }
}
