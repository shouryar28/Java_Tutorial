package properties.inheritance;

public class Box {
    int l;
    int w;
    int h;

    Box(){
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }
//  Cube
    Box(int side){
        this.l = side;
        this.w = side;
        this.h = side;
    }
//  Cuboid
    Box(int l, int w, int h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(Box old){        // taking object as an parameter
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }
}
