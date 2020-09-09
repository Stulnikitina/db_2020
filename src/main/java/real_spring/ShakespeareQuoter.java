package real_spring;

import lombok.Setter;
import my_spring.InjectRandomInt;


public class ShakespeareQuoter implements Quoter {
    @Setter
    private String message;

    @InjectRandomInt(min = 4,max = 7)
    private int repeat;


    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }

}
