package by.putseta.task01.entity;

import java.util.ArrayList;

public class Data {

    ArrayList<Double> list = new ArrayList<>();

    public void add(double i) {
        list.add(i);
    }

    public double get(int index) {
        return list.get(index);
    }

    public void remove(int index) {
        list.remove(index);
    }
}
