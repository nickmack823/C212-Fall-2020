package Lab3Scalable;

import javax.swing.JComponent;
import java.awt.Graphics; 
import java.awt.Color;
import java.awt.Polygon;

public class RobinHoodScalable extends JComponent {
  int width, height; 
  public RobinHoodScalable(int width, int height) {
    this.width = width;
    this.height = height; 
  }
  int scale(int value) {
    return (int) (this.width / 500.0 * value); // Calls function to return width/500*value 
  }
  public void paintComponent(Graphics g) {
    // default color is Color.BLACK 

    // Background
    g.drawOval(  0,   0, scale(500), scale(500));
    g.setColor(Color.WHITE); 
    g.fillRect(  0,   0, scale(500), scale(500));
    int left = 5;
    // Head
    g.setColor(new Color(50, 175, 31));
    g.fillOval( scale(80-left), scale(90), scale(365), scale(400));
    // Hat   
    g.setColor(new Color(101, 62, 33));   
    g.fillPolygon( new Polygon( new int[] {  scale(10), scale(265), scale(499) }, new int[] { scale(274-40),  scale(60-40), scale(274-40) }, 3));
    // Mouth
    g.setColor(Color.BLACK);
    g.drawArc(500/4+50, scale(401), scale(250), scale(150), 80, 60);
    g.drawArc(500/4+50, scale(400), scale(250), scale(150), 80, 60);
    g.drawArc(500/4+50, scale(399), scale(250), scale(150), 80, 60);
    // Nose
    // g.drawArc(width/4+50, 350, 100, 150, 38, 32);
    g.drawLine(scale(500/2), scale(325), scale(500/2-25), scale(375));
    g.drawLine(scale(500/2), scale(324), scale(500/2-26), scale(375));
    g.drawLine(scale(500/2), scale(326), scale(500/2-24), scale(375));
    g.drawLine(scale(500/2-25), scale(375), scale(500/2+7), scale(370));
    g.drawLine(scale(500/2-26), scale(375), scale(500/2+7), scale(369));
    g.drawLine(scale(500/2-24), scale(375), scale(500/2+7), scale(371));
    // Right Eyeball
    g.setColor(Color.BLACK);
    g.drawOval(scale(500/4), scale(250), scale(100), scale(75));
    g.drawOval(scale(500/4-1), scale(250-1), scale(100), scale(75));
    g.drawOval(scale(500/4-2), scale(250), scale(100), scale(75));
    g.drawOval(scale(500/4+1), scale(250+1), scale(100), scale(75));
    g.drawOval(scale(500/4+2), scale(250), scale(100), scale(75));
    g.setColor(Color.WHITE);
    g.fillOval(scale(500/4), scale(250), scale(100), scale(75));
    // Right Pupil
    g.setColor(Color.BLACK);
    g.fillOval(scale(500/4+15), scale(260), scale(25), scale(25));
    // Left Eyeball
    g.setColor(Color.BLACK);
    g.drawOval(scale(500/2+15), scale(250), scale(100), scale(75));
    g.drawOval(scale(500/2+14), scale(250-1), scale(100), scale(75));
    g.drawOval(scale(500/2+13), scale(250), scale(100), scale(75));
    g.drawOval(scale(500/2+16), scale(250+1), scale(100), scale(75));
    g.drawOval(scale(500/2+17), scale(250), scale(100), scale(75));
    g.setColor(Color.WHITE);
    g.fillOval(scale(500/2+15), scale(250), scale(100), scale(75));
    // Left Pupil
    g.setColor(Color.BLACK);
    g.fillOval(scale(500/2+30), scale(260), scale(25), scale(25));
    // "Feather"
    g.setColor(Color.RED);
    g.drawArc(scale(500/2+20), 30, 200, 200, 60, 90);
    g.drawArc(scale(500/2+20), 30, 200, 200, 60, 91);
    g.drawArc(scale(500/2+20), 30, 200, 200, 60, 92);
    g.drawArc(scale(500/2+20), 30, 200, 200, 60, 89);
    g.drawArc(scale(500/2+20), 30, 200, 200, 60, 88);
  }
}
