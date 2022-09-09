import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KøTest {
    Kø queue = new Kø();
    @Test
    void add() {
        queue.add("Jeg");
        queue.add("Hader");
        queue.add("datastrukturer");
        queue.add(":D");
        assertEquals("Jeg Hader datastrukturer :D",queue.liste.printFromHead());
    }

    @Test
    void pull() {
        queue.add("Jeg");
        queue.add("Hader");
        queue.add("datastrukturer");
        queue.add(":D");
        queue.pull();
        queue.pull();
        queue.pull();
        assertEquals(":D",queue.liste.printFromHead());
        }

    @Test
    void showQueue() {
        queue.add("Jeg");
        queue.add("Hader");
        queue.add("datastrukturer");
        queue.add(":D");
        assertEquals("Jeg Hader datastrukturer :D", queue.showQueue());
    }
}