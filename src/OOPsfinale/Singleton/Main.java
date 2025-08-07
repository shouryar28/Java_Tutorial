package Singleton;

public class Main {
    public static void main(String[] args) {
//        Singleton A = new Singleton(); // it is giving error that Singleton has only private access means objects of singleton cal only formed inside Singleton.java file, not outside of it

        Singleton obj = Singleton.getInstance();  // here new obj is created
        Singleton obj2 = Singleton.getInstance();  // points to obj
        Singleton obj3 = Singleton.getInstance();  // points to obj
//      we have created many objects but they all are referencing to same place

        // all 3 reference variables pointing to same object
    }
}
