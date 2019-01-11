/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shaksham.assignment.main;

import shaksham.assignment.data.Data;
import shaksham.assignment.singleton.Singleton;
/**
 *
 * @author zadmin
 */
public class Main {
    public static void main(String[] args) {
        Data d = new Data();
        d.print();
        d.printLocal();
        
        Singleton s = new Singleton();
        s.print("Hello World");
    }
    
}
