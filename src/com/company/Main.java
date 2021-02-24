package com.company;

public class Main {
    public static void main(String[] args) {

        System.out.println(factorial(5));
    }
    public static long factorial ( int num){
        if (num == 0) {
            return 1;

        }
        return num * factorial(num - 1);
    }

}
