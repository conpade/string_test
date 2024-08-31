package aqulum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiLoopBasicProcessorTest extends BaseTest {
    @Test
    public void twoLoop() {
        String output = stringTest.basic("aabaaabb");
        Assertions.assertEquals(output, "aa");

        String output2 = stringTest.basic("abaaabbc");
        Assertions.assertEquals(output2, "ac");
    }

    @Test
    public void threeLoop() {
        String output = stringTest.basic("aaccbaaabbcc");
        Assertions.assertEquals(output, "aa");

        String output2 = stringTest.basic("aaccbaaabbccd");
        Assertions.assertEquals(output2, "aad");

        String output3 = stringTest.basic("aabaaabbac");
        Assertions.assertEquals(output3, "c");
    }
}
