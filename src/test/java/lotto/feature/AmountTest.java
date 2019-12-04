package lotto.feature;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class AmountTest {
    private int lottoMinAmount = 1000;
    private int lottoMaxAmount = 100000;

    private int inputAmount = 14000;
    private int userMaxAmount = 100000;

    @Test
    void amount() {
        int lottoCount = inputAmount / lottoMinAmount;
        assertEquals(14, lottoCount);
    }

    @Test
    void wrongAmount() {
        int lottoCount = inputAmount / lottoMinAmount;
        assertEquals(15, lottoCount);
    }

    @Test
    void checkMaxAmount() {
        boolean result = userMaxAmount <= lottoMaxAmount;

        assertTrue(result);
    }

    @Test
    void wrongCheckMaxAmount() {
        userMaxAmount = 200000;
        boolean result = userMaxAmount <= lottoMaxAmount;

        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 0, 1000, 10000, 110000})
    void possibleLottoPurchaseAmount(int userInputAmount) {
        assertTrue(userInputAmount >= lottoMinAmount && userInputAmount <= lottoMaxAmount);
    }

    @Test
    void checkLottoCountByAmount() {
        int userLottoCount = 2;

        int lottoAmount = userLottoCount * lottoMinAmount;

        assertEquals(2000, lottoAmount);
        assertTrue(lottoAmount >= lottoMinAmount && lottoAmount <= lottoMaxAmount);
    }
}