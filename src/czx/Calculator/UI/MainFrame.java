package czx.Calculator.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainFrame extends JFrame {

    private static final int BUTTON_WIDTH = 48;
    private static final int BUTTON_HEIGHT = 48;
    private static final int BIG_BUTTON = 104;

    private static final int FIRST_ROW = 72;
    private static final int SECOND_ROW = 128;
    private static final int THIRD_ROW = 184;
    private static final int FOURTH_ROW = 240;

    private static final int FIRST_COLUMN = 8;
    private static final int SECOND_COLUMN = 64;
    private static final int THIRD_COLUMN = 120;
    private static final int FOURTH_COLUMN = 176;
    private static final int FIFTH_COLUMN = 232;

    private TextArea outputTextArea;

    public MainFrame(){
        super();

        compositeOutputTextArea();
        compositeButtons();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("计算器");
        setLayout(null);
        setSize(304,480);
        setResizable(false);
        setVisible(true);
    }

    private void compositeButtons() {
        compositeButton("7",BUTTON_WIDTH,BUTTON_HEIGHT,FIRST_COLUMN, FIRST_ROW);
        compositeButton("8",BUTTON_WIDTH,BUTTON_HEIGHT,SECOND_COLUMN, FIRST_ROW);
        compositeButton("9",BUTTON_WIDTH,BUTTON_HEIGHT,THIRD_COLUMN, FIRST_ROW);
        compositeButton("/",BUTTON_WIDTH,BUTTON_HEIGHT,FOURTH_COLUMN, FIRST_ROW);
        compositeButton("%",BUTTON_WIDTH,BUTTON_HEIGHT,FIFTH_COLUMN, FIRST_ROW);

        compositeButton("4",BUTTON_WIDTH,BUTTON_HEIGHT,FIRST_COLUMN, SECOND_ROW);
        compositeButton("5",BUTTON_WIDTH,BUTTON_HEIGHT,SECOND_COLUMN, SECOND_ROW);
        compositeButton("6",BUTTON_WIDTH,BUTTON_HEIGHT,THIRD_COLUMN, SECOND_ROW);
        compositeButton("*",BUTTON_WIDTH,BUTTON_HEIGHT,FOURTH_COLUMN, SECOND_ROW);
        compositeButton("1/x",BUTTON_WIDTH,BUTTON_HEIGHT,FIFTH_COLUMN, SECOND_ROW);

        compositeButton("1",BUTTON_WIDTH,BUTTON_HEIGHT,FIRST_COLUMN, THIRD_ROW);
        compositeButton("2",BUTTON_WIDTH,BUTTON_HEIGHT,SECOND_COLUMN, THIRD_ROW);
        compositeButton("3",BUTTON_WIDTH,BUTTON_HEIGHT,THIRD_COLUMN, THIRD_ROW);
        compositeButton("-",BUTTON_WIDTH,BUTTON_HEIGHT,FOURTH_COLUMN, THIRD_ROW);

        compositeButton("0",BIG_BUTTON,BUTTON_HEIGHT,FIRST_COLUMN, FOURTH_ROW);
        compositeButton(".",BUTTON_WIDTH,BUTTON_HEIGHT,THIRD_COLUMN, FOURTH_ROW);
        compositeButton("+",BUTTON_WIDTH,BUTTON_HEIGHT,FOURTH_COLUMN, FOURTH_ROW);

        compositeButton("=",BUTTON_WIDTH,BIG_BUTTON,FIFTH_COLUMN, THIRD_ROW);
    }

    private void compositeButton(String text, int width, int height, int x, int y) {
        final Button b = new Button(text);
        b.setLocation(x, y);
        b.setSize(width, height);
        b.setFont(new Font("Consolas", Font.BOLD, 15));
        b.setBackground(Color.lightGray);
        b.setForeground(Color.black);
        b.addMouseListener(new ClickHandler(outputTextArea));
        this.add(b);
    }

    private void compositeOutputTextArea() {
        outputTextArea = new TextArea("",8,52,3);
        outputTextArea.setBackground(Color.lightGray);
        outputTextArea.setSize(272, 56);
        outputTextArea.setFont(new Font("Consolas", Font.BOLD, 16));
        outputTextArea.setLocation(8,8);
        this.add(outputTextArea);
    }
}
