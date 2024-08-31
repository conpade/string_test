package aqulum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SingleLoopBasicProcessorTest extends BaseTest {
    @Test
    public void oneChar() {
        String output = stringTest.basic("a");
        Assertions.assertEquals(output, "a");

        String output2 = stringTest.basic("aa");
        Assertions.assertEquals(output2, "aa");

        String output3 = stringTest.basic("aaa");
        Assertions.assertEquals(output3, "");

        String output4 = stringTest.basic("aaaa");
        Assertions.assertEquals(output4, "");
    }

    @Test
    public void multiChar(){
        String output5 = stringTest.basic("aabbb");
        Assertions.assertEquals(output5, "aa");

        String output6 = stringTest.basic("aab");
        Assertions.assertEquals(output6, "aab");

        String output7 = stringTest.basic("aaabb");
        Assertions.assertEquals(output7, "bb");
    }

}
