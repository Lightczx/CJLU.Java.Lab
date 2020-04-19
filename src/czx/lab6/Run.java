package czx.lab6;

import java.util.Scanner;

public class Run {
    public static void main(String args[]){
        //Shape shp =new Shape();//wrong
        Shape shp=null;
        Scanner scanner =new Scanner(System.in);
        while (true){
            double l,w,h;
            switch (scanner.nextInt()){
                case 1://rect
                    System.out.println("请输入长：");
                    l=scanner.nextDouble();
                    System.out.println("请输入宽：");
                    w=scanner.nextDouble();
                    shp=new Rect(l,w);
                    break;
                case 2://cube
                    System.out.println("请输入长：");
                    l=scanner.nextDouble();
                    System.out.println("请输入宽：");
                    w=scanner.nextDouble();
                    System.out.println("请输入高：");
                    h=scanner.nextDouble();
                    shp=new Cube(l,w,h);
                    break;
                default:
                    return;
            }
            System.out.println(shp.peri());
            System.out.println(shp.area());
        }
    }
}
