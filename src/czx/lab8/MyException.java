package czx.lab8;

public class MyException extends Exception {
    public MyException(String s) {
        super(s);
    }

    static int Multiply(int n, int m) throws MyException{
        int re;
        re =n*m;
        if(re>1000) throw new MyException("运算结果"+re+"超过了"+1000);
        return re;
    }

}
