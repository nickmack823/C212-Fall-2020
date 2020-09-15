import javax.swing.JFrame; 
import javax.swing.JComponent; 
import java.awt.Graphics;
import java.awt.Color; 

public class Circles extends JComponent {
  public static void main(String[] args) {
    JFrame a = new JFrame(); 
    a.setVisible(true); 
    a.setSize(500, 500);
    a.add(new Circles()); 
  }
  Circle a, b, c, d, e;
  public Circles() {
    this.a = new Circle( 130, 360,  50, new Color(230, 156, 168));   
    this.b = new Circle(  30, 250,  90, new Color( 30, 246,  72));   
    this.c = new Circle( 270, 370, 120, new Color(130, 206, 120));   
    this.d = new Circle(  50,  90,  80, new Color(240, 240, 154));   
    this.e = new Circle( 320, 140, 130, new Color( 70,  89, 233));   
  }
  public void paintComponent(Graphics g) {
    a.draw(g);  
    b.draw(g);  
    c.draw(g);  
    d.draw(g);  
    e.draw(g);  
  }
}