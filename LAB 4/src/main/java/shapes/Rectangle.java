package shapes;

public class Rectangle extends Shape {
    protected double width;
    protected double height;
    public Rectangle(String c, FillType f, double w, double h){
        super(c, f);
        this.width=w;
        this.height=h;
    }
    @Override
    public void displayInfo(){
        System.out.println("Shape: Rectangle \nColor: "+this.color+
                "\nFill: "+this.filled+"\nWidth: "+this.width+
                "\nHeight: "+this.height+"\nArea: "+this.getArea());
    }

    @Override
    public double getArea() {
        return this.height*this.width;
    }
}
