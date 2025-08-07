public class calss34_Recursion {
    static int factorial(int a) {
        if (a == 1 || a == 0) {
            return 1;
        } else {
            int fact = a * factorial(a - 1);
            return fact;
        }
    }
        public static void main (String[]args){
            int c = factorial(5);
            System.out.println(c);
        }
    }
  //  *****  Note  ******
 //  the code below has a huge problem
/*
   public class calss34_Recursion {
    static int factorial(int a){
         int fact= a*factorial(a-1);
         return fact ;
     }
    public static void main(String[] args) {
        int c = factorial(5);
        System.out.println(c);
    }
}
       ** The mistake in this code is that it
       lacks a base case for the recursion to stop.
       In a recursive function like factorial, there needs to be a condition
       where the recursion stops and returns a specific value.

*/