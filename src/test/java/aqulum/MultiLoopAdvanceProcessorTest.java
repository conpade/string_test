package aqulum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiLoopAdvanceProcessorTest extends BaseTest {
    @Test
    public void twoLoop() {
        String output = stringTest.advance("zzzyya");
        Assertions.assertEquals(output, "xa");

        String output2 = stringTest.advance("aaaazzg");
        Assertions.assertEquals(output2, "yg");

        String output3 = stringTest.advance("yyyyyyyyyyyyyyyyyyyyyyyyyyyy");
        Assertions.assertEquals(output3, "x");
    }

    @Test
    public void threeLoop() {
        String output = stringTest.advance("aazzaaayzzaaab");
        Assertions.assertEquals(output, "aaxb");

        String output2 = stringTest.advance("axxxxxxxxxxxxxyyyyyyyyyyyyyyyyyyyyyyyyyyyyxyyyyyyyyyyyyyyyyyyyyyyb");
        Assertions.assertEquals(output2, "awwb");
    }
}
