package Oops;

import java.util.Scanner;
import java.util.TooManyListenersException;


//   ******************   Problem 1   *******************************
class Worker{
    int Salary;
    String name;
    public int getSalary(){
        return  Salary;
    }
    public String getName(){                 // public String getname(){return name;}
        return name;
    }
    public void setName(String n){
        name = n;

    }
}

//   ******************   Problem 2   *******************************

class Cellphone{
      public void ring(){
        System.out.println("The cellphone is Ringing");
    }

    public void Vibrate(){
        System.out.println("The cellphone is Vibrating");
    }
}

//   ******************   Problem 3   *******************************
class Square{
    int side;
    public void perimeter(){
        System.out.println(4*side);
    }
    public void area(){
        System.out.println(side*side);
    }
}

//   ******************   Problem 4   *******************************
class Rectangle{
    int l;
    int b;
    public void perimeter(){
        System.out.println(2*(l+b));
    }
    public void area(){
        System.out.println(l*b);
    }

}

//   ******************   Problem 5   *******************************
class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void fire(){
        System.out.println("Firing the enemy");
    }  public void run(){
        System.out.println("Running the enemy");
    }
}

public class class39_practiceSet_OOPs {
    public static void main(String[] args) {
        //  ---------------------- Problem 1 -------------------

        Worker raj = new Worker();
        raj.setName("Shourya Raj");
        raj.Salary = 233333;
        System.out.println(raj.getSalary());
        System.out.println(raj.getName());

        // ----------------------- Problem 2  -------------------


        Cellphone Nokia = new Cellphone();
        Nokia.ring();
        Nokia.Vibrate();

        // ------------------- Problem  3   -------------------

        Square S = new Square();
        S.side = 40;
        S.perimeter();
        S.area();

        //  -------------------  Problem  4 -------------------

        Rectangle R = new Rectangle();
        R.l = 10;
        R.b = 5;
        R.perimeter();
        R.area();

        // --------------------  Problem 5  -------------------


        Tommy T = new Tommy();
        T.fire();
        T.hit();
        T.run();

    }
}
