package info.kupchenko.demo.springripper.screensaver;

import javafx.util.Pair;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;


import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Евгений Борисов
 */
public class PeriodicalScopeConfigurator implements Scope {
    public static final long DELAY_SECONDS = 5L;

    Map<String, Pair<LocalDateTime, Object>> map = new HashMap<>();

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        LocalDateTime current = LocalDateTime.now();
        if(map.containsKey(name)) {
            Pair<LocalDateTime, Object> pair = map.get(name);
            if(current.isAfter(pair.getKey().plusSeconds(DELAY_SECONDS))) {
                map.put(name, new Pair<>(current, objectFactory.getObject()));
            }
        } else {
            map.put(name, new Pair<>(current, objectFactory.getObject()));
        }
        return map.get(name).getValue();
    }

    @Override
    public Object remove(String name) {
        return null;
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {

    }

    @Override
    public Object resolveContextualObject(String key) {
        return null;
    }

    @Override
    public String getConversationId() {
        return null;
    }
}
