public class WrapperExample {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 20;

        // Integer num = 45;

//        Integer a = 10;
//        Integer b = 20;
//        swap(a, b);
//        System.out.println(a + "  " + b);

//        final int bonus = 2;
//        bonus = 3;  // This will not happen because bonus is final
//        A obj = new A("Raj");
//        System.out.println(obj);
//    }
//    static void swap(Integer a, Integer b) {
//        Integer temp = a;
//        a = b;
//        b = temp;

//        A obj;
//        for(int i = 0; i < 10000000 ; i++){
//            obj = new A();
            // After running this code we can clearly see that Objects destroyed is being printed inside terminal means agar memory pe load badhegaa then garbage collector active ho jaayega.
        // If memory pe load nhi pdaa too code successfully run kar jaayega aur garbage collector bhi run nhi hogaaa.
        }

    }




class A {
    final int num = 10;
    String name;

//    public A(String name) {
//
//        this.name = name;
//    }

//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("Object is destroyed");  // Now the objects are destroyed because we are calling garbage collector here
    }
