/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ellipsePack;
import shape.data.ShapeFactory;
import java.awt.Graphics;
/**
 *
 * @author Иван
 */
public class Ellipses extends ShapeFactory implements DrawPhigure {
   public int width ,height;
   public Ellipses(int x, int width,int y, int height)
    {
        basePointDx=x;
        basePointDy=y;
        this.width=width;
        this.height=height;
    }
    
   
    public void paint(Graphics g) {
    g.drawOval(basePointDx, basePointDy, width, height);
    }

}
