public class class28_Multi_dim_Arr {
    public static void main(String[] args) {
        //let marks naam ka ek array hai aur uske elements apne aap mein hi ek array hai
        //for eg: marks[0] ek array hai
        int [] marks; // a 1-D Array;
        int [][] flats; // a 2-D Array;
        flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 104;
        flats[1][1] = 105;
        flats[1][2] = 106;

        System.out.println("Printing a 2-D array using for loop");
        for (int i = 0;i< flats.length;i++){
            for (int j = 0;j< flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
