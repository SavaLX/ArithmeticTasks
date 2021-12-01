package by.putseta.task01.entity;

import java.util.ArrayList;
import java.util.List;

public class Data {

    List<Double> list = new ArrayList<>();  // collection for numeric values
    List<String> stringList = new ArrayList<>();  // collection for string values

    public void add(double i) {
        list.add(i);
    }

    public double get(int index) {
        return list.get(index);
    }

    public void addString(String i) {
        stringList.add(i);
    }

    public String getString(int index) {
        return stringList.get(index);
    }

}
