/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package packFillRectangle;

import java.awt.Graphics;
import packRectangle.Rectangle;

/**
 *
 * @author Иван
 */
public class FillRectangle extends Rectangle{
   public int diametrX, diametrY;
    public FillRectangle(int x, int y, int width, int height, int diamX, int diamY){
    super(x,y,width,height);
    diametrX=diamX;
    diametrY=diamY;
    }
    
public void paint(Graphics g){
    g.fillRoundRect(basePointDx, basePointDy, width, height, diametrX, diametrY);
}



}
