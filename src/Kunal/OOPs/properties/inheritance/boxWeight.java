package Kunal.OOPs.properties.inheritance;

public class boxWeight extends Box{
    double weight;

    public boxWeight() {
        this.weight = -1;
    }

    public boxWeight(double l, double w, double h, double weight) {
        super(l, w, h); // what is this ? call the parent class constructor
        // used to initialise values present in parent class
        this.weight = weight;
    }
}
