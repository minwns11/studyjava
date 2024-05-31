package com.sbmavenweb.study001;

import com.sbmavenweb.study001.mathexam.MathExam;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class exam001Test {
    @Test
    public void subtract001() throws Exception {
        MathExam math = new MathExam();
        // given        테스트 하기 위한 준비 동작
        // int num1 = 2;
        // int num2 = 3;
        // int expected = -1;

        // when         테스트 실시
        // try {
        //    int actual = subTest001(num1, num2);
        //} catch (Exception ex) { }

        // then         실제값과 기대값을 비교해서 테스트한다.
        assertThat(-1).isEqualTo(math.subTest001(2, 3)); //값:-1 값이 -1일 시 넘김
        assertThat(98).isEqualTo(math.subTest001(100, 2));
        assertThat(7).isEqualTo(math.subTest001(10, 3));
        assertThat(10).isNotEqualTo(math.subTest001(100, 70)); //값:30 값이 10일 시 잡음
        assertThat(0).isLessThan(math.subTest001(100, 70)); // 값:30 0이하 시 잡음
        // Exception 에외가 발생해야지만 정상 동작으로 인식한다.
        assertThatThrownBy(() -> math.subTest001(70000, 7))
                .isInstanceOf(Exception.class);
        //RuntimeException 예외가 발생해야지만 정상 동작으로 인식한다.
        Throwable exception = assertThrows(RuntimeException.class, () -> {
            math.subTest001(2330, 50002);
        });
        System.out.println(exception.toString());
    }

    @Test
    public void multiply001() throws Exception {
        //given
        MathExam math = new MathExam();
        //when
        //then
        assertThat(12).isEqualTo(math.mathTest002(3, 4));
        assertThat(513).isEqualTo(math.mathTest002(27, 19));
        // Exception 에외가 발생해야지만 정상 동작으로 인식한다.
        assertThatThrownBy(() -> math.mathTest002(-1, 10))
                .isInstanceOf(Exception.class);
        //RuntimeException 예외가 발생해야지만 정상 동작으로 인식한다.
        Throwable exception = assertThrows(Exception.class, () -> {
            math.mathTest002(10, 101);
        });
        System.out.println(exception.toString());
    }
}
