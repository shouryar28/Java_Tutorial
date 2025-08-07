package StaticExample;

public class Main {
    public static void main(String[] args) {
//        Human raj = new Human(22, 1000000, "Shourya Raj", false);
//        Human rahul = new Human(23, 1000000, "Rahul Kumar", true);
//
//        System.out.println(Human.population);  // always use class name for static variables , if you use object's name it would run fine but don't use it
//        System.out.println(Human.population);

//        greeting();  // Non - static member cannot be accessed inside a static method
          Main a = new Main();
          a.greeting();

          // Static method
          greet();


    }

    // This is static member and it can be accessed by any other static members, it is independent of objects
    static void greet(){
        System.out.println("Hello Wolves");
    }

    //This function is not static, it is dependent on objects
    void greeting(){ // this belongs to some instance
        System.out.println("Hello World");
        greet();  // we can access a static member inside a non-static member
    }
}
