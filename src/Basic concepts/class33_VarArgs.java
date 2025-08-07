public class class33_VarArgs {
//    static int sum(int a, int b){
//       return  a+b;
//    }                                  // Variable Arguments
//    static int sum(int a, int b,int c){
//        return  a+b+c;
//    }
//    static int sum(int a, int b,int c,int d){
//        return  a+b+c+d;
//    }
    static int sum(int ...arr){
        int result = 0;
        for(int a : arr){
             result= result + a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println( "The sum of nothing is : " + sum());
        System.out.println( "The sum of 5 and 4 is : " + sum(5,4));
        System.out.println( "The sum of 5 ,4 and 3 is : " + sum(5,4,3));
        System.out.println( "The sum of 5 ,4 ,3 and 2 is : " + sum(5,4,3,2));
        // it is very lengthy that we have to create several methods for increasing a number of variables.
        // *******  Solution is Varargs   *********
        // static int sum(int ...arr){}   ---->>>>  iska kaaam hai jitne bhi arguments hai sabko array mein daal kar dedo
        // isse hume methods mein variables create karna nhi parega for every increasing in number of variables in main method
    }
}
