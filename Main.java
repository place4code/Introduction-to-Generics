package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Integer inums[] = {1,2,3,4,5};

        Double dnums[] = {1.0,2.0,3.0,4.0,5.0};

        Stats<Integer> istats = new Stats<Integer>(inums);

        Stats<Double> dstats = new Stats<Double>(dnums);

        System.out.println(istats.average());
        System.out.println(dstats.average());

        System.out.println(istats.sameAvg(dstats));

        System.out.println("#################################");

    }
}
