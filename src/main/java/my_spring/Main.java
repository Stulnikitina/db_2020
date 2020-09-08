package my_spring;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        Map<Class<?>, Class<?>> map = new HashMap<>();
        map.put(Speaker.class, ConsoleSpeaker.class);


        JavaConfig config = new JavaConfig(map, "my_spring");
        ApplicationContext context = new ApplicationContext(config);

        IRobot iRobot = context.getBean(IRobot.class);

        iRobot.cleanRoom();
    }
}
