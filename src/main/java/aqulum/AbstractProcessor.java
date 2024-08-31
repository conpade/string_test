package aqulum;

public abstract class AbstractProcessor implements Processor {

    protected Modifier modifier;

    @Override
    public ProcessResult run(String input) {
        ProcessResult processResult = new ProcessResult();
        StringBuilder output = new StringBuilder();
        int indexLeft = 0;
        int indexRight = 0;
        int len = input.length();
        while (indexLeft < len) {
            Character character = input.charAt(indexLeft);

            int repeatCount = 1;
            for (indexRight = indexLeft + 1; indexRight < len; indexRight++, repeatCount++) {
                Character characterNext = input.charAt(indexRight);
                if (!character.equals(characterNext)) {
                    break;
                }
            }

            if (repeatCount < 3) {
                output.append(character.toString().repeat(repeatCount));
            } else {
                modifier.modify(output, character, repeatCount);
            }
            indexLeft = indexRight;
        }

        if (output.length() != len) {
            processResult.setTriggered(true);
        }
        processResult.setOutput(output.toString());

        return processResult;
    }
}
