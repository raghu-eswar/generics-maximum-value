package com.generics;

public class Max <Any extends  Comparable> {
    Any[] values;

    public Max(Any ... values) {
        this.values = values;
    }

    public Any maxOf(){
        return maxOf(this.values);
    }


    public static <Any extends  Comparable> Any maxOf(Any ... values) {
        Any max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (max.compareTo(values[i]) < 0)
                max = values[i];
        }
        return max;
    }
}
