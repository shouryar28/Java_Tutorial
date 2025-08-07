package StaticExample;

 class Human {
    int age;
    int salary;
    String name;
    boolean martial_status;
    static int population;  // This is common for all the humans as the number of human increases this value should also increase globally

    Human(int age, int salary, String name, boolean martial_status){
        this.age = age;
        this.salary = salary;
        this.name = name;
        this.martial_status = martial_status;
        Human.population += 1;  // Always use class name before the static variable because it is common to all objects so using class name will sound better
    }
}
// Static variables do not need any kind of objects to use it