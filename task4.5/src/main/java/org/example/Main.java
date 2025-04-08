package org.example;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        long sum = LongStream.range(10000000,1000000000).sum();
       /// long sum = IntStream.rangeClosed(10000000, 1000000000).filter(i -> i < 1000000000).sum();
        System.out.println(sum);
    }
}