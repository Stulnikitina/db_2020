package homework;

import java.util.ArrayList;

public class MyArrayInteger implements DynamicIntegerArray {

    private ArrayList<Integer> array = new ArrayList<>();

    public MyArrayInteger() {
    }

    public MyArrayInteger(ArrayList<Integer> array) {
        this.array = array;
    }

    @Override
    public int get(int index) {
        return this.array.get(index);
    }

    @Override
    public void add(int value) {
        this.array.add(value);
    }

    @Override
    public int size() {
        return this.array.size();
    }

    @Override
    public String toString() {
        return "MyArrayInteger{" +
                "array=" + array +
                '}';
    }
}
