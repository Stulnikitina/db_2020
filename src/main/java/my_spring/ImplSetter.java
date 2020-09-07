package my_spring;

import org.reflections.Reflections;

public class ImplSetter {

    private Reflections reflections;

    public ImplSetter(String s) {
        this.reflections = new Reflections(s);
    }

    public <T> Class<? extends T> getImpl(Class<T> type) {
        return reflections.getSubTypesOf(type).iterator().next();
    }
}
