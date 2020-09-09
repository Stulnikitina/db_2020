package real_spring;

import lombok.SneakyThrows;
import lombok.var;
import my_spring.InjectRandomInt;
import my_spring.RandomUtil;
import org.reflections.ReflectionUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Field;

public class InjectRandomIntAnnotationBeanPostProcessor implements BeanPostProcessor {

    @Override
    @SneakyThrows
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Class<?> implClass = bean.getClass();
        var fields = ReflectionUtils.getAllFields(implClass);
        for (Field field : fields) {
            InjectRandomInt annotation = field.getAnnotation(InjectRandomInt.class);
            if (annotation != null) {
                int randomInt = RandomUtil.getIntBetween(annotation.min(), annotation.max());
                field.setAccessible(true);
                field.setInt(bean, randomInt);
            }
        }
        return bean;
    }
}
