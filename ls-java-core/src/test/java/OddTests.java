import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static ru.ls.qa.school.core.OddTask.isOdd;

public class OddTests {

    @Test
    public void testFalseBooleanOdds() {
        int testNumber = 10;

        assertFalse(isOdd(testNumber));
    }

    @Test
    public void testTrueBooleanOdds() {
        int testNumber2 = 11;

        assertTrue(isOdd(testNumber2));
    }

    @Test
    public void testForZeroValue() {
        int zeroNumber = 0;

        assertFalse(isOdd(zeroNumber));
    }

}
