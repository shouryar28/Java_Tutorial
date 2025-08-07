import java.util.Scanner;

public class class5 {
    public static  void main(String[] args)
    {
        System.out.println("Taking input from the user : ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second Number : ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum is ");
        System.out.println(sum);
    }
}
