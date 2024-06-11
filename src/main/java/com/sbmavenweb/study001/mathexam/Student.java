package com.sbmavenweb.study001.mathexam;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    // 멤버변수는 무조건 private, Getter, Setter 를 만들어서 사용해야 한다.
    private String name;
    private int score;

    @Override
    public String toString() {
        return String.format("%s:%d, %s", name, score, super.toString());
    }

}
