package czx.lab7;

import java.util.Scanner;

public class Run {
    public static void main(String arg[]) throws CloneNotSupportedException {
        Scanner scanner =new Scanner(System.in);
        double l,w;
        l=scanner.nextDouble();
        w=scanner.nextDouble();
        ShapeCalc rc=new Rect(l,w);
        System.out.println(rc.peri());
        System.out.println(rc.area());

        ShapeCalc newrc = (ShapeCalc) ((Rect) rc).clone();
        System.out.println(newrc.peri());
        System.out.println(newrc.area());

        //内部类，无变量
    }
}
