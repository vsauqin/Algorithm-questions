package com.sias.Guo;

/**
 * @Author:XQ
 * @Date:
 */
public class Fun {
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fun() {
        speed = 0;
        on = false;
        radius = 0.0;
        color = "white";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Speed: " + speed + ", On: " + on + ", Radius: " + radius + ", Color: " + color;
    }
}
class FunTest {
    public static void main(String[] args) {
        Fun fun1 = new Fun();
        Fun fun2 = new Fun();

        fun1.setSpeed(3);
        fun1.setOn(true);
        fun1.setRadius(10.0);
        fun1.setColor("yellow");

        fun2.setSpeed(2);
        fun2.setOn(false);
        fun2.setRadius(5.0);
        fun2.setColor("blue");

        System.out.println("Fun1: " + fun1.toString());
        System.out.println("Fun2: " + fun2.toString());
    }
}
