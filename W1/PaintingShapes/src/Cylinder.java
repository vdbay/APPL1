public class Cylinder extends Shape{
    private double r;
    private double h;
    public Cylinder(double r,double h){
        super("Cylinder");
        this.r=r;
        this.h=h;
    }

    @Override
    public double area() {
        return Math.PI*r*r*h;
    }

    @Override
    public String toString() {
        return super.toString() + " of r " + r + " and h "+h;
    }
}
