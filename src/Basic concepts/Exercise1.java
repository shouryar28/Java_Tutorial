import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of the student : ");
        System.out.println("Enter the marks of the student in Subject 1 : ");
        int sub1 = sc.nextInt();
        System.out.println("Enter the marks of the student in Subject 2 : ");
        int sub2 = sc.nextInt();
        System.out.println("Enter the marks of the student in Subject 3 : ");
        int sub3 = sc.nextInt();
        System.out.println("Enter the marks of the student in Subject 4 : ");
        int sub4 = sc.nextInt();
        System.out.println("Enter the marks of the student in Subject 5 : ");
        int sub5 = sc.nextInt();
        int sum = sub1+sub2+sub3+sub4+sub5;
        float percentage = ((float) sum /500)*100;
        System.out.print("The percentage scored is : ");
        System.out.println(percentage);
    }
}
