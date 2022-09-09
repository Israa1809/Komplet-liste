import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    Stack stack = new Stack();

    @Test
    void pushTest() {
        stack.push("Halløjsa");
        stack.push("frække");
        stack.push("hvordan");
        stack.push("går");
        stack.push("det");
        assertEquals("Halløjsa", stack.showStack());
    }

    @Test
    void popTest() {
        stack.push("Halløjsa");
        stack.push("frække");
        stack.push("hvordan");
        stack.push("går");
        stack.push("det");
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        assertEquals("Halløjsa", stack.showStack());
    }

    @Test
    void showStackTest() {

    }
}