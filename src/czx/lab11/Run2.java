package czx.lab11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Run2 {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var frame = new Run2Frame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Run2");
            frame.setSize(600, 400);
            frame.setVisible(true);

        });
    }
}

class Run2Frame extends JFrame {

    private class CalculHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Double a=Double.parseDouble(inputtextField1.getText());
            Double b=Double.parseDouble(inputtextField2.getText());
            if(intcheckBox.isSelected()){
                switch (calculmethodBox.getSelectedIndex()){
                    case 0:// +
                        outputtextField.setText(String.valueOf((int)(a+b)));
                        break;
                    case 1:// -
                        outputtextField.setText(String.valueOf((int)(a-b)));
                        break;
                    case 2:// *
                        outputtextField.setText(String.valueOf((int)(a*b)));
                        break;
                    case 3:// /
                        outputtextField.setText(String.valueOf((int)(a/b)));
                        break;
                }
            }
            else{
                switch (calculmethodBox.getSelectedIndex()){
                    case 0:// +
                        outputtextField.setText(String.valueOf(a+b));
                        break;
                    case 1:// -
                        outputtextField.setText(String.valueOf(a-b));
                        break;
                    case 2:// *
                        outputtextField.setText(String.valueOf(a*b));
                        break;
                    case 3:// /
                        outputtextField.setText(String.valueOf(a/b));
                        break;
                }
            }

        }
    }

    private class ClearHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            outputtextField.setText("");
        }
    }

    JPanel pan = new JPanel();
    JTextField inputtextField1=new JTextField();

    String[] strings1 = {"+", "-", "*", "/"};
    JComboBox calculmethodBox = new JComboBox(strings1);

    JTextField inputtextField2=new JTextField();
    JTextField outputtextField=new JTextField();

    JCheckBox intcheckBox = new JCheckBox("结果取整");

    public Run2Frame() {

        Container container = getContentPane();
        container.add(pan);

        inputtextField1.setPreferredSize(new Dimension(80,32));
        pan.add(inputtextField1);

        calculmethodBox.setPreferredSize(new Dimension(80,32));
        pan.add(calculmethodBox);

        inputtextField2.setPreferredSize(new Dimension(80,32));
        pan.add(inputtextField2);

        JLabel label = new JLabel("=");
        label.setPreferredSize(new Dimension(80,16));
        pan.add(label);
        outputtextField.setPreferredSize(new Dimension(80,32));
        pan.add(outputtextField);

        JButton calculButton = new JButton("计算");
        calculButton.addActionListener(new CalculHandler());
        pan.add(calculButton);

        JButton clearButton = new JButton("清空结果");
        clearButton.addActionListener(new ClearHandler());
        pan.add(clearButton);

        pan.add(intcheckBox);

        pack();
    }

}



