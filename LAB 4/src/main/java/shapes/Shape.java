package shapes;

public class Shape {
    protected String color;
    protected FillType filled;

    public Shape(String c, FillType f){
        this.color=c;
        this.filled=f;
    }
    public void displayInfo(){
        System.out.println("The shape is "+this.color+
                " and is "+this.filled);
    }
    public double getArea(){
        return 0;
    }
}
