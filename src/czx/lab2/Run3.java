package czx.lab2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Run3 {
    public static void main(String[] args)
    {
        int[] nums=new int[5];
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            System.out.println("输入一个整数：");
            nums[i]=scanner.nextInt();
        }
        Arrays.sort(nums);
        for (int num:nums)
        {
            System.out.print(num+" ");
        }
        try
        {
            PrintWriter printWriter = new PrintWriter("d:\\myfile.txt");
            for (int num:nums)
                printWriter.print(num+" ");
            printWriter.flush();
        }
        catch (FileNotFoundException e)
        {
            System.out.print("文件未创建");
            //do nothing
        }

    }
}
