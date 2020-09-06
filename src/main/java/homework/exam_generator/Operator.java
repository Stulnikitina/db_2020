package homework.exam_generator;

import lombok.RequiredArgsConstructor;

import java.util.Random;

@RequiredArgsConstructor
public enum Operator {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    private final String sign;

    public static Operator getRandomValue(){
        return Operator.values()[new Random().nextInt(Operator.values().length)];
    }

    public String getSign() {
        return this.sign;
    }
}
