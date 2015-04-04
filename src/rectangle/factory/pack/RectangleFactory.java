/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rectangle.factory.pack;

import method.shape.Factory;
import rectangle.pack.Rectangle;
import shape.drawing.Shape;

/**
 *
 * @author Иван
 */
public class RectangleFactory implements Factory {
   
    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}
