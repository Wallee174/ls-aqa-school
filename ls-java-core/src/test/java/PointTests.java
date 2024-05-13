import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import ru.ls.qa.school.core.Point;

public class PointTests {

    @Test
    public void testDistanceCalculation() {
        Point point1 = new Point(3, 8);
        Point point2 = new Point(5, 9);

        double expectedDistance = 2.23;
        double actualDistance = point1.distance(point2);

        assertEquals(expectedDistance, actualDistance, 0.01);
    }

    @Test
    public void testDistanceWithSamePoints() {
        Point point1 = new Point(2, 3);

        double expectedDistance = 0.0;
        double actualDistance = point1.distance(point1);

        assertEquals(expectedDistance, actualDistance, 0.01);
    }

    @Test
    public void testDistanceWithNegativeCoordinates() {
        Point point1 = new Point(-3, -9);
        Point point2 = new Point(-6, -15);

        double expectedDistance = 6.70;
        double actualDistance = point1.distance(point2);

        assertEquals(expectedDistance, actualDistance, 0.01);
    }
}
