package by.putseta.task01.entity;

import java.util.ArrayList;
import java.util.List;

public class Data {

    List<Double> list = new ArrayList<>();

    public void add(double i) {
        //TODO: сделать проверку входных данных
        list.add(i);
    }

    public double get(int index) {
        return list.get(index);
    }

    public void remove(int index) {
        list.remove(index);
    }
}
