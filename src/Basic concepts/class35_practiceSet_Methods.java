public class class35_practiceSet_Methods {

    // Problem 1
//     static void multiple(int n){
//         for (int i = 1;i<=10;i++){
//             System.out.printf("%d * %d = %d",n,i,(n*i) );
//             System.out.println();
//         }
//     }

    // Problem 2
//    static void starPrint(int rows){
//        for (int i = 0;i<=rows;i++){
//            for (int j = 0;j<i;j++ ){
//            System.out.print("*");
//
//            }
//            System.out.println();
//        }
//    }
     static  int summation(int a)
    {
        int sum = 0;
         if (a == 0){
            return 0;
        }
        else {
             sum = a + summation(a -1);
        }
        return  sum;
    }
    public static void main(String[] args) {
//        multiple(10);  problem 1
//        starPrint(5);  problem 2
        int c= summation(5);
        System.out.println(c);
    }
}
