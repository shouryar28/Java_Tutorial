package Oops;
class MyEmployee{
    private int id;
    private String name;
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
public class class40_AccessModifiers {
    public static void main(String[] args) {
        MyEmployee employee1 = new MyEmployee();
//        employee1.id = 10;                  ------------>>>>>>>>>>  Throws error cause accessing the private
//        employee1.name = "Shourya Raj";                              attributes of MyEmployee class

        employee1.setId(10);
        employee1.getId();
        employee1.setName("Shourya Raj");
        employee1.getName();


    }
}
