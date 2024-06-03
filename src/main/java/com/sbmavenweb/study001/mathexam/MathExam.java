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

    public int exam120831(int n) throws Exception {
        if (n < 0 || n > 1000) {
            throw new Exception("0 ~ 1000 사이로 입력하세요..");
        }
        int evensum = 0;
        for (int i=0;i<=n;i+=2) {
               evensum += i;
       }
       return evensum;
    }

    public int[] exam120813(int n) throws Exception {
        if (n < 0 || n > 100) {
            throw new Exception("0 ~ 100 사이로 입력하세요..");
        }
        int[] result = new int[(n+1)/2];

        int o = 0;
        for (int i=1;i<=n;i+=2) {
            result[o] += i;
            o ++;
        }
        return result;
    }

    public int exam120583(int[] array, int n) throws Exception {
        if (array.length < 0 || array.length > 100) {
            throw new Exception("array 0 ~ 100 사이로 입력하세요..");
        }
        if (n < 0 || n > 1000) {
            throw new Exception("0 ~ 1000 사이로 입력하세요..");
        }
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 || array[i] > 1000) {
                throw new Exception("array[%d] 값은 0~1000 사이 여야 합니다.");
            }
            if (array[i] == n) {
                result += 1;
            }
        }
        return result;
    }

}

