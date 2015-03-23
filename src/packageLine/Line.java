/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageLine;

import shape.data.ShapeFactory;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Иван
 */
public class Line extends ShapeFactory {

    public final int x2, y2;

    public Line(int x1, int x2, int y1, int y2) {
        super(x1, y1, Color.BLACK);
        this.x2 = x2;
        this.y2 = y2;
    }

    public void paint(Graphics g) {
        g.drawLine(x2, y2, super.getBasePointDx(), super.getBasePointDy());
    }
}
