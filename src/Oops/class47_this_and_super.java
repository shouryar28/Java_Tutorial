package Oops;
class EkClass{
    int a;

    public int getA() {
        return a;
    }

    EkClass(int v){

        a = v;
    }
    public int returnOne(){
        return 1;
    }

}

class DoClass extends EkClass{
    DoClass(int c){
        super(c);
        System.out.println("Mai ek constructor hoon !");
    }
}
public class class47_this_and_super {
    public static void main(String[] args) {
      EkClass e = new EkClass(4);
        System.out.println(e.getA());

        DoClass d = new DoClass(5);
        System.out.println(d.getA());

    }
}
