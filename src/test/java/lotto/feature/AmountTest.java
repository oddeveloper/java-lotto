package lotto.feature;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AmountTest {
    private int lottoAmount = 1000;
    private int inputAmount = 14000;

    private int userMaxAmount = 100000;
    private int maxAmount = 100000;

    @Test
    void amount() {
        int lottoCount = inputAmount / lottoAmount;
        assertEquals(14, lottoCount);
    }

    @Test
    void wrongAmount() {
        int lottoCount = inputAmount / lottoAmount;
        assertEquals(15, lottoCount);
    }

    @Test
    void checkMaxAmount() {
        boolean result = userMaxAmount <= maxAmount;

        assertTrue(result);
    }

    @Test
    void wrongCheckMaxAmount() {
        userMaxAmount = 200000;
        boolean result = userMaxAmount <= maxAmount;

        assertFalse(result);
    }
}