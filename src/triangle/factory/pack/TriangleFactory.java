/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle.factory.pack;

import LineFactory.pack.LineFactory;
import shape.drawing.Shape;
import triangle.pack.Triangle;

/**
 *
 * @author Иван
 */
public class TriangleFactory extends LineFactory {

    @Override
    public Shape createShape() {
        return new Triangle();
    }
}
