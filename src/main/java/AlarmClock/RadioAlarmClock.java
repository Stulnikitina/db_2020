package AlarmClock;

import lombok.experimental.Delegate;

import javax.xml.crypto.Data;

public class RadioAlarmClock extends AlarmClock implements Radio{

    @Delegate
    private RadioImpl radio = new RadioImpl();

    @Override
    public void Awake() {

    }

    @Override
    public void TurnOffAlarm() {

    }

}
