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
        if (numbers == null) {
            throw new Exception("numbers 는 null 이 아니여야 합니다.");
        }
        if (numbers.length < 1 || numbers.length > 100) {
            throw new Exception("numbers 배열 크기는 1~100 사이 여야 합니다.");
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0 || numbers[i] > 1000) {
                throw new Exception("numbers[%d] 값은 0~1000 사이 여야 합니다.");
            } else {
                sum += numbers[i];
            }
        }
        return (double) sum / numbers.length;
    }

    public int exam120820(int age) throws Exception {
        int year = 2022;
        if (age < 0 || age >= 120) {
            throw new Exception("1~120세 까지 가능합니다.");
        }
        return year - (age - 1);
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
        for (int i = 0; i <= n; i += 2) {
            evensum += i;
        }
        return evensum;
    }

    public int[] exam120813(int n) throws Exception {
        if (n < 0 || n > 100) {
            throw new Exception("0 ~ 100 사이로 입력하세요..");
        }
        int[] result = new int[(n + 1) / 2];

        int t = 0;
        for (int i = 1; i <= n; i += 2) {
            result[t] += i;
            t++;
        }
        return result;
    }

    public int exam120583(int[] array, int n) throws Exception {
        if (array.length > 100) {
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

    public int exam120585(int[] array, int height) throws Exception {
        if (array.length > 100) {
            throw new Exception("array는 0 ~ 100 사이로 입력하세요..");
        }
        if (height < 0 || height > 200) {
            throw new Exception("height는 0 ~ 200 사이로 입력하세요..");
        }
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 || array[i] > 200) {
                throw new Exception("array[%d] 값은 0~200 사이 여야 합니다.");
            }
            if (array[i] > height) {
                result += 1;
            }
        }
        return result;
    }

    public int exam120818(int price) throws Exception {
        if (price <= 10 || price >= 1000000) {
            throw new Exception("10 ~ 1000000 사이로 입력하세요..");
        }
        price = (price / 10) * 10;
        int result = 0;
        if (price >= 500000) {
            result = price * 80 / 100;
        } else if (price >= 300000) {
            result = price * 90 / 100;
        } else if (price >= 100000) {
            result = price * 95 / 100;
        } else {
            result = price;
        }
        return result;
    }

    public int exam120837(double hp) throws Exception {
        if (hp % 1 > 0) {
            throw new Exception("hp는 자연수입니다.");
        }
        if (hp <= 0 || hp > 1000) {
            throw new Exception("hp는 1~1000 입니다.");
        }
        int health = (int) hp;
        int result = health / 5;
        result += (health % 5) / 3;
        result += (health % 5) % 3;
        return result;
    }

    public String exam120839(String rsp) throws Exception {
        if (rsp == null) {
            throw new Exception("rsp는 null 이 아니어야 합니다..");
        }
        if (rsp.length() <= 0 || rsp.length() > 100) {
            throw new Exception("rsp의 길이는 1~100 입니다.");
        }
        String result = "";
        for (int i = 0; i < rsp.length(); i++) {
            char ch = rsp.charAt(i);
            if (ch == '2') {
                result += "0";
            } else if (ch == '0') {
                result += "5";
            } else if (ch == '5') {
                result += "2";
            } else {
                throw new Exception("rsp에 '0', '2', '5'만 넣어주세요..");
            }
        }
        return result;
    }

    public String exam120893(String my_string) throws Exception {
        if (my_string == null) {
            throw new Exception("rsp는 null 이 아니어야 합니다..");
        }
        if (my_string.length() > 1000) {
            throw new Exception("my_string의 길이는 1~1000 입니다.");
        }
        int tmp;
        String result = "";
        for (int i = 0; i < my_string.length(); i++) {
            tmp = (int) my_string.charAt(i);
            if ((65 <= tmp) && (tmp <= 90)) {    //문자가 65 <= tmp <= 90인 경우 (대문자인 경우)
                result += (char) (tmp + 32);    //32를 더해서 소문자로 변환
            } else if ((97 <= tmp) && (tmp <= 122)) { //문자가 97 <= tmp <= 122인 경우 (소문자인 경우)
                result += (char) (tmp - 32);    //32를 빼서 대문자로 변환
            } else {
                result += (char) tmp;
            }
        }
        return result;
    }

    public int[] exam120893(int[] num_list) throws Exception {
        if (num_list == null) {
            throw new Exception("num_list는 null 이 아니어야 합니다..");
        }
        if (num_list.length > 100) {
            throw new Exception("num_list의 길이는 1~100 입니다.");
        }
        int[] result = new int[]{0, 0};
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] > 1000) {
                throw new Exception("num_list[%s]는 1000이 넘어갈 수 없습니다.");
            }
            if (num_list[i] % 2 == 0) {
                result[0] = result[0] + 1;
            } else if (num_list[i] % 2 == 1) {
                result[1] = result[1] + 1;
            } else {
                throw new Exception("num_list[%s]는 정수만 입력하세요..");
            }
        }
        return result;
    }

    public int[] exam120899(int[] array) throws Exception {
        if (array == null) {
            throw new Exception("array는 null 이 아니어야 합니다..");
        }
        if (array.length > 100) {
            throw new Exception("array의 길이는 1~100 입니다.");
        }
        int[] result = new int[2];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 1000) {
                throw new Exception("array[%s]는 1000이 넘어갈 수 없습니다.");
            }
            if (array[i] > result[0]) {
                result[0] = array[i];
                result[1] = i;
            }
        }
        return result;
    }
    public int exam120889(int[] sides) throws Exception {
        if (sides == null) {
            throw new Exception("array는 null 이 아니어야 합니다..");
        }
        if (sides.length != 3) {
            throw new Exception("array의 길이는 1~100 입니다.");
        }
        int Max = 0;
        int NUMs = 0;
        int result = 1;
        for (int i = 0; i < sides.length; i++) {
            if (sides[i] > 1000) {
                throw new Exception("array[%s]는 1000이 넘어갈 수 없습니다.");
            }
            if (sides[i] > Max) {
                Max = sides[i];
            }
            NUMs += sides[i];
        }
        if (Max < NUMs-Max) {
            return 1;
        } else return 2;
/**
 public String[] exam120903(String[] s1, String[] s2) throws Exception {
 if (s1 == null || s2 == null) {
 throw new Exception("값이 null 이 아니어야 합니다..");
 }
 if (num_list.length > 100) {
 throw new Exception("num_list의 길이는 1~100 입니다.");
 }
 return s1;
 }
 **/
    }
}