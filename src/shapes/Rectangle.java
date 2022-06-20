package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle() {
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }

    public double getArea() {
        return length * width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

}
