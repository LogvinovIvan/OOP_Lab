/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package triangle.pack;

import java.awt.Graphics;
import java.util.List;
import shape.drawing.Shape;

/**
 *
 * @author Иван
 */
public class Triangle implements Shape {

    @Override
    public void paint(Graphics g,List<Integer> list) {
         g.drawLine(list.get(0), list.get(1), list.get(2), list.get(3));
         g.drawLine(list.get(0), list.get(1), list.get(4), list.get(5));
         g.drawLine(list.get(2), list.get(3), list.get(4), list.get(5));
    }
    
}
