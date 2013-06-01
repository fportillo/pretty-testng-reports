package br.com.almana;

import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.Test;

public class AppTest {
    @Test
    public void testFail() {
        assertTrue("Example of failing test", false);
    }

    @Test
    public void testPass() {
        assertTrue("Example of passing test", true);
    }

}
