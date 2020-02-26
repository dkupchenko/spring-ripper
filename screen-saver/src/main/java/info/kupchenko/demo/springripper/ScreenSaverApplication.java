package info.kupchenko.demo.springripper;

import info.kupchenko.demo.springripper.screensaver.ColorFrame;
import info.kupchenko.demo.springripper.screensaver.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Евгений Борисов
 */
public class ScreenSaverApplication {

    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        while(!Thread.interrupted()) {
            context.getBean(ColorFrame.class).showOnRandomPlace();
            Thread.sleep(250);
        }
    }
}
