public class class31_Methods {

//    Java static method
//    If you apply static keyword with any method, it is known as static method.
//
//            A static method belongs to the class rather than the object of a class.
//    A static method can be invoked without the need for creating an instance of a class.
//    A static method can access static data member and can change the value of it.
    static int logic(int x,int y){ // Methods ka static hona compulsary hai
        // agar static nhi use karte hai too humko obj create karna parega
        // uske baad usko call kar sakte hai
        int z;
        if (x>y){
            z = x+y;
        }
        else {
           z = (x + y) * 5;
        }
        return z;
    }
    public static void main(String[] args) {
     int a = 5;
     int b = 7;
     int c = logic(a,b);
        System.out.println(c);
    }
}

