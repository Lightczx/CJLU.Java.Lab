package czx.lab8;

import java.util.Scanner;

public class Run {
    public static void main(String args[]){
        double a,b;
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextDouble();
        b=scanner.nextDouble();
        try{
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
