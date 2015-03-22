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
import ellipsePack.Ellipses;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import myPack.Shape;
import packArc.Arc;
import packFillRectangle.FillRectangle;
import packRectangle.Rectangle;
import packTriangle.Triangle;
import packageLine.Line;

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

    protected void paintComponent(Graphics g) {

        List<Shape> m1 = new LinkedList<>();
        m1.add(new Line(20, 10, 50, 10));
        m1.add(new Ellipses(20, 100, 50, 150));
        m1.add(new Rectangle(20, 100, 50, 100));
        m1.add(new FillRectangle(20, 200, 40, 250, 20, 20));
        m1.add(new Triangle(20, 100, 50, 100, 5, 5));
        m1.add(new Arc(40, 100, 60, 100, 50, 200));

        m1.stream().forEach((x) -> {
            x.paint(g);
        });
    }

    public static void main(String[] args) {
        // TODO code application logic here

        new JavaApplication1();

    }

}
