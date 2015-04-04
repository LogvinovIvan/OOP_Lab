/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ellipse.pack;

import java.awt.Graphics;
import shape.drawing.Shape;

/**
 *
 * @author Иван
 */
public class Ellipse implements Shape{

    @Override
     public void paint(Graphics g,int x1,int x2, int y1, int y2) {
    g.drawOval(x1, x2,  y1,  y2);
    }
    
}
