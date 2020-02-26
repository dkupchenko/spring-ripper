package info.kupchenko.demo.springripper;


import org.junit.jupiter.api.Test;

class SpringLoadApplicationTests {

    @Test
    void run() {
        System.out.println("TEST: SpringLoadApplication.main()");
        try {
            SpringLoadApplication.main(null);
        } catch(Exception e) {
            assert false;
        }
    }
}
