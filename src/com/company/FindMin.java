package com.company;

public class FindMin implements Algorithems {


    @Override
    public float solve(Float[] array) {
        Float min=array[0];

        for (int counter = 1; counter < array.length; counter++)
        {
            if (array[counter] < min)
            {
                min = array[counter];
            }
        }

        return min;
    }
}
