/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FillRectangle.factoty.pack;


import FillRectangle.pack.FillRectangle;
import rectangle.factory.pack.RectangleFactory;
import shape.drawing.Shape;

/**
 *
 * @author Иван
 */
public class FillRectangleFactory extends RectangleFactory {

    @Override
    public Shape createShape() {
        return new FillRectangle();
    }

}
