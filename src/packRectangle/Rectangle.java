/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package packRectangle;

import java.awt.Graphics;
import methodDraw.DrawPhigure;
import myPack.Shape;

/**
 *
 * @author Иван
 */
public class Rectangle extends Shape {
    public int width, height;
    public Rectangle(int x, int y, int width, int height){
        basePointDx=x;
        basePointDy=y;
        this.width=width;
        this.height=height;
    }
    public void paint(Graphics g){
        g.drawRect( basePointDy, basePointDx, width, height);
    }
}
