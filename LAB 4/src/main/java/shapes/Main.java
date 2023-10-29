package shapes;

import org.w3c.dom.css.Rect;

public class Main {
    public static void main(String[] args) {
        Circle krug = new Circle("Red",FillType.FILLED,5);
        Rectangle prav = new Rectangle("Blue", FillType.NOT_FILLED,5,3);

        krug.displayInfo();
        prav.displayInfo();
    }

}
