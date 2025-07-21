package jio.springboot_developer;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class JUnitQuiz {
    @Test
    public void junitTest(){
        String name1= "홍길동";
        String name2 = "홍길동";
        String name3 = "홍길동";

        //모든 변수가 null인지 아닌지 확인
        assertThat(name1).isNotNull();
        assertThat(name2).isNotNull();
        assertThat(name3).isNotNull();

        //name1과 name2가 같은지 확인
        assertThat(name1).isEqualTo(name2);

        //name1과 name3가 다른지 확인
        //assertThat(name1).isNotEqualTo(name3);
    }

    @Test
    public void junitTest2(){
        int num1=15;
        int num2= 0;
        int num3= -15;

        //num1은 양수인지 확인
        assertThat(num1).isPositive();

        //num2은 0인지 확인
        assertThat(num2).isZero();

        //num3은 음수인지 확인
        assertThat(num3).isNegative();

        //num1은 num2보다 큰지 확인
        assertThat(num1).isGreaterThan(num2);

        //num3은 num2보다 작은지 확인
        assertThat(num3).isLessThan(num2);
    }
}
