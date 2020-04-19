package czx.lab2;

public class Run2 {
    public static void main(String[] args)
    {
        //1
        String strIm=" I am a student. I like Java Language! ";
        int strlen=strIm.length();
        //2
        System.out.println(strlen);
        //3
        System.out.println(strIm.substring(0,1));
        //4
        System.out.println(strIm.substring(strlen-1,strlen));
        //5
        System.out.println(strIm.indexOf("stuent"));
        //6
        strIm=strIm.trim();
        //7
        System.out.println(strIm.substring(2,5));
        //8
        String[] strs=strIm.split(" ");
        for(String str:strs)
            System.out.println(str);
        //9
        StringBuilder stringBuilder=new StringBuilder();
        for(String str:strs)
            stringBuilder.append(str);
        System.out.println(stringBuilder.toString());
        //10
        System.out.println(strIm.toUpperCase());
    }
}
