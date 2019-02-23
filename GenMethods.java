package com.company;

public class GenMethods {

    static <T extends Comparable<T>, V extends T> boolean isInArray(T object, V[] arr) {
        for (V value : arr) {
            if (value == object) return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Integer iarr[] = {1,2,3};
        String sarr[] = {"test", "tak"};

        System.out.println(isInArray(2, iarr));
        System.out.println(isInArray("test2", sarr));
    }
}
