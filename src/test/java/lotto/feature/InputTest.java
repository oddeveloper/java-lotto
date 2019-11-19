package lotto.feature;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class InputTest {
    private int integerInput = 1000;
    private String stringInput = "1000";
    private String invalidStringInput = "로또100";

    private Pattern lottoPattern = Pattern.compile("([0-9]{1,6})");

    @Test
    void checkValidIntegerInput() {
        String parsedIntegerInput = String.valueOf(integerInput);
        Matcher matcher = lottoPattern.matcher(parsedIntegerInput);

        boolean result = matcher.matches();
        assertTrue(result);
    }

    @Test
    void checkValidStringInput() {
        Matcher matcher = lottoPattern.matcher(stringInput);

        boolean result = matcher.matches();
        assertTrue(result);
    }

    @Test
    void checkInvalidStringInput() {
        Matcher matcher = lottoPattern.matcher(invalidStringInput);

        boolean result = matcher.matches();
        assertTrue(result);
    }
}