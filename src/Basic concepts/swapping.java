import java.util.Scanner;

public class swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        // Swapping using temporary variable
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("\nAfter swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        sc.close();
    }
} 