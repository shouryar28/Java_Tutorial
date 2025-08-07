public class class24_BreakAndContinue {
    public static void main(String[] args) {
//        for (int i = 0;i < 5;i++){
//            System.out.println(i);
//            if (i == 2){
//                System.out.println("you have exited the loop");
//                break;
//            }
//        }
//        System.out.println("Java is great");

        for (int i = 0;i<5;i++){
            if (i == 2){
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great!  ");
        }
    }
}
