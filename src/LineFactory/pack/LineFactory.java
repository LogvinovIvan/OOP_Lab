/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LineFactory.pack;
import line.pack.Line;
import method.shape.Factory;
import shape.drawing.Shape;

/**
 *
 * @author Иван
 */
public class LineFactory implements Factory {

    @Override
    public Shape createShape() {
        return new Line();
    }
}
