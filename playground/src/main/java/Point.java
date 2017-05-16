/**
 * Created by marinacalin on 5/16/17.
 */
public class Point {

    public double x;
    public double y;

    public Point(double arg1, double arg2) {
        this.x = arg1;
        this.y = arg2;
    }

    public double distance(Point p1, Point p2) {
        return Math.sqrt((p2.x - p1.x)*(p2.x - p1.x) + (p2.y - p1.y)*(p2.y - p1.y));
    }

}
