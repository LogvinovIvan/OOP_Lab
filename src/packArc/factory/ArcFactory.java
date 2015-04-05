/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package packArc.factory;



import shape.drawing.Arc;
import method.shape.Factory;
import shape.drawing.Shape;



/**
 *
 * @author Иван
 */
public class ArcFactory implements Factory {

    @Override
    public Shape createShape() {
        return new Arc();
    }

}
   
    

