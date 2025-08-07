import java.util.Locale;

public class class15_practiceSet_strings {
    public static void main(String[] args) {

        // Problem 1
        String name = "Shourya Raj";
        name = name.toLowerCase();
        System.out.println(name);

        // Problem 2
        String text = "To lower Case";
        text = text.replace(" ","_");
        System.out.println(text);

        // Problem 3
        String letter = "Dear <|name|>, Thanks a lot! ";
        letter = letter.replace("<|name|>","Shourya Raj");
        System.out.println(letter);

        //Problem 4
        String myString = "My string contains double  and triple   spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        //Problem 5
        String letter2 = "Dear Raj ,\n\tThis java course is nice.\n Thanks! ";
        System.out.println(letter2);
    }
}
