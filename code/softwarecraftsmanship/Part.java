package com.fontys.softwarecraftsmanship;

public class Part {
    
    private final PartType type;
    private final DoubleWrapperFactory price;
    
    public Part(PartType type, StringWrapperFactory title, DoubleWrapperFactory price, StringWrapperFactory subtype, IntegerWrapperFactory size, DoubleWrapperFactory speed) {
        this.type = type;
        this.price = price;
    }
    
    // Memory
    public Part(PartType type, StringWrapperFactory title, DoubleWrapperFactory price, StringWrapperFactory subtype, IntegerWrapperFactory size) {
        this.type = type;
        this.price = price;
    }
    
    // Casing
    public Part(PartType type, StringWrapperFactory title, DoubleWrapperFactory price, StringWrapperFactory subtype) {
        this.type = type;
        this.price = price;
    }
    
    // Processor
    public Part(PartType type, StringWrapperFactory title, DoubleWrapperFactory price, DoubleWrapperFactory speed) {
        this.type = type;
        this.price = price;
    }
    
    // Motherboard
    public Part(PartType type, StringWrapperFactory title, DoubleWrapperFactory price) {
        this.type = type;
        this.price = price;
    }
    
    public DoubleWrapperFactory priceValue() {
        return price;
    }
    
    public BooleanWrapperFactory isCasing() {
        return BooleanWrapperFactory.createBooleanWrapperWithBoolean(this.type.equals(PartType.CASING));
    }
    
    public BooleanWrapperFactory isProcessor() {
        return BooleanWrapperFactory.createBooleanWrapperWithBoolean(this.type.equals(PartType.PROCESSOR));
    }
    
    public BooleanWrapperFactory isMemory() {
        return BooleanWrapperFactory.createBooleanWrapperWithBoolean(this.type.equals(PartType.MEMORY));
    }
    
    public BooleanWrapperFactory isMotherboard() {
        return BooleanWrapperFactory.createBooleanWrapperWithBoolean(this.type.equals(PartType.MOTHERBOARD));
    }
}
