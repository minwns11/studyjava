package com.sbmavenweb.study001;

import com.sbmavenweb.study001.mathexam.MathExam;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class exam001Test {
    @Test
    public void exam120803() throws Exception {
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
        assertThat(math.subTest001(2, 3)).isEqualTo(-1); //값:-1 값이 -1일 시 넘김
        assertThat(math.subTest001(100, 2)).isEqualTo(98);
        assertThat(math.subTest001(11, 4)).isEqualTo(7);
        assertThat(math.subTest001(100, 70)).isNotEqualTo(10); //값:30 값이 10일 시 잡음
        assertThat(math.subTest001(100, 70)).isLessThan(31); // 값:30 0이하 시 잡음
        // Exception 에외가 발생해야지만 정상 동작으로 인식한다.
        assertThatThrownBy(() -> math.subTest001(70000, 7))
                .isInstanceOf(Exception.class); // 타입비교(데이터 형식)
        //RuntimeException 예외가 발생해야지만 정상 동작으로 인식한다.
        // 이 값이 예외로 나갈 것이라 예상된다.
        Throwable exception = assertThrows(RuntimeException.class, () -> { // throw 를 검정함
            math.subTest001(77, 77777);
        });
        if (exception instanceof RuntimeException) {
        }
        System.out.println(exception.toString());
    }

    @Test
    public void exam120804() throws Exception {
        //given
        MathExam math = new MathExam();
        //when
        //then
        assertThat(math.mathTest002(3, 4)).isEqualTo(12);
        assertThat(math.mathTest002(27, 19)).isEqualTo(513);
        // Exception 에외가 발생해야지만 정상 동작으로 인식한다.
        assertThatThrownBy(() -> math.mathTest002(-1, 10))
                .isInstanceOf(Exception.class);
        //RuntimeException 예외가 발생해야지만 정상 동작으로 인식한다.
        Throwable exception = assertThrows(RuntimeException.class, () -> {
            math.mathTest002(10, 101);
        });
        System.out.println(exception.toString());
    }

    @Test
    public void exam120807() throws Exception {
        //given
        MathExam math = new MathExam();
        //when
        //then
        assertThat(math.mathTest003(2, 3)).isEqualTo(-1);
        assertThat(math.mathTest003(11, 11)).isEqualTo(1);
        assertThat(math.mathTest003(7, 99)).isEqualTo(-1);
        // Exception 예외가 발생해야지만 정상 동작으로 인식한다.
        assertThatThrownBy(() -> math.mathTest003(55555, 3)).isInstanceOf(Exception.class);
        //RuntimeException 예외가 발생해야지만 정상 동작으로 인식한다.
        Throwable exception = assertThrows(RuntimeException.class, () -> {
            math.mathTest003(3622, -1);
        });
        System.out.println(exception.toString());
    }

    @Test
    public void exam120817() throws Exception {
        MathExam math = new MathExam();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertThat(math.exam120817(numbers)).isEqualTo(5.5);
        assertThat(math.exam120817(new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99})).isEqualTo(94.0);
        assertThatThrownBy(() -> math.exam120817(new int[]{0, 1000, 2000}))
                .isInstanceOf(Exception.class);
        assertThatThrownBy(() -> math.exam120817(new int[]{}))
                .isInstanceOf(Exception.class);
        Throwable exception = assertThrows(Exception.class, () -> math.exam120817(new int[]{}));
        System.out.println(exception.toString());
    }

    @Test
    public void exam120820() throws Exception {
        MathExam math = new MathExam();
        assertThat(math.exam120820(40)).isEqualTo(1983);
        assertThat(math.exam120820(23)).isEqualTo(2000);
        assertThatThrownBy(() -> math.exam120820(121))
                .isInstanceOf(Exception.class);
        assertThatThrownBy(() -> math.exam120820(-1))
                .isInstanceOf(Exception.class);
    }

    @Test
    public void exam120829() throws Exception {
        MathExam math = new MathExam();
        assertThat(math.exam120829(70)).isEqualTo(1);
        assertThat(math.exam120829(90)).isEqualTo(2);
        assertThat(math.exam120829(91)).isEqualTo(3);
        assertThat(math.exam120829(180)).isEqualTo(4);
        assertThatThrownBy(() -> math.exam120829(181))
                .isInstanceOf(Exception.class);
    }

    @Test
    public void exam120831() throws Exception {
        MathExam math = new MathExam();
        assertThat(math.exam120831(10)).isEqualTo(30);
        assertThat(math.exam120831(4)).isEqualTo(6);
        assertThatThrownBy(() -> math.exam120831(1001))
                .isInstanceOf(Exception.class);
    }

    @Test
    public void exam120813() throws Exception {
        MathExam math = new MathExam();
        assertThat(math.exam120813(10)).isEqualTo(new int[]{1, 3, 5, 7, 9});
        assertThat(math.exam120813(15)).isEqualTo(new int[]{1, 3, 5, 7, 9, 11, 13, 15});
        assertThatThrownBy(() -> math.exam120813(1001))
                .isInstanceOf(Exception.class);
    }

    @Test
    public void exam120583() throws Exception {
        MathExam math = new MathExam();
        assertThat(math.exam120583(new int[]{1, 1, 2, 3, 4, 5}, 1)).isEqualTo(2);
        assertThat(math.exam120583(new int[]{0, 2, 3, 4}, 1)).isEqualTo(0);
        assertThatThrownBy(() -> math.exam120583(new int[]{1, 2, 3, 4}, 1001))
                .isInstanceOf(Exception.class);
    }

    @Test
    public void exam120585() throws Exception {
        MathExam math = new MathExam();
        assertThat(math.exam120585(new int[]{149, 180, 192, 170}, 167)).isEqualTo(3);
        assertThat(math.exam120585(new int[]{180, 120, 140}, 190)).isEqualTo(0);
        assertThatThrownBy(() -> math.exam120585(new int[]{180, 120, 140}, 201))
                .isInstanceOf(Exception.class);
    }

    @Test
    public void exam120837() throws Exception {
        MathExam math = new MathExam();
        assertThat(math.exam120837(23)).isEqualTo(5);
        assertThat(math.exam120837(24)).isEqualTo(6);
        assertThat(math.exam120837(999)).isEqualTo(201);
        assertThatThrownBy(() -> math.exam120837(1.5))
                .isInstanceOf(Exception.class);
        assertThatThrownBy(() -> math.exam120837(1001))
                .isInstanceOf(Exception.class);

    }

    @Test
    public void exam120818() throws Exception {
        MathExam math = new MathExam();
        assertThat(math.exam120818(150000)).isEqualTo(142500);
        assertThat(math.exam120818(580000)).isEqualTo(464000);
        assertThatThrownBy(() ->math.exam120818(1000001))
                .isInstanceOf(Exception.class);
    }
}