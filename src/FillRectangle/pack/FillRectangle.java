/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FillRectangle.pack;

import java.awt.Graphics;
import java.util.List;
import shape.drawing.Shape;

/**
 *
 * @author Иван
 */
public class FillRectangle implements Shape {

    @Override
    public void paint(Graphics g,List<Integer> list) {
         g.fillRoundRect(list.get(0), list.get(1), list.get(2)-list.get(0), list.get(3)-list.get(1), 10, 10);
    }
    
}
