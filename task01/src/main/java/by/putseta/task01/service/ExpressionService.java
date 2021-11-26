package by.putseta.task01.service;

import by.putseta.task01.entity.Data;

public class ExpressionService {
    Data data = new Data();

    public double swapFractionalAndIntegerParts(double x) {
        return (x * 1000) % 1000 + (int) x / 1000.0;
    }

    public int findOrdinalNumberOfSymbol(String x) {    // Determines the ordinary number of
        data.add(x.charAt(0));                   // character in the table Unicode
        return (x.charAt(0));          //TODO: сделать проверку что вводят только один символ
    }

    public char displayPreviousCharacter() {   // Determines the previous character in the table Unicode
        return (char) (data.get(0) - 1);
    }

    public char displayNextCharacter() {      // Determines the next character in the table Unicode
        return (char) (data.get(0) + 1);
    }
}
