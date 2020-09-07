package my_spring;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.util.Set;

public class ImplSetter {

    private Reflections reflections;

    public ImplSetter(String s) {
        this.reflections = new Reflections(s);
    }

    @SneakyThrows
    public <T> Class<? extends T> getImpl(Class<T> type) {
        Set<Class<? extends T>> setImpl = reflections.getSubTypesOf(type);
        if(setImpl.size() == 0) throw new Exception("no have implementation");
        return setImpl.iterator().next();
    }
}
