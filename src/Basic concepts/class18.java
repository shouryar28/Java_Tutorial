import java.util.Scanner;

public class class18 {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter age ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch(age){
            case 18:
                System.out.println("You are going to become adult!");
                break;
            case 23:
                System.out.println("You are going to join a Job!");
                break;
            case 60:
                System.out.println("Retired!");
                break;
            default:
                System.out.println("Enjoy Your Life! ");
        }
        System.out.println("Thanks for using my java code!");
    }
}
