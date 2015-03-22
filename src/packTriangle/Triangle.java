/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packTriangle;

import java.awt.Graphics;
import packageLine.*;

/**
 *
 * @author Иван
 */
public class Triangle extends Line {

    int x3, y3;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        super(x1, x2, y1, y2);
        this.x3 = x3;
        this.y3 = y3;
    }

    public void paint(Graphics g) {
        g.drawLine(x2, y2, basePointDx, basePointDy);
        g.drawLine(x3, y3, basePointDx, basePointDy);
        g.drawLine(x2, y2, x3, y3);
    }
}
