package Singleton;

// Singleton : A class whose only one object can be formed

public class Singleton {

    private Singleton() { // using private key no one can access outside this file so no one can generate objects of this class.
    }
    private static Singleton instance;  // It is the instance that will be created for object

    public static Singleton getInstance() {  // Singleton ke object pe depend naa kree isiliye static bnaaa diye
        // check whether one object is created or not

        // If no object is created yet then create one
        if(instance == null){
            instance = new Singleton(); // object is created // private method can be called inside the same file
        }
        return instance;
    }
}
