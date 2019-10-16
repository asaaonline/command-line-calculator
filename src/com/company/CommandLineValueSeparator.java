package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CommandLineValueSeparator implements ValueSeparator {
    @Override
    public Float[] separate(String s) {
        String[] stringArray = s.split(" ");

        List<Float> numberAray = new ArrayList<>();

        for (String str : stringArray
        ) {
            try {
                numberAray.add(Float.parseFloat(str));

            } catch (Exception e) {

            }
        }

        Float[] arr = new Float[numberAray.size()];
        arr = numberAray.toArray(arr);

        return arr;
    }
}
