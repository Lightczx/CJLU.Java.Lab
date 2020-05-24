package czx.lab11;

import javax.swing.*;
import java.awt.*;

public class Run1 {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var frame = new SimpleFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Run1");
            frame.setSize(600, 400);
            frame.setVisible(true);

        });
    }
}

class SimpleFrame extends JFrame {

    public SimpleFrame() {
        Container container = getContentPane();
        JPanel pan = new JPanel();
        container.add(pan);

        JButton button1 = new JButton("按钮1");
        pan.add(button1);

        JButton button2 = new JButton("红色按钮");
        button2.setBackground(Color.red);
        pan.add(button2);

        JLabel label = new JLabel("我是谁");
        pan.add(label);

        JRadioButton radio1 = new JRadioButton("单选1");// 创建单选按钮
        pan.add(radio1);// 应用单选按钮
        JRadioButton radio2 = new JRadioButton("单选2");// 创建单选按钮
        pan.add(radio2);// 应用单选按钮

        ButtonGroup group = new ButtonGroup();// 创建按钮组
        group.add(radio1);// 向按钮组增加单选按钮
        group.add(radio2);// 向按钮组增加单选按钮

        JCheckBox checkBox1 = new JCheckBox("复选1");
        pan.add(checkBox1);
        JCheckBox checkBox2 = new JCheckBox("复选2");
        pan.add(checkBox2);

        String[] strings1 = {"专科生", "本科生", "研究生", "博士生"};
        JComboBox comboBox = new JComboBox(strings1);
        pan.add(comboBox);

        String[] strings2 = {"中国", "美国", "巴基斯坦"};
        JList<String> list = new JList(strings2);
        pan.add(list);

        pan.add(new JTextField("我是计量人"));

        pan.add(new JPasswordField());

        pan.add(new JTextArea());

        pack();
    }

}