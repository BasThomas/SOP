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
public class StringWrapperFactory {
    
    private final String string;
    
    private StringWrapperFactory(String string) {
        this.string = string;
    }
    
    static public StringWrapperFactory createStringWrapperWithString(String string) {
        return new StringWrapperFactory(string);
    }
    
    public String stringValue() {
        return this.string;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        
        StringWrapperFactory compareTo = (StringWrapperFactory) obj;
        return (this.string == null ? compareTo.string == null : this.string.equals(compareTo.string));
    }
}
