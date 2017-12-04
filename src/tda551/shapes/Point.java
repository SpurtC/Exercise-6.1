package tda551.shapes;

public class Point {

    private final int X;
    private final int Y;

    Point(int x, int y) {
        this.X = x;
        this.Y = y;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    Point move(int x, int y) {
        return new Point(x, y);
    }
}
