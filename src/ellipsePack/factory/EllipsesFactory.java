/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ellipsePack.factory;
import method.shape.Factory;
import shape.drawing.Ellipse;
import shape.drawing.Shape;


/**
 *
 * @author Иван
 */
public class EllipsesFactory implements Factory {

    @Override
    public Shape createShape() {
        return new Ellipse();
    }

}
