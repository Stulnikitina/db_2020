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

    public abstract void Awake();
    //если время подъема, то играть мелодию
    //метод абстрактный,
    //так как разные можели будильников могут и начать вибрировать,
    //замерять пульс и тд
    //и для всего этого нужно нити

    public abstract void TurnOffAlarm();

    public void IncreaseVolume(int volume) {
        soundPower += volume;
    }

    public void DecreaseVolume(int volume) {
        soundPower -= volume;
    }


}
