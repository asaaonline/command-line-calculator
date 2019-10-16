package com.company;

public class CommandLinAlgorithamSelector implements AlgorithamSelectors {

    @Override
    public Algorithems selectAlgoritham(String s) {

        String[] stringArray = s.split(" ");
        String command = stringArray[0] + stringArray[1];

        switch (command) {
            case "Calculatormin":
                return new FindMin();

            case "Calculatemax":
                return new FindMax();

            default:
                return null;

        }

    }
}
