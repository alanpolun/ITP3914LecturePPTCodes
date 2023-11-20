class Rectangle {

    private double length;
    private double width;

    public Rectangle() { //default constructor 
        length = 1;
        width = 2;
    }

    public Rectangle(double h, double w) {
        setLength(h);
        setWidth(w);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            this.length = 0;
            System.out.println("Error!");
        }
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            this.width = 0;
            System.out.println("Error!");
        }
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return (length + width) * 2;
    }

    public String toString() {
        return "Height: " + getLength() + " Width: " + getWidth() + " Area: " + area();
    }
}

public class Slide6 {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(10, 20);
        r1 = r2;  //object reference
        r1.setLength(100);
        System.out.println(r1);
        System.out.println(r2);

        r2.setWidth(77);
        System.out.println("");
        System.out.println(r1);
        System.out.println(r2);
        
    }
}
