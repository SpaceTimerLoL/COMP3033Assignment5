import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoundedQueueTest {

    private BoundedQueue bq;

    @BeforeEach
    public void testConstructor() {
        this.bq = new BoundedQueue(3);
    }

    @Test
    public void testEnQueue() {
        String testString1 = "Test One";
        this.bq.enQueue(testString1);
        Assertions.assertFalse(bq.isEmpty());
    }

    @Test
    public void testDeQueue() {
        String testString1 = "Test One";
        this.bq.enQueue(testString1);
        Assertions.assertEquals(testString1, this.bq.deQueue());
        Assertions.assertTrue(this.bq.isEmpty());
    }

    @Test
    public void testIsEmpty() {

        String testString1;
        testString1 = "Test One";

        this.bq.enQueue(testString1);
        Assertions.assertFalse(this.bq.isEmpty());
        this.bq.deQueue();
        Assertions.assertTrue(this.bq.isEmpty());

    }

    @Test
    public void testIsFull() {

        String testString1, testString2, testString3;

        testString1 = "Test One";
        testString2 = "Test Two";
        testString3 = "Test Three";

        this.bq.enQueue(testString1);
        Assertions.assertFalse(this.bq.isFull());
        this.bq.enQueue(testString2);
        this.bq.enQueue(testString3);
        Assertions.assertTrue(this.bq.isFull());

    }

    @Test
    public void testToString() {

        String testString1, testString2, testString3;

        testString1 = "Test One";
        testString2 = "Test Two";
        testString3 = "Test Three";

        this.bq.enQueue(testString1);
        this.bq.enQueue(testString2);
        this.bq.enQueue(testString3);
        Assertions.assertEquals("[Test One, Test Two, Test Three]", this.bq.toString());

    }
}
