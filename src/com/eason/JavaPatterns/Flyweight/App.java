package com.eason.JavaPatterns.Flyweight;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by easonjackson on 6/15/17.
 */
public class App extends JFrame {

    // GUI frame size setup
    private final int WIDTH;
    private final int HEIGHT;

    //Shape and color beans
    private static final ShapeFactory.ShapeType shapes[] = { ShapeFactory.ShapeType.LINE,
                                                             ShapeFactory.ShapeType.OVAL_FILL,
                                                             ShapeFactory.ShapeType.OVAL_NOFILL };
    private static final Color colors[] = { Color.RED,
                                            Color.GREEN,
                                            Color.YELLOW };

    // App constructor
    public App(int width, int height) {
        this.WIDTH=width;
        this.HEIGHT=height;
        Container contentPane = getContentPane();

        JButton startButton = new JButton("Draw");
        final JPanel panel = new JPanel();

        contentPane.add(panel, BorderLayout.CENTER);
        contentPane.add(startButton, BorderLayout.SOUTH);
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                Graphics g = panel.getGraphics();
                for (int i = 0; i < 2; ++i) {
                    Shape shape = ShapeFactory.getShape(getRandomShape());
                    shape.draw(g,
                                getRandomX(),
                                getRandomY(),
                                getRandomWidth(),
                                getRandomHeight(),
                                getRandomColor());
                }
            }
        });
    }

    private ShapeFactory.ShapeType getRandomShape() {
        return shapes[(int) (Math.random() * shapes.length)];
    }

    private int getRandomX() {
        return (int) (Math.random() * WIDTH);
    }

    private int getRandomY() {
        return (int) (Math.random() * HEIGHT);
    }

    private int getRandomWidth() {
        return (int) (Math.random() * (WIDTH / 10));
    }

    private int getRandomHeight() {
        return (int) (Math.random() * (HEIGHT / 10));
    }

    private Color getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    public static void main(String[] args) {
        App drawing = new App(500,600);
    }
}
