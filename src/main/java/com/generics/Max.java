package com.generics;

public class Max <Any extends  Comparable> {
    Any value1;
    Any value2;
    Any value3;

    public Max(Any value1, Any value2, Any value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public Any maxOf(){
        return maxOf(this.value1, this.value2, this.value3);
    }


    public static <Any extends  Comparable> Any maxOf(Any arg1, Any arg2, Any arg3) {
        Any max = arg1;
        if (max.compareTo(arg2) < 0)
            max = arg2;
        if (max.compareTo(arg3) < 0)
            max = arg3;
        return max;
    }
}
