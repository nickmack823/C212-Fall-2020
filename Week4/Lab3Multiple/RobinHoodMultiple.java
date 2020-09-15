package Lab3Multiple;

import java.awt.Graphics; 
import java.awt.Color;
import java.awt.Polygon;

public class RobinHoodMultiple {
    int x, y; 
    double scale; 
    public RobinHoodMultiple(int x, int y, double scale) {
      this.x = x; 
      this.y = y; 
      this.scale = scale; 
    }
    private int scale(int size) {
      return (int)(this.scale * size); 
  }
  public void draw(Graphics g) {
    // default color is Color.BLACK 

    // Background
    g.drawOval(x + 0,y + 0, scale(500), scale(500));
    g.setColor(Color.WHITE); 
    // g.fillRect(y + 0, x + 0, scale(500), scale(500));
    int left = 5;
    // Head
    g.setColor(new Color(50, 175, 31));
    g.fillOval(x + scale(80-left), y + scale(90), scale(365), scale(400));
    // Hat   
    g.setColor(new Color(101, 62, 33));   
    g.fillPolygon( new Polygon( new int[] {x + scale(10), x +  scale(265), x +  scale(499) }, new int[] {y + scale(274-40), y +  scale(60-40), y + scale(274-40) }, 3));
    // Mouth
    g.setColor(Color.BLACK);
    g.drawArc(x + 30 + (500/4+25)*(scale(1)), y + scale(401), scale(250), scale(150), 80, 60);
    g.drawArc(x + 30 + (500/4+25)*(scale(1)), y + scale(400), scale(250), scale(150), 80, 60);
    g.drawArc(x + 30 + (500/4+25)*(scale(1)), y + scale(399), scale(250), scale(150), 80, 60);
    // Nose
    // g.drawArc(width/4+50, 350, 100, 150, 38, 32);
    g.drawLine(x + scale(500/2), y + scale(325), x + scale(500/2-25), y + scale(375));
    g.drawLine(x + scale(500/2), y + scale(324), x + scale(500/2-26), y + scale(375));
    g.drawLine(x + scale(500/2), y + scale(326), x + scale(500/2-24), y + scale(375));
    g.drawLine(x + scale(500/2-25), y + scale(375), x + scale(500/2+7), y + scale(370));
    g.drawLine(x + scale(500/2-26), y + scale(375), x + scale(500/2+7), y + scale(369));
    g.drawLine(x + scale(500/2-24), y + scale(375), x + scale(500/2+7), y + scale(371));
    // Right Eyeball
    g.setColor(Color.BLACK);
    g.drawOval(x + scale(500/4), y + scale(250), scale(100), scale(75));
    g.drawOval(x + scale(500/4-1), y + scale(250-1), scale(100), scale(75));
    g.drawOval(x + scale(500/4-2), y + scale(250), scale(100), scale(75));
    g.drawOval(x + scale(500/4+1), y + scale(250+1), scale(100), scale(75));
    g.drawOval(x + scale(500/4+2), y + scale(250), scale(100), scale(75));
    g.setColor(Color.WHITE);
    g.fillOval(x + scale(500/4), y + scale(250), scale(100), scale(75));
    // Right Pupil
    g.setColor(Color.BLACK);
    g.fillOval(x + scale(500/4+15), y + scale(260), scale(25), scale(25));
    // Left Eyeball
    g.setColor(Color.BLACK);
    g.drawOval(x + scale(500/2+15), y + scale(250), scale(100), scale(75));
    g.drawOval(x + scale(500/2+14), y + scale(250-1), scale(100), scale(75));
    g.drawOval(x + scale(500/2+13), y + scale(250), scale(100), scale(75));
    g.drawOval(x + scale(500/2+16), y + scale(250+1), scale(100), scale(75));
    g.drawOval(x + scale(500/2+17), y + scale(250), scale(100), scale(75));
    g.setColor(Color.WHITE);
    g.fillOval(x + scale(500/2+15), y + scale(250), scale(100), scale(75));
    // Left Pupil
    g.setColor(Color.BLACK);
    g.fillOval(x + scale(500/2+30), y + scale(260), scale(25), scale(25));
    // "Feather"
    // g.setColor(Color.RED);
    // g.drawArc(x + scale(500/2+20), y + 30, 200, 200, 60, 90);
    // g.drawArc(x + scale(500/2+20), y + 30, 200, 200, 60, 91);
    // g.drawArc(x + scale(500/2+20), y + 30, 200, 200, 60, 92);
    // g.drawArc(x + scale(500/2+20), y + 30, 200, 200, 60, 89);
    // g.drawArc(x + scale(500/2+20), y + 30, 200, 200, 60, 88);
  }
}
