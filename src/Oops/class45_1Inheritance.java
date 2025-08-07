package Oops;

class Animal{
    private String name;
    public void setName(String n){
        name = n;
    }
    public void getName(){
        System.out.println(name);
    }


}

class dog extends Animal{ // Note it will not take any parameters
    private String breed;

    public void setBreed(String b){
        breed = b;
    }
    public void getBreed(){
        System.out.println(breed);
    }

}

public class class45_1Inheritance {
    public static void main(String[] args) {
        Animal A = new Animal();
        A.setName("Dog");
        A.getName();

        dog kutta = new dog();
        kutta.setBreed("Dobber Man");
        kutta.getBreed();
    }
}
