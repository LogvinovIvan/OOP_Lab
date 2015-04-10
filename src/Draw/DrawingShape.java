/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Draw;

import java.awt.Graphics;
import shape.drawing.Arc;
import shape.drawing.Ellipse;
import shape.drawing.FillRectangle;
import shape.drawing.Line;
import shape.drawing.Rectangle;
import shape.drawing.Triangle;

/**
 *
 * @author Иван
 */
public class DrawingShape {
  
   
   
   public void paint(Graphics g, Triangle triangle) {
       
         g.drawLine(triangle.x1, triangle.y1, triangle.x2, triangle.y2);
         g.drawLine(triangle.x1, triangle.y1, triangle.x3, triangle.y3);
         g.drawLine(triangle.x2, triangle.y2, triangle.x3, triangle.y3);
        
    }
   
   public void paint(Graphics g, Rectangle rect) {
        g.drawRect( rect.x1, rect.y1, rect.x2, rect.y2);
    }
   
   
   public void paint(Graphics g, Line line) {
     
        g.drawLine(line.x1, line.y1, line.x2, line.y1);
    }

public void paint(Graphics g, FillRectangle fillRectangle) {
        g.fillRoundRect(fillRectangle.x1, fillRectangle.y1, fillRectangle.x2, fillRectangle.y2, 10, 10);
    }



public void paint(Graphics g, Ellipse ellipse) {
        g.drawOval(ellipse.x1, ellipse.y1, ellipse.x2, ellipse.y2);
    }

public void paint(Graphics g, Arc arc) {
        g.drawArc(arc.x1, arc.y1, arc.x2, arc.y2,arc.x3,arc.y3);
    }
}
