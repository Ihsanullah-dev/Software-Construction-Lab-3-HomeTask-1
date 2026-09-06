package Calculator1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;

public class Calculator1Test {

    private Calculator1 calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator1();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    void testPower() {
        assertEquals(8, calculator.power(2, 3));
    }

    @Test
    void testPowerWithZeroExponent() {
        assertEquals(1, calculator.power(5, 0));
    }

    @Test
    void testModulus() {
        assertEquals(1, calculator.modulus(10, 3));
    }

    @Test
    void testModulusZero() {
        assertThrows(
            IllegalArgumentException.class,
            () -> calculator.modulus(10, 0)
        );
    }
}