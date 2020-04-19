package czx.lab6;

import java.util.Scanner;

public class Rect extends Shape {
    protected double length;
    protected double width;

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void set(double length,double width){
        this.length=length;
        this.width=width;
    }

    public double area(){
        return length*width;
    }

    public double peri(){
        return 2*(length+width);
    }

    public Rect() {}
    public Rect(double length, double width) {
        this.length = length;
        this.width = width;
    }

}
