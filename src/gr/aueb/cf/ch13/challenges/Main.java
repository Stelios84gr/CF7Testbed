package gr.aueb.cf.ch13.challenges;

public class Main {

    public static void main(String[] args) {

        PointXYZ myPointXYZ = new PointXYZ(1.0, 2.0, 3.0);

        System.out.println(myPointXYZ.getXYDistance());
        System.out.println(myPointXYZ.getYZDistance());
        System.out.println(myPointXYZ.getXZDistance());
        System.out.println(myPointXYZ.getXYZDistance());
    }
}
