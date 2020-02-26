package info.kupchenko.demo.springripper.screensaver;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * @author Евгений Борисов
 */
public abstract class ColorFrame extends JFrame {

    public ColorFrame() throws HeadlessException {
        setSize(200,200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void showOnRandomPlace() {
        Random random = new Random();
        setLocation(random.nextInt(800), random.nextInt(600));
        getContentPane().setBackground(getColor());
        repaint();
    }

    protected abstract Color getColor();
}
