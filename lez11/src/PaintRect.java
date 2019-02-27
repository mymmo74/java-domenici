import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class PaintRect extends JFrame{

public PaintRect(){
super("uff...");
getContentPane().add(new InnerPanel());
setSize(640, 480);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

class InnerPanel extends JPanel{
public void paintComponent(Graphics g){
super.paintComponent(g);

g.setColor(Color.RED);
g.drawRect(100, 100, 40, 40);
g.setColor(Color.GREEN);
g.drawRoundRect(200, 200, 40, 40, 8, 8);
g.setColor(Color.BLUE);
g.fillRect(300, 300, 40, 40);
g.setColor(Color.YELLOW);
g.fillRoundRect(400, 400, 40, 40, 12, 12);
}
}

public static void main(String[] args){
PaintRect letspaint = new PaintRect();
}

}