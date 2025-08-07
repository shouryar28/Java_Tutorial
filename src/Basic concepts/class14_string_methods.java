public class class14_string_methods {
    public static void main(String[] args) {
        String name = new String("Shourya");
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        String name1 = name.substring(3);
        System.out.println(name1);
        String name2 = name.substring(2,6);
        System.out.println(name2);
        String name3 = name.replace('h','a');
        System.out.println(name3);
        System.out.println(name.startsWith("Sh"));
        System.out.println(name.endsWith("ya"));

    }

}
