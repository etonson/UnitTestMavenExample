package lab;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    @author : Eton.lin
    @description TODO
    @date 2025-01-21 上午 01:43
*/
public class CaculatorTest {
    @Test
    @DisplayName("1+1=2")
    void addTwoNumber() {
        assertEquals(2, Caculator.add(1, 1));
    }

    @Test
    @DisplayName("1-1=0")
    void subTwoNumber() {
        assertEquals(0, Caculator.subtract(1, 1));
    }
}
