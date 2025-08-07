public class class25_pactice_set {
    public static void main(String[] args) {
        // Problem 1
//        int n  = 4;
//        for (int i = n;i>0;i--){
//            for (int j = 0;j<i;j++) {
//                System.out.print("*");
//         *   }
//            System.out.print("\n");
//        }
//
        // Problem 2
//        int n = 10;
//        int count = 0;
//        int sum = 0;
//        while(count<=10){
//            if((count%2) == 0)
//            {
//            sum = sum + count;
//            }
//            count++;
//        }
//        System.out.println(sum);

        //Problem 3
//        int multiple =1;
//        //n = 5;
//        for(int i = 1;i<=10;i++){
//            multiple = 5*i;
//            System.out.printf(" 5 * %d = %d\n",i,multiple /* or it can be n*i */);
//            multiple = 1;
//        }

        //Problem 4
//        int num = 10;
//        for (int i = 10;i>=1;i--){
//            System.out.printf("%d * %d = %d\n",num,i,num*i);
//        }

        //Problem 5
        int num = 4;
        int factorial = 1;
//        for (int i = num;i>0;i--){
//            factorial = factorial*i;
//        }
//        System.out.println(factorial);
        // Problem 6 ### Method 2 (using a while loop)
        while(num>0){
            factorial = factorial*num;
            num--;
        }
        System.out.println(factorial);
    }
}
