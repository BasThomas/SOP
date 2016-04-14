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
public class IntegerWrapperFactory {
    private final int _int;
    
    private IntegerWrapperFactory(int _int) {
        this._int = _int;
    }
    
    static public IntegerWrapperFactory createIntWrapperWithInt(int _int) {
        return new IntegerWrapperFactory(_int);
    }
    
    public int intValue() {
        return this._int;
    }
    
    public BooleanWrapperFactory smallerThan(IntegerWrapperFactory iwf) {
        return BooleanWrapperFactory.createBooleanWrapperWithBoolean(this._int < iwf._int);
    }
    
    public IntegerWrapperFactory plus(IntegerWrapperFactory iwf) {
        return IntegerWrapperFactory.createIntWrapperWithInt(this._int + iwf._int);
    }
}
