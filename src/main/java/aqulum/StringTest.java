package aqulum;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class StringTest {
    private Processor basicProcessor;
    private Processor advanceProcessor;

    public StringTest(@Qualifier(BasicProcessor.NAME) Processor basicProcessor, @Qualifier(AdvanceProcessor.NAME) Processor advanceProcessor){
        this.basicProcessor = basicProcessor;
        this.advanceProcessor = advanceProcessor;
    }

    public String basic(String input){
        return generalProcess(basicProcessor, input);
    }

    public String advance(String input){
        return generalProcess(advanceProcessor, input);
    }

    public String generalProcess(Processor processor, String input){
        ProcessResult processResult;
        do {
            processResult = processor.run(input);
            input = processResult.getOutput();
        }
        while(processResult.isTriggered());

        return processResult.getOutput();
    }
}
