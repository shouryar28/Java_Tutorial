package Kunal.OOPs.staticExamples;
import java.util.*;
public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void message(){
        System.out.println("Hello World");
//        System.out.println(this.age);  // can not this over here because "this"  points to object and object needs instances but static dosent allows any instances
    }
    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }

}
