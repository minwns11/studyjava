package com.sbmavenweb.study001.mathexam;

public class Printer {

    static void println(int value) {
        System.out.println(value);
    }
    static void println(boolean value) {
        System.out.println(value);
    }
    static void println(double value) {
        System.out.println(value);
    }
    static void println(String value) {
        System.out.println(value);
    }

    public static void main(String[] args) {
        Printer.println(10);
        Printer.println(true);
        Printer.println(5.7);
        Printer.println("홍길동");
    }
}
