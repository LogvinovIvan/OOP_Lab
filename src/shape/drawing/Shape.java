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
public interface Shape {

    public void paint(Graphics g,List<Integer> list);
}
