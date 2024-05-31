package com.sbmavenweb.study001;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class exam000Test {
    @Test
    public void subtract001() throws Exception {
        // given        테스트 하기 위한 준비 동작
        int num1 = 2;
        int num2 = 3;
        int expected = -1;

        // when         테스트 실시
        try {
            int actual = subTest001(num1, num2);
        } catch (Exception ex) {

        }
        // then         실제값과 기대값을 비교해서 테스트한다.
        assertThat(-1).isEqualTo(subTest001(2, 3)); //값:-1 값이 -1일 시 넘김
        assertThat(98).isEqualTo(subTest001(100, 2));
        assertThat(7).isEqualTo(subTest001(10, 3));
        assertThat(10).isNotEqualTo(subTest001(100, 70)); //값:30 값이 10일 시 잡음
        assertThat(0).isLessThan(subTest001(100, 70)); // 값:30 0이하 시 잡음

        //assertThat(actual).isEqualTo(expected).describedAs("실제값과 다름");
    }
    int subTest001(int n1, int n2) throws Exception {
        if (n1 < -50000 || n1 > 50000) {
            throw new Exception("num1 값은 -50000보다 작거나, num1 값은 50000보다 큽니다..");
        }
        if (n2 < -50000 || n2 > 50000) {
            throw new RuntimeException("num2 값은 -50000보다 작거나, num2 값은 50000보다 큽니다..");
        }
        return n1 - n2;
    }
}
