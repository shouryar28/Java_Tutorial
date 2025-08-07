import java.util.Scanner;

public class class29_PracticeSet6 {
    public static void main(String[] args) {
         // Problem 1
       /*
        float [] marks = new float[5];
        float sum = 0;
        System.out.println("Enter marks of a student");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks in subject 1");
        marks[0] = sc.nextFloat();
        System.out.println("Enter marks in subject 2");
        marks[1] = sc.nextFloat();
        System.out.println("Enter marks in subject 3");
        marks[2] = sc.nextFloat();
        System.out.println("Enter marks in subject 4");
        marks[3] = sc.nextFloat();
        System.out.println("Enter marks in subject 5");
        marks[4] = sc.nextFloat();
        for (float mark : marks) {
            sum = sum + mark;
        }
        System.out.println(sum);
        */

        // Problem 2
//        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
//        int num = 19;
//        boolean isInArray = false;
//        for(int element : numbers){
//            if (element == num)
//            {
//                isInArray = true;
//                break;
//            }
//
//        }
//        if (isInArray){
//            System.out.println("The element is present in the array");
//        }
//        else {
//            System.out.println("The element is not present in the array");
//
//        }

        // Problem 3
          //Done

        // Problem 4
//        int [][] sum = new int [2][3];
//        int [][] array1 = {{1,2,3},{4,5,6}};
//        int [][] array2 = {{1,2,3},{4,5,6}};
//        System.out.println("The sum is : ");
//        for (int i = 0;i<array1.length;i++){
//            for (int j = 0;j<array1[i].length;j++){
//                sum[i][j] = array1[i][j] + array2[i][j];
//                System.out.print(sum[i][j]);
//                System.out.print(" ");
//            }
//            System.out.print("\n");
//        }

        // Problem 5
        // Reverse an array
        int[] n = {1,2,3,4,5,6};
        for (int i = 0;i<(n.length)/2;i++){
            int temp = n[i];
            n[i] = n[n.length-i-1];
            n[n.length-i-1] = temp;
        }
      for (int element : n){
          System.out.print(element);
          System.out.print(" ");
      }
    }

}
