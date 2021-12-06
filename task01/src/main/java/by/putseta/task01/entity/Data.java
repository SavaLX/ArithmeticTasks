package by.putseta.task01.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for storing entered values
 */
public class Data {
    /**
     * Field collection for numeric values
     */
    List<Double> list = new ArrayList<>();
    /**
     * Field collection for string values
     */
    List<String> stringList = new ArrayList<>();

    /**
     * Method for add entered values in collection
     *
     * @param i some entered numerical value
     * @see #list
     */
    public void add(double i) {
        list.add(i);
    }

    /**
     * Method for get entered values from collection
     *
     * @param index index of received value
     * @return returns the value at index
     * @see #list
     */
    public double get(int index) {
        return list.get(index);
    }

    /**
     * Method for add entered values in collection
     *
     * @param i some entered value of string vale
     * @see #stringList
     */
    public void addString(String i) {
        stringList.add(i);
    }

    /**
     * Method for get entered values from collection
     *
     * @param index index of received value
     * @return returns the value at index
     * @see #stringList
     */
    public String getString(int index) {
        return stringList.get(index);
    }

}
