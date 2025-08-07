package Kunal.OOPs.singleton;

public class main {
    public static void main(String[] args) {
//        Singleton obj = new Singleton(); // we cant create object of a class whose constructor is private in other files.
        Singleton obj1 = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        Singleton obj3 = Singleton.getInstance();

        // all 3 ref variables are pointing to just one object
    }
}
