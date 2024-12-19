import javax.swing.*;
import java.awt.*;

public class LoopLab extends JPanel {
    String method;
    int num;

    public LoopLab() {
        while (true) {
            method = JOptionPane.showInputDialog("請輸入表格選項(選項包含:a(加法表),m(乘法表)): ");
            if (method != null) {
                method = method.toLowerCase();
            }
            if (!method.equals("a") && !method.equals("m")) {
                JOptionPane.showMessageDialog(null, "請重新確認輸入內容是否符合選項!!");
                continue;
            } else {
                break;
            }
        }

        num = Integer.parseInt(JOptionPane.showInputDialog("請輸入表格大小"));
    }

    @Override
    public void paintComponent(Graphics g) {

        int w = getWidth();
        int h = getHeight();
        int x = 0;
        int y = 0;

        int cellWidth = w / num;
        int cellHeight = h / num;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i == 1 || j == 1) {
                    g.setColor(Color.yellow);
                    g.fillRect(x, y, cellWidth, cellHeight);

                } else {
                    g.setColor(Color.WHITE);
                    g.fillRect(x, y, cellWidth, cellHeight);
                }
                g.setColor(Color.black);
                g.drawRect(x, y, cellWidth, cellHeight);

                if (i == 1) {
                    g.drawString("" + j, x + 5, y + 20);
                } else if (j == 1) {
                    g.drawString("" + i, x + 5, y + 20);
                } else {
                    int value;
                    if (method.equals("a")) {
                        value = i + j;
                    } else {
                        value = i * j;
                    }
                    g.drawString("" + value, x + 5, y + 20);

                }

                x += cellWidth;
                // if(method.equals("a")){
                // JOptionPane.showMessageDialog(null,i+" + "+ j+" = "+(i+j));
                // }else if(method.equals("m")){
                // JOptionPane.showMessageDialog(null,i+" + "+ j+" = "+(i+j));
                // }
            }
            x = 0;
            y += cellHeight;
        }

    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400, 400);
        window.setContentPane(new LoopLab());
        window.setVisible(true);

    }
}
