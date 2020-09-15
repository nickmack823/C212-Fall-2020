package Lab3Scalable;

import java.awt.Graphics;
import javax.swing.JFrame;

public class Lab3Scalable {
  public static void main(String[] args) {
    JFrame a = new JFrame(); 
    int width = 750, height = 750; 
    a.setVisible(true); 
    a.setSize(width+20, height+40); 
    RobinHoodScalable b = new RobinHoodScalable(width, height); 
    a.add(b);     
  }
}