import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import com.Passenger;
import org.junit.jupiter.api.Test;

public class PassengerTest {

    @BeforeAll
    static void printStart() {
        System.out.println("Starting com.Passenger class tests");
    }

    @AfterAll
    static void printEnd() {
        System.out.println("Tests complete");
    }

    @Test
    void testCreateValidPassenger() {
        Assertions.assertDoesNotThrow(() ->new Passenger(
                "Mr",
                "Daniel Fitzgerald",
                "123456789A",
                "08737576739",
                32
                ));
    }

    @Test
    void testCreatePassengerWithInvalidTitle() {
        Exception exceptionThrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Passenger(
                    "Sir",
                    "Daniel Fitzgerald",
                    "123456789A",
                    "08737576739",
                    32
            );
        });

        Assertions.assertEquals("Invalid Title entered", exceptionThrown.getMessage());
    }

    @Test
    void testCreatePassengerWithInvalidName() {
        Exception exceptionThrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Passenger(
                    "Mr",
                    "Da",
                    "123456789A",
                    "08737576739",
                    32
            );
        });

        Assertions.assertEquals("Invalid name entered", exceptionThrown.getMessage());
    }

    @Test
    void testCreatePassengerWithInvalidID() {
        Exception exceptionThrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Passenger(
                    "Mr",
                    "Daniel Fitzgerald",
                    "123456789",
                    "08737576739",
                    32
            );
        });

        Assertions.assertEquals("Invalid ID length entered", exceptionThrown.getMessage());
    }

    @Test
    void testCreatePassengerWithInvalidPhone() {
        Exception exceptionThrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Passenger(
                    "Mr",
                    "Daniel Fitzgerald",
                    "123456789A",
                    "087375767",
                    32
            );
        });

        Assertions.assertEquals("Invalid phone entered", exceptionThrown.getMessage());
    }

    @Test
    void testCreatePassengerWithInvalidAge() {
        Exception exceptionThrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Passenger(
                    "Mr",
                    "Daniel Fitzgerald",
                    "123456789A",
                    "08737576739",
                    15
            );
        });

        Assertions.assertEquals("Invalid age entered", exceptionThrown.getMessage());
    }
}
