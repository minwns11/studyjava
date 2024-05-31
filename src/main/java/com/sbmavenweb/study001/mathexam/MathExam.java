package com.sbmavenweb.study001.mathexam;

public class MathExam {
    public int subTest001(int n1, int n2) throws Exception {
        if (n1 < -50000 || n1 > 50000) {
            throw new Exception("num1 값은 -50000보다 작거나, num1 값은 50000보다 큽니다..");
        }
        if (n2 < -50000 || n2 > 50000) {
            throw new RuntimeException("num2 값은 -50000보다 작거나, num2 값은 50000보다 큽니다..");
        }
        return n1 - n2;
    }

    public int mathTest002(int n1, int n2) throws Exception {
        if (n1 <= 0 || n1 >= 100) {
            throw new Exception("num1 값은 0보다 작거나, num1 값은 100보다 큽니다..");
        }
        if (n2 <= 0 || n2 >= 100) {
            throw new Exception("num2 값은 0보다 작거나, num2 값은 100보다 큽니다..");
        }
        return n1 * n2;
    }
    public int mathTest003(int n1, int n2) throws Exception {
        if (n1 <= 0 || n1 >= 100) {
            throw new Exception("num1 값은 0보다 작거나, num1 값은 100보다 큽니다..");
        }
        if (n2 <= 0 || n2 >= 100) {
            throw new Exception("num2 값은 0보다 작거나, num2 값은 100보다 큽니다..");
        }
        return n1 * n2;
    }
}

