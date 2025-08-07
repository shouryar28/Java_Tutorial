import java.util.Scanner;

public class class16_conditionalStatement {
    public static void main(String[] args) {
        System.out.println("Enter age to check : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>18){
            System.out.println("You can drive");
        } else if (age<10) {
            System.out.println("Abee Paida too hoja thik se");

        } else{
            System.out.println("You can't drive");
        }
    }
}
