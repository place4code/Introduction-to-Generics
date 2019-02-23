package com.company;

public class Stats<T extends Number> implements GenInter<T> {

    T[] nums;

    public Stats(T[] nums) {
        this.nums = nums;
    }

    double average() {

        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return (sum / nums.length);
    }

    boolean sameAvg(Stats<?> object) {
        return average() == object.average();
    }

    @Override
    public T test() {
        System.out.println("test");
        return null;
    }
}
