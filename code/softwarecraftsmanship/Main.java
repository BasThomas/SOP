package com.fontys.softwarecraftsmanship;

public class Main {

    public static void main(String[] args) {
        
        Computer computer = new Computer();
        
        computer.addPart(new Part(
                PartType.CASING, 
                StringWrapperFactory.createStringWrapperWithString("Cooler Master Centurion 6"), 
                DoubleWrapperFactory.createDoubleWrapperWithDouble(49.50), 
                StringWrapperFactory.createStringWrapperWithString("Midi tower")));
        computer.addPart(new Part(
                PartType.PROCESSOR, 
                StringWrapperFactory.createStringWrapperWithString("Intel i7-4790"), 
                DoubleWrapperFactory.createDoubleWrapperWithDouble(295.0), 
                DoubleWrapperFactory.createDoubleWrapperWithDouble(3.6)));
        computer.addPart(new Part(
                PartType.MEMORY, 
                StringWrapperFactory.createStringWrapperWithString("G.SKILL Ripjaws X Series"), 
                DoubleWrapperFactory.createDoubleWrapperWithDouble(99.99), 
                StringWrapperFactory.createStringWrapperWithString("DDR3"), 
                IntegerWrapperFactory.createIntWrapperWithInt(16)));
        computer.addPart(new Part(
                PartType.MOTHERBOARD, 
                StringWrapperFactory.createStringWrapperWithString("MSI H97 PC MATE - Socket 1150 - ATX"), 
                DoubleWrapperFactory.createDoubleWrapperWithDouble(89.0)));
        
        System.out.println((computer.isComplete().booleanValue()) ? "Total price is EUR " + computer.priceValue().doubleValue() : "Your computer is not ready yet...");
    }
}
