package czx.lab2;

import java.math.BigInteger;

public class Run1 {

    public static void main(String[] args)
    {
        final int MAX_PER_CLASS=80;
        System.out.print(MAX_PER_CLASS);

        int a=(int)18.888;
        System.out.print(a);

        BigInteger num = new BigInteger("12345678901234567890");
        num=num.multiply(BigInteger.valueOf(123));
        System.out.print(num.toString());
    }

}
