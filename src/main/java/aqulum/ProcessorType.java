package aqulum;

public enum ProcessorType {
    Advance("advanceProcessor"), Basic("basicProcessor");

    private final String name;
    ProcessorType(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
