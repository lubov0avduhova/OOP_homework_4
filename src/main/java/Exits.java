import java.util.LinkedList;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getXnY() {
        return x * 10 + y;
    }

    @Override
    public String toString() {
        return x + "" + y;
    }
}


public class Exits {

    private LinkedList<Point> exits;

    public Exits() {
        exits = new LinkedList<>();
        exits.add(new Point(4, 1));
        exits.add(new Point(4, 4));
    }

    public Point getExits(int i) {
        return exits.get(i);
    }

    public LinkedList getExits() {
        return exits;
    }

    public String toString() {
        return exits.toString();
    }


}


