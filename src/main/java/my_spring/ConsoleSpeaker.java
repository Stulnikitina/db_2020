package my_spring;

@Singleton
public class ConsoleSpeaker implements Speaker {
    @Override
    public void speak(String message) {
        System.out.println(message);
    }
}
