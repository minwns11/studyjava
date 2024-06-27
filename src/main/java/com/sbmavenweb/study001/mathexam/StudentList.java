package com.sbmavenweb.study001.mathexam;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StudentList {

    private String code;
    private int num;
    private String name;

    public StudentList(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }
}
