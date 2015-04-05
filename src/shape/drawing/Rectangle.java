/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shape.drawing;
import java.awt.Graphics;
import java.util.List;


/**
 *
 * @author Иван
 */
public class Rectangle implements Shape{

    @Override
    public void paint(Graphics g,List<Integer> list) {
        g.drawRect( list.get(0), list.get(1), list.get(2)-list.get(0), list.get(3)-list.get(1));
    }
    
}
