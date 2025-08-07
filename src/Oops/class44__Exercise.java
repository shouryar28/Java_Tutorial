package Oops;
class cylinder{
   private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


}


public class class44__Exercise {
    public static void main(String[] args) {
        cylinder c = new cylinder();
        c.setHeight(12);
        int h = c.getHeight();
        System.out.println(h);

        c.setRadius(23);
        int r = c.getRadius();
        System.out.println(r);

    }
}
