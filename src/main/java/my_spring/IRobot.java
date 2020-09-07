package my_spring;


public class IRobot {

    private Speaker speaker = ObjectFactory.getInstance().createObject(Speaker.class);
    private Cleaner cleaner = ObjectFactory.getInstance().createObject(CleanerImpl.class);

    public void cleanRoom() {
        speaker.speak("Я начал уборку");
        cleaner.clean();
        speaker.speak("Я закончил уборку");
    }
}
