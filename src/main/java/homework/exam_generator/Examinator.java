package homework.exam_generator;

import java.util.*;


public class Examinator {

    public ArrayList<Exercise> generate(int amount, double min_val, double max_val) {
        ArrayList<Exercise> list =  new ArrayList<>();
        for (int i = 0; i < amount; ++i) {
            list.add(new Exercise().generateRandom(min_val, max_val));
        }
        return list;
    }

    public void startExam(ArrayList<Exercise> list) {
        Scanner scanner = new Scanner(System.in);
        double userAnswer;
        int userCount = 0;
        System.out.println("Экзмен по математике");
        System.out.println("Экзмен состоит из "+list.size()+" вопросов");
        for (int i = 0; i < list.size(); ++i) {
            System.out.println("");
            System.out.println("Вопрос №"+(i+1));
            System.out.println("================");
            System.out.println(list.get(i).getA()+ " " +list.get(i).getOperator().getSign()+ " " +list.get(i).getB()+" = ?");
            System.out.println("Введите ответ");
            userAnswer = scanner.nextDouble();
            if ((userAnswer - list.get(i).getAnswer()) < 0.1) userCount++;
        }
        System.out.println("Ваш результат: "+userCount+" / "+list.size());
    }

}
