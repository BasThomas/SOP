/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fontys.softwarecraftsmanship;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bas
 */
public class PartsWrapperFactory {
    private final ArrayList<Part> parts;
    
    private PartsWrapperFactory() {
        this.parts = new ArrayList<>();
    }
    
    private PartsWrapperFactory(ArrayList<Part> parts) {
        this.parts = parts;
    }
    
    static public PartsWrapperFactory createPartsWrapperWithParts(ArrayList<Part> parts) {
        return new PartsWrapperFactory(parts);
    }
    
    static public PartsWrapperFactory createPartsWrapperWithoutParts() {
        return new PartsWrapperFactory();
    }
    
    public List<Part> partListValue() {
        return this.parts;
    }
    
    public BooleanWrapperFactory add(Part part) {
        return BooleanWrapperFactory.createBooleanWrapperWithBoolean(this.parts.add(part));
    }
    
    public IntegerWrapperFactory size() {
        return IntegerWrapperFactory.createIntWrapperWithInt(this.parts.size());
    }
    
    public Part partAtIndex(IntegerWrapperFactory index) {
        return this.parts.get(index.intValue());
    }
}
