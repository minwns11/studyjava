package com.sbmavenweb.study001.mathexam;

import java.util.Calendar;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Ex1234();
        try {
            Ex3015();
        } catch (Exception e) {
            System.out.println(String.format("에러임 : %s", e.getMessage()));
        }
    }

    /**
     * 출력문
     **/
    // 특수 서식 문자 출력하기
    public static void Ex1731() {
        System.out.println("special characters\n[\\n,\\\",\\\\] is very important.");
    }

    /**
     * 입출력문 및 연산자
     **/
    // 연월일 입력받아 그대로 출력하기
    public static void Ex1019() {
        Scanner sc = new Scanner(System.in);
        String date[] = sc.next().split("\\.");    // [.] or \\. 사용
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        System.out.print(String.format("%04d", year) + "." + String.format("%02d", month) + "." + String.format("%02d", day));
    }

    // 단어 1개 입력받아 나누어 출력하기
    public static void Ex1024() {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        for (int i = 0; i < word.length(); i++) {
            System.out.println(String.format("\'%c\'", word.charAt(i)));
        }
        sc.close();
    }

    // 10진 정수 1개 입력받아 8진수로 출력하기(
    public static void Ex1031() {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(Integer.toOctalString(i));
    }

    // 10진 정수 입력받아 16진수로 출력하기1
    public static void Ex1032() {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(Integer.toHexString(i));
    }

    // 10진 정수 입력받아 16진수로 출력하기2
    public static void Ex1033() {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(Integer.toHexString(i).toUpperCase());
    }

    // 8진 정수 1개 입력받아 10진수로 출력하기
    public static void Ex1034() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i = Integer.parseInt(s, 8);
        System.out.println(Integer.toString(i).toUpperCase());
        sc.close();
    }

    // 16진 정수 1개 입력받아 8진수로 출력하기
    public static void Ex1035() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i = Integer.parseInt(s, 16);
        System.out.println(Integer.toOctalString(i));
        sc.close();
    }

    // 영문자 1개 입력받아 10진수로 출력하기
    public static void Ex1036() {
        Scanner sc = new Scanner(System.in);
        char s = sc.nextLine().charAt(0);
        int num = (int) s;
        System.out.println(num);
        sc.close();
    }

    // 정수 입력받아 아스키 문자로 출력하기
    public static void Ex1037() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char ch = (char) num;
        System.out.println(ch);
        sc.close();
    }

    // 정수 2개 입력받아 자동 계산하기
    public static void Ex1045() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == 0 && b > 2147483647 && Double.isInfinite(a / b)) {
            System.out.println("값 산출 불가");
        } else {
            System.out.println(a + b);
            System.out.println(a - b);
            System.out.println(a * b);
            System.out.println(a / b);
            System.out.println((a % b));
            System.out.println(String.format("%.2f", (Math.round(a * 100.0 / b) / 100.0)));
        }
        sc.close();
    }

    // 정수 3개 입력받아 합과 평균 출력하기
    public static void Ex1046() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a + b + c) > 2147483647 && (a + b + c) < -2147483648) {
            System.out.println("값 산출 불가");
        }
        System.out.println(a + b + c);
        System.out.println(String.format("%.1f", Math.round((a + b + c) * 10) / 30.0));
        sc.close();
    }

    // 둘 다 거짓일 경우만 참 출력하기
    public static void Ex1058() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if ((a == 0) && (b == 0)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        sc.close();
    }

    // 소리 파일 저장용량 계산하기
    public static void Ex1085() throws Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int s = sc.nextInt();
        if (h > 48000 || b > 32 || c > 5 || s > 6000) {
            throw new Exception("값이 옳바르지 않습니다.");
        }
        if (h * b * c / 8.0 / 1024 / 1024 / 1024 / 1024 * s >= 0.45) {
            System.out.println(String.format("%.1f TB", Math.round(h * b * c / 8.0 / 1024 / 1024 / 1024 / 1024 * s * 10) / 10.0));
        } else if (h * b * c / 8.0 / 1024 / 1024 / 1024 * s >= 0.45) {
            System.out.println(String.format("%.1f GB", Math.round(h * b * c / 8.0 / 1024 / 1024 / 1024 * s * 10) / 10.0));
        } else if (h * b * c / 8.0 / 1024 / 1024 * s >= 0.45) {
            System.out.println(String.format("%.1f MB", Math.round(h * b * c / 8.0 / 1024 / 1024 * s * 10) / 10.0));
        } else if (h * b * c * s / 8.0 / 1024 >= 0.45) {
            System.out.println(String.format("%.1f KB", Math.round(h * b * c * s / 8.0 / 1024 * 10) / 10.0));
        } else if (h * b * c * s / 8.0 >= 0.45) {
            System.out.println(String.format("%.1f 1024", Math.round(h * b * c * s / 8.0 * 10) / 10.0));
        }
        sc.close();
    }

    // 축구의 신 1
    public static void Ex1165() {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int point = sc.nextInt();
        System.out.println(((90 - min) + 4) / 5 + point);
        sc.close();
    }

    // 윤년 판별
    public static void Ex1166() {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 400 == 0) {
            System.out.println("Leap");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Leap");
        } else {
            System.out.println("Normal");
        }
        sc.close();
    }

    // 30분전
    public static void Ex1173() throws Exception {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int mins = sc.nextInt();

        if (hour < 0 || hour >= 24) {
            throw new Exception(String.format("시간(%d)은 0~23 이어야 합니다..", hour));
        } else if (mins < 0 || mins > 59) {
            throw new Exception(String.format("분(%d)은 0~59 이어야 합니다..", mins));
        }
        int nextMins = mins - 30;
        if (nextMins < 0) {
            hour = (hour <= 0) ? 23 : hour - 1;
            nextMins += 60;
        }
        System.out.println(String.format("%d %d", hour, nextMins));
        sc.close();
    }

    // 만능 휴지통
    public static void Ex1180() throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 0 || n > 99) {
            throw new Exception(String.format("압축 수치(%d)는 1~99입니다..", n));
        }
        int temp = n / 10;
        n = (n % 10 * 10 + temp) * 2;
        n -= (n >= 100) ? 100 : 0;
        System.out.println(String.format("%d", n));
        if (n <= 50) {
            System.out.println("GOOD");
        } else if (n > 50) {
            System.out.println("OH MY GOD");
        }
        sc.close();
    }

    // 최댓값
    public static void Ex1205() throws Exception {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();

        if (a == 0 || b == 0) {
            throw new Exception(String.format("a(%d)와 b(%d)는 0이 될 수 없습니다..", a, b));
        }
        double add = a + b;
        double sub = Math.max(a - b, b - a);
        double mul = a * b;
        double div = Math.max(a / b, b / a);
        double are1 = a, are2 = b;
        for (int i = 0; i < b - 1; i++) {
            are1 *= a;
        }
        for (int i = 0; i < a - 1; i++) {
            are2 *= b;
        }
        double[] arr = {add, sub, mul, div, are1, are2};
        Arrays.sort(arr);
        System.out.println(String.format("%.06f", arr[arr.length - 1]));
        sc.close();
    }

    // 이 달은 며칠까지 있을까?
    public static void Ex1214() throws Exception {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int mon = sc.nextInt();
        if ( mon < 1 || mon > 12) {
            throw new Exception(String.format("mon(%d)은 1~12입니다..", mon));
        }
        int day=0;
        if (mon==2) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                day = 29;
            } else {
                day = 28;
            }
        } else if (mon==4||mon==6||mon==9||mon==11) {
            day = 30;
        } else {
            day = 31;
        }
        System.out.println( String.format("%d", day));
        sc.close();
    }

    // 삼각형 판단하기
    public static void Ex1218() throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == 0 || b == 0 || c == 0) {
            throw new Exception(String.format("a(%d)와 b(%d)와 c(%d)는 0이 될 수 없습니다..", a, b, c));
        }

        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("삼각형아님");
        } else if (a == b && b == c) {
            System.out.println("정삼각형");
        } else if (a == b || b == c || c == a) {
            System.out.println("이등변삼각형");
        } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
            System.out.println("직각삼각형");
        } else {
            System.out.println("삼각형");
        }
        sc.close();
    }

    // 축구의 신 2
    public static void Ex1222() {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int class1 = sc.nextInt();
        int class2 = sc.nextInt();
        System.out.println(1);
        sc.close();
    }

    // 이번 주 로또
    public static int[] Ex1226() throws Exception {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();
        sc.close();
        int point = 0;
        boolean B;

        int[] SuccessArray = getIntArrayFromString(first, 7);

        int[] tryArray = getIntArrayFromString(second, 6);

        for (int i = 0; i < 6; i++) {
            for (int r = 0; r < 6; i++) {
                if (tryArray[i] == SuccessArray[r]) {
                    point += 1;
                }
            }
            if (tryArray[i] == SuccessArray[6]) {
                B = true;
            }
        }
        if (point == 7) {
            System.out.println(1);
        } else if (point == 6) {
            System.out.println(2);
        } else if (point == 5) {
            System.out.println(3);
        } else if (point == 4) {
            System.out.println(4);
        } else if (point == 3) {
            System.out.println(5);
        } else {
            System.out.println(0);
        }
        return SuccessArray;
    }
    private static int[] getIntArrayFromString(String str, int n) {
        String[] tryStr = str.split(" ");
        int[] tryArr = new int[n];
        for (int i = 0; i < tryStr.length; i++) {
            tryArr[i] = Integer.parseInt((tryStr[i]));
        }
        Arrays.sort(tryArr);
        return tryArr;
    }

    // 함수로 거듭 제곱 리턴하기
    public static void Ex1566() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        long result = a;
        if (n != 0) {
            while (n-- > 1) {
                result *= (long)a;
            }

            Calendar d = Calendar.getInstance();
            System.out.println(d.getTime());
        } else { result = 1; }
        System.out.println(String.format("%d", result));
        sc.close();

    }
    // 함수로 거듭 제곱 리턴하기
    public static void Ex3015() {
        Scanner sc = new Scanner(System.in);
        int dataCount = sc.nextInt();
        int displayCount = sc.nextInt();

        Student[] students = new Student[dataCount];
        for (int i=0;i<dataCount;i++) {
            String name = sc.next();
            int score = sc.nextInt();
            students[i] = new Student();
            students[i].setName( name );
            students[i].setScore(score);
        }

//        Student[] sortedStudents = new Student[students.length];
//        int ndx = 0;
        for (int i = 0; i < students.length; i++) {
            for ( int j = i; j <students.length; j++) {
                if ( students[i].getScore() < students[j].getScore() ) {
                    Student tempstudent = students[i];
                    students[i] = students[j];
                    students[j] = tempstudent;
                    /**
                    String tempname = students[i].getName();
                    int tempScore = students[i].getScore();

                    students[i].setName( students[j].getName());
                    students[i].setScore( students[j].getScore());

                    students[j].setName( tempname );
                    students[j].setScore( tempScore );
                     **/
                }
            }
        }

        for (int i=0;i<displayCount; i++) {
            System.out.println(students[i].getName());
        }
        sc.close();

    }
}
