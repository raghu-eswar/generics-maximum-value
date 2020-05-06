package com.generics;

public class Max {

    public static <Any extends  Comparable> Any maxOf(Any arg1, Any arg2, Any arg3) {
        Any max = arg1;
        if (max.compareTo(arg2) < 0)
            max = arg2;
        if (max.compareTo(arg3) < 0)
            max = arg3;
        return max;
    }
}
