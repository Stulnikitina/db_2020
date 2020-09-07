package my_spring;

public class CleanerImpl implements Cleaner {

    //@InjectRandomInt(min=3,max=10)
    private int repeat = 3;

    @Override
    public void clean() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("VVVVVVVVVVVVVVVVVVvvvvvvvvvvvvvvvvvvvv");
        }
    }
}
