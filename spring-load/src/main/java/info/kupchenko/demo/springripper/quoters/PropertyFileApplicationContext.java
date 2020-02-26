package info.kupchenko.demo.springripper.quoters;

import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author Евгений Борисов
 */
public class PropertyFileApplicationContext extends GenericApplicationContext {

    public PropertyFileApplicationContext(String propertyFile) {
        PropertiesBeanDefinitionReader reader = new PropertiesBeanDefinitionReader(this);
        int i = reader.loadBeanDefinitions(propertyFile);
        System.out.println("Found " + i + " beans");
        refresh();
    }

}
