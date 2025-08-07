public class class32_2_MethodsOverloading {
    static  void foo(){
        System.out.println("Hello");
    }
    static void foo(int a){
        System.out.println("Hello " + a);
    }
    static void foo(int a,int b){
        System.out.println("Hello " + a + " and "+b);
    }
    public static void main(String[] args) {
        // Method Overloading
        // Methods of having same name but having different work.
        // Hum return type change karke method overloading nhi kar sakte.
        foo();
        foo(3000);
        foo(3000,5000); // Arguments are actual value.
    }
}
