package com.company;

public class Main {

    static int fibonachi(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return fibonachi(n - 1) + fibonachi(n - 2);
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            int fr = fibonachi(i);
            System.out.println(fr);
        }
    }
}
