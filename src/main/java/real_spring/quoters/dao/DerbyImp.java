package real_spring.quoters.dao;

import org.springframework.stereotype.Component;

import static real_spring.quoters.dao.DBTypes.DERBY;

@Component
@DBAnnotation(DERBY)
public class DerbyImp implements Dao {
    @Override
    public void save() {
        System.out.println("пишу Derby");
    }
}
