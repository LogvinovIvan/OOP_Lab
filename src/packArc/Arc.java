/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package packArc;

import ellipsePack.*;
import java.awt.Graphics;

/**
 *
 * @author Иван
 */
public class Arc extends Ellipses {
    int angleStart, angleOfRotation;
    public Arc(int x, int y, int width, int height,int angleStart, int angleOfRolation ){
        super(x,y,width,height);
        this.angleOfRotation=angleOfRolation;
        this.angleStart=angleStart;
    }
    
    public void paint(Graphics g){
    g.drawArc(this.basePointDx, this.basePointDy,this.width , this.height, this.angleStart, this.angleOfRotation);
    }
    
}
