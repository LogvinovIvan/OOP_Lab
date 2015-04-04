/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Иван
 */

import FillRectangle.factoty.pack.FillRectangleFactory;
import LineFactory.pack.LineFactory;
import ellipsePack.factory.EllipsesFactory;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import method.shape.Factory;
import packArc.factory.ArcFactory;
import rectangle.factory.pack.RectangleFactory;
import shape.drawing.Shape;
import triangle.factory.pack.TriangleFactory;


/*
  
 */
public class JavaApplication1 extends JPanel {

    /**
     * @param args the command line arguments
     */
    public JavaApplication1() {
        JFrame jframe = new JFrame("Graphics");
        jframe.setLocation(600, 150);
        jframe.setMinimumSize(new Dimension(850, 650));
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jframe.getContentPane().add(this);
        jframe.setVisible(true);
    }

    

    public static void main(String[] args) {
        // TODO code application logic here

        
        
        NewJFrame form = new NewJFrame();
        form.setVisible(true);
    }

}
