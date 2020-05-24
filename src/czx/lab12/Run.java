package czx.lab12;

import javax.swing.*;
import java.awt.*;

public class Run {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var frame = new Lab12Frame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Lab12");
            frame.setSize(600, 400);
            frame.setVisible(true);

        });
    }
}

class Lab12Frame extends JFrame {

    public Lab12Frame() {

        Container container = getContentPane();
        JMenuBar menubar =new JMenuBar();

        JMenuItem menunew =new JMenuItem("New");
        menunew.setAccelerator(KeyStroke.getKeyStroke("control N"));


        JMenuItem menuopen=new JMenuItem("Open");
        menunew.setAccelerator(KeyStroke.getKeyStroke("control O"));
        menubar.add(menunew);
        pack();
    }

}





