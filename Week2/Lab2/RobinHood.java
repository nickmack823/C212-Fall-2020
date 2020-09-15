package Lab2;

import javax.swing.JComponent;
import java.awt.Graphics; 
import java.awt.Color;
import java.awt.Polygon;

public class RobinHood extends JComponent {
  int width, height; 
  public RobinHood(int width, int height) {
    this.width = width;
    this.height = height; 
  }
  public void paintComponent(Graphics g) {
    // default color is Color.BLACK 

    // Background
    g.drawOval(  0,   0, 500, 500);
    g.setColor(Color.WHITE); 
    g.fillRect(  0,   0, 500, 500);
    int left = 5;
    // Head
    g.setColor(new Color(50, 175, 31));
    g.fillOval( 80-left, 90, 365, 400);
    // Hat   
    g.setColor(new Color(101, 62, 33));   
    g.fillPolygon( new Polygon( new int[] {  10, 265, 499 }, new int[] { 274-40,  60-40, 274-40 }, 3));
    // Mouth
    g.setColor(Color.BLACK);
    g.drawArc(width/4+50, 401, 250, 150, 80, 60);
    g.drawArc(width/4+50, 400, 250, 150, 80, 60);
    g.drawArc(width/4+50, 399, 250, 150, 80, 60);
    // Nose
    // g.drawArc(width/4+50, 350, 100, 150, 38, 32);
    g.drawLine(width/2, 325, width/2-25, 375);
    g.drawLine(width/2, 324, width/2-26, 375);
    g.drawLine(width/2, 326, width/2-24, 375);
    g.drawLine(width/2-25, 375, width/2+7, 370);
    g.drawLine(width/2-26, 375, width/2+7, 369);
    g.drawLine(width/2-24, 375, width/2+7, 371);
    // Right Eyeball
    g.setColor(Color.BLACK);
    g.drawOval(width/4, 250, 100, 75);
    g.drawOval(width/4-1, 250-1, 100, 75);
    g.drawOval(width/4-2, 250, 100, 75);
    g.drawOval(width/4+1, 250+1, 100, 75);
    g.drawOval(width/4+2, 250, 100, 75);
    g.setColor(Color.WHITE);
    g.fillOval(width/4, 250, 100, 75);
    // Right Pupil
    g.setColor(Color.BLACK);
    g.fillOval(width/4+15, 260, 25, 25);
    // Left Eyeball
    g.setColor(Color.BLACK);
    g.drawOval(width/2+15, 250, 100, 75);
    g.drawOval(width/2+14, 250-1, 100, 75);
    g.drawOval(width/2+13, 250, 100, 75);
    g.drawOval(width/2+16, 250+1, 100, 75);
    g.drawOval(width/2+17, 250, 100, 75);
    g.setColor(Color.WHITE);
    g.fillOval(width/2+15, 250, 100, 75);
    // Left Pupil
    g.setColor(Color.BLACK);
    g.fillOval(width/2+30, 260, 25, 25);
    // "Feather"
    g.setColor(Color.RED);
    g.drawArc(width/2+20, 30, 200, 200, 60, 90);
    g.drawArc(width/2+20, 30, 200, 200, 60, 91);
    g.drawArc(width/2+20, 30, 200, 200, 60, 92);
    g.drawArc(width/2+20, 30, 200, 200, 60, 89);
    g.drawArc(width/2+20, 30, 200, 200, 60, 88);
  }
}
