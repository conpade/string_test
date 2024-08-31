package aqulum;

import org.springframework.stereotype.Component;

@Component(BasicProcessor.NAME)
public class BasicProcessor extends AbstractProcessor {
    public static final String NAME = "BasicProcessor";

    public BasicProcessor(){
        modifier = (output, character, repeatCount) -> {};
    }
}
