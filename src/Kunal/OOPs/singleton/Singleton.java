package Kunal.OOPs.singleton;
// If a user only wants to create only one instace of a paricular class
public class Singleton {
    private Singleton() {

    }
    private static Singleton instance; // used static keyword because we can't get instance of a private constructor


    public static Singleton getInstance(){
        // check whether 1 obj only is created or not
        if (instance == null){
            instance = new Singleton();
        }
        return instance;

    }
}
