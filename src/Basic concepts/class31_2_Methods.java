public class class31_2_Methods {
     // ************ Declaring methods without using static *************
   int logic(int x,int y){

        int z;
        if (x>y){
            z = x+y;
        }
        else {
            z = (x + y) * 5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        class31_2_Methods obj = new class31_2_Methods();
        c = obj.logic(a,b);
        int a1 = 3;
        int b1 = 2;
        int d;
        d = obj.logic(a1,b1);
        System.out.println(c);
        System.out.println(d);
    }
}



