package info.kupchenko.demo.springripper.quoters;

import javax.annotation.PostConstruct;

/**
 * @author Евгений Борисов
 */
@Profiling
@DeprecatedClass(newImpl = T1000.class)
public class TerminatorQuoter implements Quoter {

    @InjectRandomInt(min = 2, max = 7)
    private int repeat;

    private String message;

    @PostConstruct
    public void init() {
        System.out.println("PHASE 2");
        System.out.println("repeat = " + repeat);
    }

    public TerminatorQuoter() {
        System.out.println("PHASE 1");
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    @Override
    @PostProxy
    public void sayQuote() {
        System.out.println("PHASE 3");
        for (int i = 0; i < repeat; i++) {
            System.out.println("message = " + message);
        }
    }
}
