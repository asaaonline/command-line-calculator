package com.company;

public class FindMax implements Algorithems {


    @Override
    public float solve(Float[] array) {
        Float max=new Float(0);

        for (int counter = 1; counter < array.length; counter++)
        {
            if (array[counter] > max)
            {
                max = array[counter];
            }
        }

        return max;
    }
}
