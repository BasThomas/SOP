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
public class BooleanWrapperFactory {
    private final boolean _boolean;
    
    private BooleanWrapperFactory(boolean _boolean) {
        this._boolean = _boolean;
    }
    
    static public BooleanWrapperFactory createBooleanWrapperWithBoolean(boolean _boolean) {
        return new BooleanWrapperFactory(_boolean);
    }
    
    public boolean booleanValue() {
        return this._boolean;
    }
}
