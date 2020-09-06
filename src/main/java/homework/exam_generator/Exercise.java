package homework.exam_generator;

import lombok.*;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Exercise {
    private double a;
    private double b;
    private double answer;
    private Operator operator;


    public Exercise generateRandom(double a, double b) {
        setA(MyRandom.nextDouble(a, b));
        setB(MyRandom.nextDouble(a, b));
        operator = Operator.getRandomValue();
        makeAnswer();
        return this;
    }

    private void makeAnswer() {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        try {
            setAnswer((double) engine.eval(a + operator.getSign() + b));
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
}
