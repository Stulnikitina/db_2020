package homework.exam_generator;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Examinator exam =  new Examinator();
        ArrayList<Exercise> list = exam.generate(3, 0.0, 15);
        exam.startExam(list);
    }
}
