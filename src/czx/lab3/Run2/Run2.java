package czx.lab3.Run2;

import java.util.Scanner;

public class Run2 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        double r=scanner.nextDouble();

        Circle cir1=new Circle();
        cir1.setR(r);
        System.out.println(cir1.getR());
        System.out.println(cir1.area());
        System.out.println(cir1.peri());

        Circle cir2=new Circle(r);
        System.out.println(cir2.getR());
        System.out.println(cir2.area());
        System.out.println(cir2.peri());
    }
}
