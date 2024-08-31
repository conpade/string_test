package aqulum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SingleLoopAdvancedProcessorTest extends BaseTest {
    @Test
    public void oneChar() {
        String output = stringTest.advance("a");
        Assertions.assertEquals(output, "a");

        String output2 = stringTest.advance("aa");
        Assertions.assertEquals(output2, "aa");

        String output3 = stringTest.advance("aaa");
        Assertions.assertEquals(output3, "z");

        String output4 = stringTest.advance("aaaa");
        Assertions.assertEquals(output4, "z");

        String output5 = stringTest.advance("zzz");
        Assertions.assertEquals(output5, "y");
    }

    @Test
    public void multiChar(){
        String output5 = stringTest.advance("abbb");
        Assertions.assertEquals(output5, "aa");

        String output6 = stringTest.advance("aab");
        Assertions.assertEquals(output6, "aab");

        String output7 = stringTest.advance("aaabb");
        Assertions.assertEquals(output7, "zbb");
    }

}
