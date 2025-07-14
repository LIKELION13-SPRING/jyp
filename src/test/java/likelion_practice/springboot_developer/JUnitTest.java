package likelion_practice.springboot_developer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JUnitTest {
    @DisplayName("Test")
    @Test
    public void insertTest(){
        int a=1;
        int b=2;
        int sum=3;

        assertThat(a+b).isEqualTo(sum);
    }
}
