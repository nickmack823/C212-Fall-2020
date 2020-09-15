/** This is a program to bridge Lab 02 and Lab 03.
  * Author: Adrian German
  * Date: 09/05/2017 @1:23am
  * Call: java Penguin <size>
  *       where <size> is a positive integer
  *       if <size> is missing it defaults to 500 
  */

  import java.awt.Graphics;
  import javax.swing.JFrame;
  import javax.swing.JComponent;
  import java.awt.Color;
  import java.awt.Polygon;
  
  public class Penguin extends JComponent {
    public static void main(String[] args) {
      JFrame a = new JFrame(); 
      int width, height; 
      // notice that we pick up the desired size from the command line (default: 500) 
      width = height = args.length >= 1 ? Integer.parseInt( args[0] ) : 500 ; 
      a.setVisible(true); 
      a.setSize(width+20, height+40); // 20, 40 a bit arbitrary for now, and we move on 
      Penguin b = new Penguin(width, height); 
      a.add(b);     
    }
    int width, height; 
    public Penguin(int width, int height) {
      this.width = width;
      this.height = height; 
    }
    // scale is the new function, an instance method
    int scale(int value) { 
      return (int) (this.width / 500.0 * value);  
    } 
    public void paintComponent(Graphics g) {
      g.drawOval(  0,   0, scale(500), scale(500)); // scale every dimension except zero
      g.setColor(Color.WHITE); 
      g.fillRect(  0,   0, scale(500), scale(500)); 
      g.setColor(Color.BLACK); 
      g.fillPolygon( new Polygon 
                      ( new int[] {  scale(10), scale(265), scale(499) }, 
                        new int[] { scale(274),  scale(60), scale(274) }, 
                        3 // this is not a dimension, so don't scale 
                      )
                   );
      int left = 5;
      g.fillOval( scale(80-left),  scale(50), scale(365), scale(400)); 
      g.setColor(new Color(220, 220, 220)); 
      g.fillOval(scale(120-left), scale(190), scale(290), scale(250));
      g.setColor(Color.WHITE); 
      g.fillOval(scale(155-left), scale(195), scale(220), scale(240));
      g.setColor(new Color(240, 200, 40)); // 
      g.fillOval( scale(85-left), scale(390), scale(175),  scale(80));
      g.setColor(new Color(240, 200, 40)); 
      g.fillOval(scale(285-left), scale(390), scale(175),  scale(80)); 
      g.setColor(new Color(255, 255, 255)); 
      g.fillOval(scale(170-left),  scale(74),  scale(92), scale(117)); 
      g.setColor(new Color(255, 255, 255)); 
      g.fillOval(scale(264-left),  scale(94), scale(107),  scale(79)); 
      g.setColor(Color.BLACK);  
      g.fillOval(scale(230-left), scale(120),  scale(25),  scale(33)); 
      g.fillOval(scale(270-left), scale(124),  scale(17),  scale(23)); 
      g.setColor(new Color(240, 200, 40)); // 
      g.fillArc (scale(188-left), scale(173), scale(150), scale(150), 55,  65);
    }
  }