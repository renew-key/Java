import javax.swing.*;
import java.awt.*;

public class Javax extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        int width = getWidth();
        int height = getHeight();
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, width, height);
        g.setColor(Color.white);
        g.drawString("Hello World", 100, 100);
        g.drawLine(10, 10, 50, 50);
        g.setColor(Color.green);
        g.drawLine(60, 60, 100, 100);
        g.drawRect(150, 150, 50, 50);
        g.fillRect(200, 200, 50, 50);
        g.drawOval(250, 250, 200, 200);
        ImageIcon img = new ImageIcon("01.jpg");
        img.paintIcon(null, g, 0, 0);

    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(300, 300);
        window.setContentPane(new Javax());
        window.setVisible(true);
    }
}
