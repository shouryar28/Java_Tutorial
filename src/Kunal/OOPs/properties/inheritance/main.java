package Kunal.OOPs.properties.inheritance;

public class main {
    public static void main(String[] args) {
        Box box = new Box();
        Box box1 = new Box(4);

        Box box2 = new Box(box1);  // constructor taking another type of constructor
        System.out.println(box.l + " " + box.w + " " + box.h);
        System.out.println(box1.l + " " + box1.w + " " + box1.h);
        boxWeight box3 = new boxWeight(2,3,4,5);
        System.out.println(box3.l + " " + box3.weight);

        Box box5 = new boxWeight(2,3,4,5);
        // System.out.println(box5.weight);  Not able to access cause box is just refrencing to box weight.
        // only member are accessible which are present in super class
    }
}
