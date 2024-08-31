package aqulum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public abstract class BaseTest {
    @Autowired
    protected StringTest stringTest;

    public void setStringTest(StringTest stringTest) {
        this.stringTest = stringTest;
    }
}