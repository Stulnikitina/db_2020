package real_spring;

import lombok.RequiredArgsConstructor;

import javax.annotation.PostConstruct;
import java.util.List;

@RequiredArgsConstructor
public class TalkingRobotImpl implements TalkingRobot {


    private final List<Quoter> quoters;



    @Override
    @PostConstruct
    public void talk() {
        quoters.forEach(Quoter::sayQuote);
    }
}
