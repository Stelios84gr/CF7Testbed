package gr.aueb.cf.ch14;

public class Point2D extends Point {
    private double y;

    public Point2D() {
        //  super();    // ως πρώτη εντολή καλεί τον default constructor της Point
        //  y = 0;
    }

    public Point2D(double x, double y) {
        //super(x);   // ως πρώτη εντολή καλεί τον overloaded constructor της Point
        setX(x);      // αν δεν κληθεί ρητά ο overloaded constructor της Point, καλείται ο default και             // μετά ρητά ο setter
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return super.toString() + "(" + y + ")";
    }


//    @Override
//    public String pointToString() {
//        return super.pointToString() + "(" + y + ")";
//    }

    // Liskov substitution principle
    @Override
    public void movePlus10() {
        super.movePlus10();
        y += 10;
    }

    @Override
    protected void movePlusOne() {
        super.movePlusOne();
        y += 1;
    }
}