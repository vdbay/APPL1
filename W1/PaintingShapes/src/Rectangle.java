public class Rectangle extends Shape {
    private double x;
    private double y;

    public Rectangle(double x,double y){
        super("Rectangle");
        this.x=x;
        this.y=y;
    }

    @Override
    public double area() {
        return x*y;
    }

    @Override
    public String toString() {
        return super.toString() + " of x " + x + " and y "+y;
    }
}
