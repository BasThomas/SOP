package com.fontys.softwarecraftsmanship;

import java.util.*;

public class Computer {
    
    PartsWrapperFactory parts = PartsWrapperFactory.createPartsWrapperWithoutParts();
    
    public void addPart(Part part) {
        if (part == null) {
            return;
        }
        
        parts.add(part);
    }
    
    public DoubleWrapperFactory priceValue() {
        DoubleWrapperFactory price = DoubleWrapperFactory.createDoubleWrapperWithDouble(0.0);

        for (IntegerWrapperFactory index = IntegerWrapperFactory.createIntWrapperWithInt(0); index.smallerThan(this.parts.size()).booleanValue(); index = index.plus(IntegerWrapperFactory.createIntWrapperWithInt(1))) {
            Part part = parts.partAtIndex(index);
            price = price.plus(part.priceValue());
        }
        
        return price;
    }
    
    public BooleanWrapperFactory isComplete() {
        if (this.parts.size().smallerThan(IntegerWrapperFactory.createIntWrapperWithInt(4)).booleanValue()) {
            return BooleanWrapperFactory.createBooleanWrapperWithBoolean(false);
        }
        
        BooleanWrapperFactory hasCasing = BooleanWrapperFactory.createBooleanWrapperWithBoolean(false);
        BooleanWrapperFactory hasProcessor = BooleanWrapperFactory.createBooleanWrapperWithBoolean(false);
        BooleanWrapperFactory hasMemory = BooleanWrapperFactory.createBooleanWrapperWithBoolean(false);
        BooleanWrapperFactory hasMotherboard = BooleanWrapperFactory.createBooleanWrapperWithBoolean(false);
        
        for (IntegerWrapperFactory index = IntegerWrapperFactory.createIntWrapperWithInt(0); index.smallerThan(this.parts.size()).booleanValue(); index = index.plus(IntegerWrapperFactory.createIntWrapperWithInt(1))) {
            Part part = parts.partAtIndex(index);
            hasCasing = (hasCasing.booleanValue()) ? hasCasing : part.isCasing();
            hasProcessor = (hasProcessor.booleanValue()) ? hasProcessor : part.isProcessor();
            hasMemory = (hasMemory.booleanValue()) ? hasMemory : part.isMemory();
            hasMotherboard = (hasMotherboard.booleanValue()) ? hasMotherboard : part.isMotherboard();
        }
        
        return BooleanWrapperFactory.createBooleanWrapperWithBoolean(hasCasing.booleanValue() && hasProcessor.booleanValue() && hasMemory.booleanValue() && hasMotherboard.booleanValue());
    }
}