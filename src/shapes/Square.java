package shapes;

public class Square extends Rectangle {
    protected int side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
        this.width = side;
        this.length = side;
    }

    public void setLength(int side) {
        setSide(side);
    }

    public void setWidth(int side) {
        setSide(side);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}

