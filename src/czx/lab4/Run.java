package czx.lab4;

public class Run {
    public static void main(String arg[]){
        Student st1=new Student("s001","孙悟空",500);
        Student.setTotal(40);
        System.out.println(st1.getSnum());
        System.out.println(st1.getSname());
        System.out.println(st1.getSage());
        System.out.println(st1.getTotal());

        Student st2=new Student("s002","唐僧",50);
        Student.setTotal(35);
        System.out.println(st2.getSnum());
        System.out.println(st2.getSname());
        System.out.println(st2.getSage());
        System.out.println(st2.getTotal());

        System.out.println(st1.getSnum());
        System.out.println(st1.getSname());
        System.out.println(st1.getSage());
        System.out.println(st1.getTotal());

        System.out.println(Student.getTotal());

        int newAge=20;
        st1.changeValue(newAge);
        System.out.println(newAge);//20

        st1.changeValue(st2);
        System.out.println(st2.getSage());

        Student st3=new Student();
        System.out.println(st3.getSnum());
        System.out.println(st3.getSname());
        System.out.println(st3.getSage());
        System.out.println(st3.getTotal());

    }
}
