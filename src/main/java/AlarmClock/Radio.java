package AlarmClock;

import javax.xml.crypto.Data;

public interface Radio extends R {

    void remotelySetVolume(int volume);
    void remotelyIncreaseVolume(int volume);
    void remotelyDecreaseVolume(int volume);

    void remotelyTurnOffAlarm();

    void remotelySetSoundType(int type);

    void remotelySetDate(Data data);

}
