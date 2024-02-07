package first;

public class Rectangle {
    private Point first;
    private Point second;

    public Rectangle(Point p1, Point p2) {
        this.first = p1;
        this.second = p2;
    }

    public int getArea() {
        return Math.abs(first.x() - second.x()) * Math.abs(first.y() - second.y());
    }

    public Point getFirst() {
        return first;
    }

    public Point getSecond() {
        return second;
    }

    public int getCrossedArea(Rectangle r) {
        int xOverlap = Math.max(0, Math.min(this.second.x(), r.getSecond().x()) - Math.max(this.first.x(), r.getFirst().x()));
        int yOverlap = Math.max(0, Math.min(this.second.y(), r.getSecond().y()) - Math.max(this.first.y(), r.getFirst().y()));

        return xOverlap * yOverlap;
    }
}