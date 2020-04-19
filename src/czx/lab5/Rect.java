package czx.lab5;

import java.util.Scanner;

public class Rect {
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

    public static void main(String args[]){
        Scanner scanner =new Scanner(System.in);
        double length,width,height;
        length=scanner.nextDouble();
        width=scanner.nextDouble();
        height=scanner.nextDouble();

        Cube cub1=new Cube();
        cub1.set(length,width,height);
        System.out.println(cub1.area());
        System.out.println(cub1.vol());

        Cube cub2=new Cube(length,width,height);
        System.out.println(cub2.area());
        System.out.println(cub2.vol());
        System.out.println(cub2.peri());//wrong

        Rect rc1=new Rect(length,width);
        System.out.println(rc1.area());
        System.out.println(rc1.peri());


    }
}

