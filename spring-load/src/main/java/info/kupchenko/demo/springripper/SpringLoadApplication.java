package info.kupchenko.demo.springripper;

import info.kupchenko.demo.springripper.quoters.PropertyFileApplicationContext;
import info.kupchenko.demo.springripper.quoters.Quoter;

/**
 * @author Евгений Борисов
 */
public class SpringLoadApplication {

	public static void main(String[] args) {
		// PART 1
		/*
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		context.getBean(Quoter.class).sayQuote();
		 */
		// PART 2
		PropertyFileApplicationContext context = new PropertyFileApplicationContext("context.properties");
		context.getBean(Quoter.class).sayQuote();
	}
}
