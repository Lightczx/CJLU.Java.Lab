package czx.lab12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Run {
    public static Lab12Frame frame = new Lab12Frame();
    public static void main(String[] args) {
        frame.setSize(600, 400);
    }
}

class Lab12Frame extends JFrame implements ActionListener {

    JPanel pan =new JPanel();

    public Lab12Frame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Lab12");

        getContentPane().add(pan);

        JMenuBar menubar =new JMenuBar();
        pan.add(menubar);

        JMenu menufile=new JMenu("File");
        menubar.add(menufile);

        JMenuItem newItem =new JMenuItem("New");
        newItem.setAccelerator(KeyStroke.getKeyStroke("control N"));
        newItem.addActionListener(this);
        menufile.add(newItem);

        JMenuItem openItem=new JMenuItem("Open");
        openItem.setAccelerator(KeyStroke.getKeyStroke("control O"));
        openItem.addActionListener(this);
        menufile.add(openItem);

        JPopupMenu popupMenu =new JPopupMenu();
        popupMenu.add(newItem);
        popupMenu.add(openItem);
        pan.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.isMetaDown()) {
                    if (e.isPopupTrigger()) {// 如果当前事件与鼠标事件相关，则弹出菜单
                        popupMenu.show(e.getComponent(), e.getX(), e.getY());
                    }
                }
            }
        });
        JToolBar jToolBar = new JToolBar();
        JButton newButton = new JButton("new"),openButton = new JButton("open");
        newButton.addActionListener(actionEvent -> {
            JLabel label = new JLabel("您点击了New菜单");
            pan.add(label,BorderLayout.CENTER);
            pan.validate();//refresh UI
        });

        openButton.addActionListener(actionEvent ->
                JOptionPane.showMessageDialog(null, "您点击了Open菜单", "提示",JOptionPane.INFORMATION_MESSAGE));
        jToolBar.add(newButton);
        jToolBar.add(openButton);
        pan.add(jToolBar);

        String[] dataTitle = {"编号","内容"};
        String[][] data ={{"15h001","张三"},{"15h002","李四"}};
        JTable jTable=new JTable(data,dataTitle);
        JScrollPane jScrollPane = new JScrollPane(jTable);
        pan.add(jScrollPane);

        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JMenuItem menuItem = (JMenuItem) e.getSource();//获取所点击的菜单项
        switch (menuItem.getText()){
            case "New" :
                JLabel label = new JLabel("您点击了New菜单");
                pan.add(label,BorderLayout.CENTER);
                pan.validate();//refresh UI
                break;
            case "Open" :
                JOptionPane.showMessageDialog(null, "您点击了Open菜单", "提示",JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }
}







