package Lab3Multiple;

import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Graphics; 

public class Lab3Multiple extends JComponent {
  public static void main(String[] args) {
    JFrame frame = new JFrame(); 
    int width = 500, height = 500; 
    frame.setVisible(true); 
    frame.setSize(width+20, height+40); 
    Lab3Multiple image = new Lab3Multiple(width, height); 
    frame.add(image);     
  }
  int width, height;
  RobinHoodMultiple a, b, c;
  public Lab3Multiple(int width, int height) {
    this.width = width;
    this.height = height;
    a = new RobinHoodMultiple(250, 50, 0.3);
    b = new RobinHoodMultiple(150, 200, 0.5);
    c = new RobinHoodMultiple(50, 75, 0.2);
  }
  public void paintComponent(Graphics g) {
    a.draw(g);
    b.draw(g);
    c.draw(g);
  }
}