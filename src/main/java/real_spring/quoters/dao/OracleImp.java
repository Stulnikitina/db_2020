package real_spring.quoters.dao;

import org.springframework.stereotype.Component;

import static real_spring.quoters.dao.DBTypes.ORACLE;

@Component
@DBAnnotation(ORACLE)
public class OracleImp implements Dao {
    @Override
    public void save() {
        System.out.println("пишу Oracle");
    }
}
