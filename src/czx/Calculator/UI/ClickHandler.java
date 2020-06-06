package czx.Calculator.UI;

import czx.Calculator.Helper.CalculationHelper;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ClickHandler extends MouseAdapter {
    @Override
    public void mousePressed(MouseEvent e) { CalculationHelper.counts((Button) e.getSource(),text);}

    public ClickHandler(TextArea outputTextArea){
        text=outputTextArea;
    }

    private final TextArea text;

    static double m,n;
    static String operator;
    static boolean flag =true;
    static boolean flag2 =false;

    private boolean isOperatorButton(Button b)
    {
        return b.getActionCommand().equals("+")||
                b.getActionCommand().equals("-")||
                b.getActionCommand().equals("*")||
                b.getActionCommand().equals("/")||
                b.getActionCommand().equals("%")||
                b.getActionCommand().equals("1/x");
    }

    private boolean isOperatorEqualButton(Button b)
    {
        return isOperatorButton(b)|| b.getActionCommand().equals("=");
    }
    private boolean isEmptyDirectlyClickOperatorButton(Button b)
    {
        return text.getText().equals("")&& isOperatorEqualButton(b);
    }
    private boolean isDotDirectlyClickOperatorButton(Button b)
    {
        return text.getText().equals(".")&& isOperatorEqualButton(b);
    }

    private void counts(Button b)
    {
        if(isEmptyDirectlyClickOperatorButton(b))//空的直接按运算符号
        {
            System.out.println("空的直接按运算符号");
        }
        else if(isDotDirectlyClickOperatorButton(b))//小数点后按运算符号
        {
            System.out.println("小数点后按运算符号");
        }
        else//已经有数了
        {
            if(isOperatorButton(b))//按运算符号
            {
                if(flag2 = true)
                    flag2 = false;
                if(flag)
                {
                    n = Double.parseDouble(text.getText());
                    flag = false;
                }
                else
                {
                    if(operator.equals("="))
                    {
                    }
                    else
                    {
                        System.out.println("按运算符号");
                        m = Double.parseDouble(text.getText());
                        switch (operator) {
                            case "-":
                                n = n == 0 ? m : n - m;
                                break;
                            case "+":
                                n = n == 0 ? m : n + m;
                                break;
                            case "*":
                                n = n == 0 ? m : n * m;
                                break;
                            case "%":
                                if (n == 0)
                                    n = m;
                                else
                                    m = m * 100;
                                break;
                            case "1/x":
                                n = n == 0 ? m : 1 / m;
                                break;
                            case "/":
                                n = n == 0 ? m : n / m;
                                break;
                        }
                    }
                }
                operator = b.getActionCommand();
                text.setText("");
            }
            else if(b.getActionCommand().equals("="))//按等号
            {
                System.out.println("=clicked");
                m = Double.parseDouble(text.getText());
                switch (operator) {
                    case "+" -> {
                        text.setText("");
                        text.append(n + "+" + m);
                        text.append(System.getProperty("line.separator"));
                        n = n + m;
                        text.append("=" + n);
                    }
                    case "-" -> {
                        text.setText("");
                        text.append(n + "-" + m);
                        text.append(System.getProperty("line.separator"));
                        n = n - m;
                        text.append("=" + n);
                    }
                    case "*" -> {
                        text.setText("");
                        text.append(n + "*" + m);
                        text.append(System.getProperty("line.separator"));
                        n = n * m;
                        text.append("=" + n);
                    }
                    case "%" -> {
                        text.setText("");
                        text.append("%" + m);
                        text.append(System.getProperty("line.separator"));
                        m = m * 100;
                        text.append("=" + m + "%");
                    }
                    case "1/x" -> {
                        text.setText("");
                        text.append(1 + "/" + m);
                        text.append(System.getProperty("line.separator"));
                        n = 1 / m;
                        text.append("=" + n);
                    }
                    case "/" -> {
                        text.setText("");
                        text.append(n + "/" + m);
                        text.append(System.getProperty("line.separator"));
                        n = n / m;
                        text.append("=" + n);
                    }
                }
                operator ="=";
                flag2 = true;
            }
            else
            {
                if(flag2)
                {
                    flag = true;
                    flag2 = false;
                    text.setText("");
                    m = n =0;
                }
                text.append(b.getActionCommand());
            }
        }
    }
}
