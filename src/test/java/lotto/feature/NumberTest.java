package lotto.feature;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberTest {
    private int lottoMinValue = 1;
    private int lottoMaxValue = 45;
    private int lottoMaxNumber = 6;

    private Set<Integer> lottoNumberList;

    @Test
    void validLottoNumber() {
        int generatedLottoNumber = generateLottoNumber();

        assertTrue(generatedLottoNumber >= lottoMinValue && generatedLottoNumber <= lottoMaxValue);
    }

    @RepeatedTest(5000)
    void checkLottoNumberInvalidLength() {
        lottoNumberList = new HashSet<>();

        while(lottoNumberList.size() < lottoMaxNumber) {
            int generatedLottoNumber = generateLottoNumber();

            lottoNumberList.add(generatedLottoNumber);
        }

        int generatedLottoNumberLength = lottoNumberList.size();

        assertEquals(lottoMaxNumber, generatedLottoNumberLength);
    }

    private int generateLottoNumber() {
        double randomNumber = (int) (Math.random() * ((lottoMaxValue - lottoMinValue) + 1)) + lottoMinValue;
        int parsedRandomNumber = (int) randomNumber;

        return parsedRandomNumber;
    }
}