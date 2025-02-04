package gr.aueb.cf.ch14;

public class PointMain {

    public static void main(String[] args) {

//        Point point = new Point();
//        Point2D point2D = new Point2D();
//        Point3D point3D = new Point3D();

        Point p1 = new Point();
        Point p2 = new Point2D();
        Point p3 = new Point3D();

        doPrint(p2);
        doPrint(p3);

        p2.movePlusOne();   // καλείται η μέθοδος του Point2D
        p2.movePlus10();    // καλείται η μέθοδος του Point2D
        p3.movePlus10();    // καλείται η μέθοδος του Point2D

        ((Point2D) p2).setY(15);    // κάνουμε downcast την Point σε Point2D για να μπορέσουμε να
                                    // καλέσουμε τη μέθοδο

//        doMovePlus10(point);    // runtime - εδώ αποφασίζεται ποια doMovePlus10 θα κληθεί
//        doMovePlus10(point2D);  // runtime - εδώ αποφασίζεται ποια doMovePlus10 θα κληθεί
//        doMovePlus10(point3D);  // runtime - εδώ αποφασίζεται ποια doMovePlus10 θα κληθεί

    }

    public static void doMovePlus10(Point point) {
        point.movePlus10();     // late binding: Ποια movePlus10 θα καλέσει; Αποφασίζεται at runtime.
    }

    public static void doPrint(Point point) {
        System.out.println(point.toString());
    }
}
