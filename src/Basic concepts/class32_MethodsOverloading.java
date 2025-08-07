public class class32_MethodsOverloading {
    static void tellJoke(){
        System.out.println("Hahahahahahahahhahahahah");
    }
    static  void change(int a){
        a = 98;
    }
    static  void change2(int []A){
        A[0] = 98;
    }
    public static void main(String[] args) {
      //tellJoke();
//        case 1: Changing the integer
//        int x = 45;
//        System.out.println("The value of x after running change is : " + x);
//        change(x);
//    ** Yha pe x ka value nhi change hoga kyuki function mein x ka copy jaa rha hai.

//        case 2: Changing the Array
        int [] marks = {52,73,77,89,98,94};
        change2(marks);
        System.out.println("The value of x after running change is : " + marks[0]);
        // *****  yha pe marks[0] ka value change ho jaayega..
        //     HOW ?
        // jab bhi hum java ein mein ek array create karte hai too wo ek object kitarah create hota hai aur jo uss obj ka naam hota hai wo as a rrefrence kaam karta hai means wo uss obj ka sirf address store karta hai
        // too jab ye "marks" naam ka reference "change2()" function dwara call kiya jaayega too wha object joo ki marks hai wo wha originally present hoga.
        // that's why marks[0] ka value update ho jaayega
        // sirf refrence copy hota haiiiiiiiiiiiiiiiiiii
    }
}


// Output will be :
//The value of x after running change is : 45
// the value of x will not change because a copy of x is going to "a" in change function
// to jo hoga wo "a" ke value mein change aaayega , "x" mein nhi