package Oops;
class MyMainEmployeee{
    private int id;
    private String name;

    public MyMainEmployeee(String myName,int myId){
        name = myName;
        id = myId;
    }

    public void getName(){
        System.out.println(name);
    }
    public void getId(){
        System.out.println(id);
    }
    public void setName(String n){
        name = n;
    }
    public void setId(int i){
        id = i;
    }
}
public class class42__2__Constructors {
    public static void main(String[] args) {
        MyMainEmployeee raj = new MyMainEmployeee("Shourya Raj",34);  // as we can see that creation and initialization of an object done at same time with the help of constructors.

        raj.getName();
        raj.getId();


    }
}
