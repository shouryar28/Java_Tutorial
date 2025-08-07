package StaticExample;

//class Test{
//    String name;
//
//    public Test(String name) {
//        this.name = name;
//    }
//}
public class InnerClass {

    //    class Test{   // This is known as inner class ()
//        String name;
//
//        public Test(String name) {
//            this.name = name;
//        }
//    }
    static class Test {   // This is known as inner class ()
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
//        Test a = new Test();
//
//        It is giving error that test is a non-static member jabki hum iska object create kar rhe

//        ye error de rha hai isiliye kyuki Test ek class ke andar hai aur uska object nhi hai
//         Test needs an instance of inner class to run
//        agar yhi test class InnerClass ke bahar define ho too object bnaa sakte hai kyuki wo ab kisi class ke andar present nhi hai

//        Test a = new Test("Shourya");

//         But if we use static keyword in class test when it is present inside the Innerclass, now it will not give error because now Test is independent from the objects of inner class
        Test a = new Test("Shourya");
        System.out.println(a.name);
    }
}
