package collection.arraylist;

import java.util.ArrayList;

public class ArrayListDemo {

    public void createArrayList(){

        //SYNTAX: CollectionName obj_name= new CollectionName();

        ArrayList mylist= new ArrayList();

        // add element to list
        mylist.add("Java");     // 0 index
        mylist.add("Spring "); // 1 index
        mylist.add("Spring boot");// 2 index
        mylist.add(33);// 3 index
        mylist.add("4.7");
        mylist.add("A");

        // get object from list
        System.out.println( mylist.get(0));
        System.out.println( mylist.get(1));
        System.out.println( mylist.get(2));
        System.out.println( mylist.get(3));

        // remove object from list

        mylist.remove(1);
        System.out.println("After remove..");
        System.out.println( mylist.get(1));
        System.out.println( mylist.get(2));

        for (int i=0; i<mylist.size(); i++){

            System.out.println("Printing List "+mylist.get(i));
        }

         for (Object var: mylist){

             System.out.println("Advanced for loop "+var);
         }


    }


    public static void main(String[] args) {

        ArrayListDemo obj= new ArrayListDemo();
        obj.createArrayList();
    }

}
