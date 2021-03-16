public abstract class Shape {
    private String shapeName;

    public Shape (String shapeName){
        this.shapeName=shapeName;
    }

    public abstract double area();

    @Override
    public String toString() {
        return "Shape Name : " + shapeName;
    }
}
