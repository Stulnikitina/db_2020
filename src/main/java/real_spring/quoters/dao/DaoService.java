package real_spring.quoters.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import real_spring.quoters.dao.Dao;

import static real_spring.quoters.dao.DBTypes.DERBY;
import static real_spring.quoters.dao.DBTypes.ORACLE;

@Service
public class DaoService {

    @DBAnnotation(ORACLE)
    private Dao oracle;

    @DBAnnotation(DERBY)
    private Dao derby;


    @Scheduled(fixedDelay = 1000)
    public void doWork() {
        oracle.save();
    }

    @Scheduled(fixedDelay = 3000)
    public void doBackup() {
        derby.save();
    }
}