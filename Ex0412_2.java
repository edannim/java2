public class point {
    private ubt x, y;
    public Point1(int x, int y) {
        this.x = x;
        this.y = y;   
    }
    public void showPoint() {
        System.out.println("("+ x +"," + y +")");
    }
    
}

class ColorPoint1 extends Point1 {
    private String color;
    public ColorPoint1(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }
public void setColor(String color) {
    this.color = color;
}

    public void showColorPoint() {
        System.out.println(color);
        showPoint();
    }
}


public class Ex0412_2 {
    
    public static void main(String[] args) {
       ColorPoint cp = new ColorPoint(5, 6, "blue");
       cp.showColorPoint();
    }
}
