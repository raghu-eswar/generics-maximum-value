package com.generics;

public class Max {

    public static Integer maxOf(Integer arg1, Integer arg2, Integer arg3) {
        Integer max = arg1;
        if (max.compareTo(arg2) < 0)
            max = arg2;
        if (max.compareTo(arg3) < 0)
            max = arg3;
        return max;
    }
}
