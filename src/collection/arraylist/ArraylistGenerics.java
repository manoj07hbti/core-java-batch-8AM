package collection.arraylist;

import java.util.ArrayList;

public class ArraylistGenerics {

    public void createStringList(){

        //SYNTAX :  CollectionName <DATATYPE> objName= new CollectionName<>();

        ArrayList <String> cities= new ArrayList<>();

        cities.add("Agra");
        cities.add("Delhi");
        cities.add("Pune");

        for(int i=0; i<cities.size(); i++){

            System.out.println("Printing cities "+cities.get(i));
        }

        for (String var: cities){

            System.out.println("Advanced loop "+var);
        }

    }

    public void createIntList(){

        ArrayList <Integer> marks= new ArrayList<>();
        marks.add(38);
        marks.add(56);
        marks.add(45);
        marks.add(75);

        for (Integer var: marks){

            System.out.println("Printing marks "+var);
        }


    }

    // createDoubleList



    public static void main(String[] args) {

        ArraylistGenerics obj= new ArraylistGenerics();
        obj.createStringList();
        obj.createIntList();

    }
}
