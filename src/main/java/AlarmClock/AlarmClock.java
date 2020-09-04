package AlarmClock;

import lombok.Getter;
import lombok.Setter;

import javax.xml.crypto.Data;

@Getter
@Setter
public abstract class AlarmClock {

    private int model;
    private int soundPower;
    private int soundType;

    private Data awakeTime;

    public abstract void awake();
    //если время подъема, то играть мелодию
    //метод абстрактный,
    //так как разные модели будильников могут и начать вибрировать,
    //замерять пульс и тд
    //и для всего этого нужно нити

    public abstract void turnOffAlarm();

    public void increaseVolume(int volume) {
        soundPower += volume;
    }

    public void DecreaseVolume(int volume) {
        soundPower -= volume;
    }


}
