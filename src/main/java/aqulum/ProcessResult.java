package aqulum;

public class ProcessResult {
    private String output;

    private boolean isTriggered;

    public ProcessResult(){
        output = "";
        isTriggered = false;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public boolean isTriggered() {
        return isTriggered;
    }

    public void setTriggered(boolean triggered) {
        isTriggered = triggered;
    }
}
