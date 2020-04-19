package czx.lab10;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.io.IOException;
import java.net.URL;
import java.text.AttributedCharacterIterator;
import java.util.Map;

public class Run {
    public static void main(String[] args){
        EventQueue.invokeLater(() -> {
            var frame = new SimpleFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("我的第一个窗口");
            frame.setSize(600, 400);
            frame.setVisible(true);

            frame.setIcon();

        });
    }
}

class SimpleFrame extends JFrame {

    String path="icon.png";
    public SimpleFrame()
    {
        add(new DrawComponent());
        pack();
    }

    public void setIcon(){
        try{
            Image img= ImageIO.read(this.getClass().getResource(path));
            this.setIconImage(img);
        }catch (IOException e){
            //do nothing
        }

    }
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2 = (Graphics2D) g;
    }
}

class DrawComponent extends JComponent
{
    private static final int DEFAULT_WIDTH = 600;
    private static final int DEFAULT_HEIGHT = 400;

    @Override
    public void paintComponent(Graphics g)
    {
        //word
        g.setColor(new Color(255,0,0));
        g.setFont(new Font("Arial",Font.ITALIC+Font.BOLD,16));
        g.drawString("This is my first graphics",32,32);
        var g2 = (Graphics2D) g;

        //ellipse
        g.setColor(new Color(0,0,0));
        var rect = new Rectangle2D.Double(100, 100, 200, 100);
        var ellipse = new Ellipse2D.Double();
        ellipse.setFrame(rect);
        g2.draw(ellipse);
        //rect
        var rect2=new Rectangle2D.Double(120, 140, 40, 20);
        g.setColor(new Color(0,0,255));
        g2.fill(rect2);
        g.setColor(new Color(0,0,0));
        g2.draw(rect2);

        //circle
        double centerX = rect.getCenterX();
        double centerY = rect.getCenterY();
        double radius = 150;

        var circle = new Ellipse2D.Double();
        g.setColor(new Color(0,255,0));
        g2.setStroke(new BasicStroke(3.0f));
        circle.setFrameFromCenter(260, 150, 280, 170);
        g2.draw(circle);

        //arrow
        g.setColor(new Color(255,0,0));
        g2.draw(new Line2D.Double(160,150,240,150));
        g2.draw(new Line2D.Double(210,140,240,150));
        g2.draw(new Line2D.Double(210,160,240,150));

    }

    @Override
    public Dimension getPreferredSize()
    {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}
