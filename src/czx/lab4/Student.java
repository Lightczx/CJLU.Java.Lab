package czx.lab4;

public class Student {

    private String snum;
    private String sname;
    private int sage;

    public String getSnum() {
        return snum;
    }
    public void setSnum(String snum) {
        this.snum = snum;
    }

    public String getSname() {
        return sname;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSage() {
        return sage;
    }
    public void setSage(int sage) {
        this.sage = sage;
    }

    private static int total;
    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Student.total = total;
    }



    public Student(){
        {
            this.snum="s000";
            this.sname="我是谁";
            this.sage=22;
            this.total=40;
        }
    }
    public Student(String snum,String sname,int sage){
        this.snum=snum;
        this.sname=sname;
        this.sage=sage;
    }

    public void changeValue(int age){age=111;}
    public void changeValue(Student s){s.sage=222;}


}

