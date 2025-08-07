package Oops;
class MyMainEmployee{
    private int id;
    private String name;

    //  ________________  constructors  ____________________
    public MyMainEmployee(){
        name = "Your name here";
        id = 45;
    }
    // _____________________________________________________
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
public class class42_Constructors {
    public static void main(String[] args) {
        MyMainEmployee raj = new MyMainEmployee(); // constructor ka kaam hai jaise hi ek objet create ho ussi waqt usko initialize bhi kar diy jaaye
//        raj.setName("Shourya Raj");
//        raj.getName();
       raj.getName();  // yha pe constructor automatically invoke ho jaayega
       raj.getId();    //  aur wo print kar dega jo bhi public MymainEmployee mein likha hai


    }
}
