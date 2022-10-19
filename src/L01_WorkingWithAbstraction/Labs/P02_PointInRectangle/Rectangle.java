package L01_WorkingWithAbstraction.Labs.P02_PointInRectangle;

public class Rectangle {

    private Point bottomLeft;
    private Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public Point getBottomLeft() {
        return bottomLeft;
    }

    public Point getTopRight() {
        return topRight;
    }

    public boolean contains(int x, int y){

        return bottomLeft.getCoordinateX() <= x && bottomLeft.getCoordinateY() <= y
                && topRight.getCoordinateX() >= x && topRight.getCoordinateY() >= y;
    }
}
