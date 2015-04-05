/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ellipse.pack;

import java.awt.Graphics;
import java.util.List;
import shape.drawing.Shape;

/**
 *
 * @author Иван
 */
public class Ellipse implements Shape{

    @Override
     public void paint(Graphics g,List<Integer> list) {
    g.drawOval(list.get(0), list.get(1), list.get(2)-list.get(0), list.get(3)-list.get(1));
    }
    
}
