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
        if (n1 < 0 || n1 > 100) {
            throw new Exception("num1 값은 0보다 작거나, num1 값은 100보다 큽니다..");
        }
        if (n2 < 0 || n2 > 100) {
            throw new RuntimeException("num2 값은 0보다 작거나, num2 값은 100보다 큽니다..");
        }
        return n1 * n2;
    }

    public int mathTest003(int n1, int n2) throws Exception {
        if (n1 < 0 || n1 > 10000) {
            throw new Exception("num1 값은 0 ~ 10,000 사이로 입력하세요..");
        }
        if (n2 < 0 || n2 > 10000) {
            throw new RuntimeException("num2 값은 0 ~ 10,000 사이로 입력하세요..");
        }
        if (n1 == n2) return 1;
        else return -1;
    }

    public double exam120817(int[] numbers) throws Exception {
        if (numbers == null ) {
            throw new Exception("numbers 는 null 이 아니여야 합니다.");
        }
        if (numbers.length < 1 || numbers.length > 100) {
            throw new Exception("numbers 배열 크기는 1~100 사이 여야 합니다.");
        }
        int sum = 0;
        for (int i=0; i<numbers.length; i++) {
            if (numbers[i] < 0 || numbers[i] > 1000) {
                throw new Exception("numbers[%d] 값은 0~1000 사이 여야 합니다.");
            } else {
                sum += numbers[i];
            }
        }
        return (double)sum/numbers.length;
    }

    public int exam120820(int age) throws Exception {
        int year = 2022;
        if (age < 0 || age >= 120) {
            throw new Exception("1~120세 까지 가능합니다.");
        }
        return year-(age-1);
    }

    public int exam120829(int angle) throws Exception {
        if (angle > 0 && angle < 90) {
            return 1;
        } else if (angle == 90) {
            return 2;
        } else if (angle > 90 && angle < 180) {
            return 3;
        } else if (angle == 180) {
            return 4;
        } else throw new Exception("1~180 도 사이 여야 합니다.");
    }
}

