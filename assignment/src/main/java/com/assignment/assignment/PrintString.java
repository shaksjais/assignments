/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment.assignment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author zadmin
 */
@Configuration
public class PrintString {
    @Bean
    public void printText() {
        System.out.println("Hello World");
    }
}
