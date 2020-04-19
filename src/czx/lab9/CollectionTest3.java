package czx.lab9;

import java.util.HashMap;
import java.util.Map;

public class CollectionTest3 {
    public CollectionTest3() {
        Map<String,Student> students=new HashMap<>();
        students.put("15H002",new Student("15H002","孙悟空",2000));
        students.put("15H001",new Student("15H001","唐僧",40));
        students.put("15H003",new Student("15H002","猪八戒",1000));
        if(students.containsKey("15H003")){
            System.out.println(students.get("15H003"));
        }
        else{
            System.out.println("不存在");
        }

        if(students.containsKey("15H004")){
            System.out.println(students.get("15H004"));
        }
        else{
            System.out.println("不存在");
        }

        for(Map.Entry<String, Student> entry : students.entrySet()){
            String key = entry.getKey();
            Student value = entry.getValue();
            System.out.println(value.snum);
            System.out.println(value.sname);
            System.out.println(value.sage);
        }

        students.remove("15H001");

        Object[] values = students.values().toArray();
        for(Object student:values){
            System.out.println(((Student)student).snum);
            System.out.println(((Student)student).sname);
            System.out.println(((Student)student).sage);
        }
    }
    class Student{
        public String snum;
        public String sname;
        public int sage;
        public Student(){
        }
        public Student(String snum, String sname, int sage) {
            this.snum = snum;
            this.sname = sname;
            this.sage = sage;
        }
    }
}
