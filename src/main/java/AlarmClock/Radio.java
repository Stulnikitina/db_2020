package AlarmClock;

import javax.xml.crypto.Data;

public interface Radio {

    void RemotelySetVolume(int volume);
    void RemotelyIncreaseVolume(int volume);
    void RemotelyDecreaseVolume(int volume);

    void RemotelyTurnOffAlarm();

    void RemotelySetSoundType(int type);

    void RemotelySetDate(Data data);

}