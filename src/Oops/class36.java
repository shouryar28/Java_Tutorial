package Oops;
// Note : there can be ony one public class is allowed in java program........
class Employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println("The id of the employee is " + id );
        System.out.println("The name of the employee is " +name );
    }
}

public class class36 {
    public static void main(String[] args) {
        Employee Raj = new Employee();
        Employee Rahul = new Employee();
        Raj.id = 10;
        Raj.name = "CodeWithBeast";

        Rahul.id = 15;
        Rahul.name = "CodeWithBeast";


//        System.out.println(Raj.id);
//        System.out.println(Raj.name);
//
//        System.out.println(Rahul.id);
//        System.out.println(Rahul.name);
        Raj.printDetails();

    }
}
