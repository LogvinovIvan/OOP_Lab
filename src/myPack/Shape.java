package myPack;

import java.awt.Color;
import java.awt.Graphics;
import methodDraw.DrawPhigure;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Иван
 */
abstract public class Shape implements DrawPhigure {

    public final int basePointDx, basePointDy;
    private final Color color;

    public Shape(int basePointDx, int basePointDy, Color color) {
        this.basePointDx = basePointDx;
        this.basePointDy = basePointDy;
        this.color = color;
    }

    abstract public void paint(Graphics g);

    public int getBasePointDx() {
        return basePointDx;
    }

    public int getBasePointDy() {
        return basePointDy;
    }

    public Color getColor() {
        return color;
    }

}
