package com.sias.Guo;

/**
 * @Author:XQ
 * @Date:
 */
public class Point {
    private double x;
    private double y;
    private double z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setCoordinates(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distanceSquaredTo(Point otherPoint) {
        double dx = this.x - otherPoint.x;
        double dy = this.y - otherPoint.y;
        double dz = this.z - otherPoint.z;
        return dx*dx + dy*dy + dz*dz;
    }

    public static void main(String[] args) {
        Point point1 = new Point(1, 2, 3);
        Point point2 = new Point(4, 5, 6);

        double distanceSquared = point1.distanceSquaredTo(point2);
        System.out.println("Distance squared between point1 and point2: " + distanceSquared);
    }
}
