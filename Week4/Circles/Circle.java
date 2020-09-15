package Circles;

import java.awt.Color; 
import java.awt.Graphics;

public class Circle {
  int x, y, r;
  Color c; 
  public Circle(int x, int y, int radius, Color color) {
    this.x = x; 
    this.y = y;
    this.r = radius;
    this.c = color; 
  }
  public void draw(Graphics g) {
    g.setColor(this.c);
    g.fillOval(this.x - this.r, this.y - this.r, this.r * 2, this .r * 2);
    g.setColor(Color.BLACK);
    g.drawOval(this.x - this.r, this.y - this.r, this.r * 2, this .r * 2);
  }
}