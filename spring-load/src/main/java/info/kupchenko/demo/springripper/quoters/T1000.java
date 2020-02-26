package info.kupchenko.demo.springripper.quoters;

import javax.annotation.PostConstruct;

/**
 * @author Евгений Борисов
 */
@Profiling
public class T1000 implements Quoter{

    @InjectRandomInt(min = 1, max = 5)
    private int repeat;

    private String message;

    @PostConstruct
    public void init() {
        System.out.println("PHASE 2");
        System.out.println("repeat = " + repeat);
    }

    public T1000() {
        System.out.println("PHASE 1");
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    @PostProxy
    public void sayQuote() {
        System.out.println("PHASE 3");
        for (int i = 0; i < repeat; i++) {
            System.out.println("message = Never say '" + message + "' (T1000)");
        }
    }
}
