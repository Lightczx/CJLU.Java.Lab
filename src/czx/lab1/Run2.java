package czx.lab1;

import java.util.Scanner;

public class Run2 {
    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        System.out.print("请输入a:");
        double a = scanner.nextDouble();
        System.out.print("请输入b:");
        double b = scanner.nextDouble();
        System.out.print("请输入c:");
        double c = scanner.nextDouble();

        double flag= (b * b) - (4 * a * c);
        if(0<flag)//have roots
        {
            double root1= (-b + Math.sqrt(flag)) / (2 * a);
            double root2= (-b - Math.sqrt(flag)) / (2 * a);
            System.out.printf("有两个实根：x1=%lf,x2=%lf",root1,root2);
        }
        else if(0==flag)//same roots
        {
            double root= (-b + Math.sqrt(flag)) / (2 * a);
            System.out.printf("有两个相同的实根：x=%f",root);
        }
        else //no root
        {
            System.out.print("无实根");
        }

    }
}
