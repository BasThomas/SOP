/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fontys.softwarecraftsmanship;

/**
 *
 * @author bas
 */
public class DoubleWrapperFactory {
    private final double _double;
    
    private DoubleWrapperFactory(double _double) {
        this._double = _double;
    }
    
    static public DoubleWrapperFactory createDoubleWrapperWithDouble(double _double) {
        return new DoubleWrapperFactory(_double);
    }
    
    public double doubleValue() {
        return this._double;
    }
    
    public DoubleWrapperFactory plus(DoubleWrapperFactory dwf) {
        return DoubleWrapperFactory.createDoubleWrapperWithDouble(this._double + dwf._double);
    }
    
    public StringWrapperFactory toStringWrapperFactory() {
        return StringWrapperFactory.createStringWrapperWithString(Double.toString(this._double));
    }
}
