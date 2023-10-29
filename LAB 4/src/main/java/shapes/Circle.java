package shapes;

public class Circle extends Shape{
    protected double radius;
    public Circle(String c, FillType f, double r){
        super(c,f);
        this.radius=r;
    }
    @Override
    public void displayInfo(){
        System.out.println("Shape: Circle \nColor: "+this.color+
                "\nFill: "+this.filled+"\nRadius: "+this.radius+
                "\nArea: "+this.getArea());
    }

    @Override
    public double getArea() {
        return (radius*radius*3.14);
    }

    public double calculateCircumference(double PI, double r){
        return 2*PI*r;
    }

    public double calculateCircumference(double r){
        return 2*3.14*r;
    }

}
