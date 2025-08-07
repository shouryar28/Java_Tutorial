package Oops;

class Base1{
    Base1(){
        System.out.println("I am a constructor of base1");
    }
    Base1(int a){     // Overloaded constructor
        System.out.println("I am a overloaded constructor with value of a as " + a);
    }

}

class derived1 extends Base1{
    derived1(){
        super(0);
        System.out.println("I am a derived class constructor");
    }
}

//class derived2 extends derived1{
//    derived2(){
//        System.out.println("I am a derived 2 class constructor");
//    }
//}
public class class46_Constructors_in_Inheritance {
    public static void main(String[] args) {
//        Base1 obj = new Base1();
        derived1 obj1 = new derived1();
//        derived2 obj2 = new derived2();
    }
}

// Output
/*
 I am a constructor of base1
I am a constructor of base1          ------> derived class mein jo constructor hai wo base waale constructor ke baad run hoga
I am a derived class constructor                       priority base1 constructor ko jada milega
*/

// derived1 "by default"  base1 ke us constructor ko call karega jo ki koi parameters naa leta hoo..
// agar hum base1 ke overloaded constructor ko call karna chahte hai too hume "super" keyword ka use karenge
   //   NOTE : koi ek hi constructor call kiya ja sakta hai derived class ke andar