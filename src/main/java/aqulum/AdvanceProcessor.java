package aqulum;

import org.springframework.stereotype.Component;

@Component(AdvanceProcessor.NAME)
public class AdvanceProcessor extends AbstractProcessor {
    public static final String NAME = "AdvanceProcessor";

    public AdvanceProcessor(){
        modifier = (output, character, repeatCount) -> {
            if(character == 'a'){
                output.append('z');
            } else {
                output.append((char)((int)character-1));
            }
        };
    }
}
