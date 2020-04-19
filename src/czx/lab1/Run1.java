package czx.lab1;

import java.util.Scanner;

public class Run1 {
    public static void main(String[] args) {
        //1
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
