import static org.junit.jupiter.api.Assertions.*;

class RecursionTest {
    Recursion recursion = new Recursion();
    @org.junit.jupiter.api.Test
    void recurse() {
        assertEquals("h*e*ll*o", recursion.recurse("hello"));
        assertEquals("a*bc", recursion.recurse("abc"));
        assertEquals("h*e*a*l*o", recursion.recurse("healo"));
    }
}