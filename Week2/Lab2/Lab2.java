package Lab2;

import java.awt.Graphics;
import javax.swing.JFrame;

public class Lab2 {
  public static void main(String[] args) {
    JFrame a = new JFrame(); 
    int width = 500, height = 500; 
    a.setVisible(true); 
    a.setSize(width+20, height+40); 
    // how can you determine 20, 40 dynamically? 
    RobinHood b = new RobinHood(width, height); 
    a.add(b);     
  }
}