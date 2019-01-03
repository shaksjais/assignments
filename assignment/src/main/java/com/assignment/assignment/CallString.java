/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment.assignment;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author zadmin
 */
public class CallString {
    @Autowired
    PrintString printString;
    public void callString() {
        printString.printText();
    }
    
}
