package lab.pacaages.packageA;

import lab.Caculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassATest
{
    @Tag("production")
    @Test
    @DisplayName("testCaseA inside ClassATest inside packageA")
    public void testCaseA() {

    }

    @Test
    @DisplayName("1+1=2")
    void addTwoNumber() {
        assertEquals(2, Caculator.add(1, 1));
    }
}