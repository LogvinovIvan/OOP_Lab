package shape.data;

import java.awt.Color;
import java.awt.Graphics;
import methodDraw.DrawPhigure;
import shape.drawing.Shape;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Иван
 */
abstract public class ShapeFactory implements DrawPhigure {

    public final int basePointDx, basePointDy;
    private final Color color;

    public ShapeFactory(int basePointDx, int basePointDy, Color color) {
        this.basePointDx = basePointDx;
        this.basePointDy = basePointDy;
        this.color = color;
     }
        abstract Shape createShape();
    }


