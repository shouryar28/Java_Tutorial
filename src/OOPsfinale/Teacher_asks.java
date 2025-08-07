class Teacher_asks {
    public static void main(String[] args) {

//           int[] roll = new int[5];    // Just for reminding syntax
//         Student raj = new Student();
//
//        new : It dynamically allocates memory and returns a reference to it
//        Student raj : compile time
//        new Student() : run time allocates memory in heap memory and raj is stored in stack


//        System.out.println(raj.name);  // null
//        System.out.println(raj.roll);  // 0
//        System.out.println(raj.marks); // 0.0
//
//        raj.roll = 23;
//        raj.name = "Shourya Raj";
//        raj.marks = 78f;

//        System.out.println(raj.roll);
//        System.out.println(raj.name);
//        System.out.println(raj.marks);


//        Student rahul = new Student();
//
//        System.out.println(rahul.roll);
//        System.out.println(rahul.name);
//        System.out.println(rahul.marks);

//         there is so much of repetitions can I directly assign values ?
//                                YES
//        Constructors  : It is function that initializes the object with some variables that are present as                 properties inside that class
//        rahul.greetings();

        Student raj = new Student(23,"Shourya Raj", 99.9f);

        Student random = new Student(raj);

//
//        System.out.println(random.name);
//        System.out.println(random.roll);
//        System.out.println(random.marks);

        Student random2 = new Student();  // Important

        System.out.println(random2.name);
        System.out.println(random2.marks);
        System.out.println(random2.roll);

    }
}

class Student {
    String name;
    int roll;
    float marks;

//    We need a way to add the values of the above properties object by object
//    We need one ord that can replace object name

//    Student(){
//        raj.roll = 23;
//        raj.name = "Shourya Raj";
//        raj.marks = 78f;
//    }

//    void greetings(){
//        System.out.println("Hello, " + this.name);
//    }

    Student(){
//        this.roll = 23;
//        this.name = "Shourya Raj";
//        this.marks = 78;

//        this is how you call constructor from another constructor
//        internally new Student(23, "Default Name", 100.0f);
          this (23, "Default Name", 100.0f);

    }
//    Method Overloading : same name of methods but having different works
//    Method overloading is a feature in some programming languages (like Java, C++, and C#) where multiple methods in the same class can have the same name but differ in their parameter lists (e.g., different number, types, or order of parameters).

//  Suppose in main method
//    Student arpit = new Student(67, "Arpit", 89.9f)
//    now in lower method this will be replaced with arpit
//    this is the correct way of initializing an object;
    Student (int roll, String name, float marks ){
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

//    now creating a  constructor that takes an object as a parameter

    Student (Student other){  // "other is parameter of type student"
        this.roll = other.roll;
        this.name = other.name;
        this.marks = other.marks;
    }
}
