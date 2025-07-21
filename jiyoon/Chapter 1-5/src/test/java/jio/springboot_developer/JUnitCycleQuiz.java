package jio.springboot_developer;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JUnitCycleQuiz {

    @Test
    public void junitQuiz3(){
        System.out.println("This is a first test");
    }

    @Test
    public void junitQuiz4(){
        System.out.println("This is a second test");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("Hello!");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("Bye!");
    }
}
