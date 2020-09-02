package design_patterns.template_method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class OldManChessPlayer  {
    public static void main(String[] args) {
        List<? super Number> numbers = new ArrayList<>();



        numbers.add(1);




        Object o = new Object();
        numbers.add(null);
    }
}
