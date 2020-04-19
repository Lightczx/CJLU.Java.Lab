package czx.lab3.Run3;

import java.util.Scanner;

public class TestCourse {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.print("课程编号：");
        String id=scanner.nextLine();
        System.out.print("课程名称：");
        String name=scanner.nextLine();
        System.out.print("学分：");
        double score=scanner.nextDouble();
        Course course=new Course(id,name,score);
        System.out.println(course.getId());
        System.out.println(course.getName());
        System.out.println( course.getScore());
        System.out.println( course.getScore()*16);
    }
}
