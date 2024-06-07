package com.sbmavenweb.study001.mathexam;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Ex1234();
        try {
            Ex1165();
        } catch (Exception e) {
            System.out.println(String.format("에러임 : %s", e.getMessage()));
        }
    }
    /** 출력문 **/
    // 특수 서식 문자 출력하기
    public static void Ex1731() {
        System.out.println("special characters\n[\\n,\\\",\\\\] is very important.");
    }

    /** 입출력문 및 연산자 **/
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
        int num = (int)s;
        System.out.println(num);
        sc.close();
    }
    // 정수 입력받아 아스키 문자로 출력하기
    public static void Ex1037() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char ch = (char)num;
        System.out.println(ch);
        sc.close();
    }
    // 정수 2개 입력받아 자동 계산하기
    public static void Ex1045() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == 0 && b > 2147483647 && Double.isInfinite(a / b)) {System.out.println("값 산출 불가");
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
        if ((a+b+c) > 2147483647 && (a+b+c) < -2147483648) {
            System.out.println("값 산출 불가");
        }
        System.out.println(a+b+c);
        System.out.println(String.format("%.1f", Math.round((a+b+c)*10)/30.0));
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
        if ( h > 48000 || b > 32 || c > 5 || s > 6000) {
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
        System.out.println(((90-min)+4)/5+point);
        sc.close();
    }
    // 윤년 판별
    public static void Ex1166() {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year%400 == 0) {
            System.out.println("Leap");
        } else if (year%4 == 0 && year%100 != 0) {
            System.out.println("Leap");
        } else {
            System.out.println("Normal");
        }
        sc.close();
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

}
