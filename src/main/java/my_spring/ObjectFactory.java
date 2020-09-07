package my_spring;

import lombok.SneakyThrows;

public class ObjectFactory {


//    private Map<Class, Class> ifc2ImplClass = Map.of(Speaker.class, ConsoleSpeaker.class)

    private ImplSetter implSetter = new ImplSetter("./");

    private static ObjectFactory objectFactory = new ObjectFactory();

    private ObjectFactory() {
    }

    public static ObjectFactory getInstance() {
        return objectFactory;
    }

    @SneakyThrows
    public <T> T createObject(Class<T> type) {

        Class<? extends T> helpClass;
        if(type.isInterface()){
            helpClass = implSetter.getImpl(type);
        } else {
            helpClass = type;
        }

        return helpClass.getDeclaredConstructor().newInstance();
    }
}
