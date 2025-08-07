package Oops;
class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void printMe(){
        System.out.println("Hello");
    }
}
class Derived extends Base{
    /*here derived is a class name that
    is extended version of class Base*/
    // child of original class base created
   int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class class45_Inheritance {
    public static void main(String[] args) {
     // Creating an object of base class

        Base b = new Base();
          b.setX(12);
          System.out.println(b.getX());

      // Creating an object of derived class

          Derived d = new Derived();
          d.setX(24);
        System.out.println(d.getX());
    }
}
