/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package line.pack;

import java.awt.Canvas;
import java.awt.Graphics;
import shape.drawing.Shape;

/**
 *
 * @author Иван
 */
public class Line extends Canvas implements Shape{

    @Override
    public void paint(Graphics g,int x1,int x2, int y1, int y2) {
         g.drawLine(x2, y2, x1,y2);
        
    }
    
}
