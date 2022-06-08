package collection.hashmap;

import model.Student;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DemoHashMap {

    public void createhashMap(){

        // HashMap <DataType Key , Datatype_Value> var_name= new HashMap<>();
        HashMap <Integer, String> hashMap= new HashMap<>();

        // adding value to hashmap

        hashMap.put(1,"Java");
        hashMap.put(2,"Spring");
        hashMap.put(3,"Spring Boot");
        hashMap.put(4,"Cloud and Micro services");

        // getting an element

        System.out.println("Getting element from map at key 4 "+hashMap.get(4));
        System.out.println("Getting element from map at key 2 "+hashMap.get(2));

        // for loop in hashmap: keySet()---> it will return Set of keys

        Set<Integer> keys= hashMap.keySet();

        for (Integer var:keys){
          System.out.println("Printing map in for loop "+hashMap.get(var));

        }


    }

    public void createStudentMap(){

        //   HashMap <DataType Key , Datatype_Value> var_name= new HashMap<>();

        HashMap<Integer, Student> studentHashMap= new HashMap<>();

        // creating object with data of Student
        Student student1= new Student("Raj",23,"CS");
        Student student2= new Student("Rahul",21,"CS");
        Student student3= new Student("Jitendra",24,"CS");

        studentHashMap.put(1,student1);
        studentHashMap.put(2,student2);
        studentHashMap.put(3,student3);

        System.out.println("Printing 3 Student "+studentHashMap.get(3).getName());

        for(Integer var: studentHashMap.keySet()){

            System.out.println("Printing student map "+studentHashMap.get(var).getName() +": " +
                    " "+studentHashMap.get(var).getAge()+" : "+studentHashMap.get(var).getSection());
        }
    }

    public static void main(String[] args) {

        DemoHashMap obj= new DemoHashMap();
        obj.createhashMap();
        obj.createStudentMap();
    }



}

