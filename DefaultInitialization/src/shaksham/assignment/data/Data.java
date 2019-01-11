/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shaksham.assignment.data;

/**
 *
 * @author zadmin
 */
public class Data {
    
    int i;
    char ch;

    public void print() {
        /* Variables are assigned default values and those values are printed below */
        System.out.println("Integer:  " + i);
        System.out.println("Character:  " + ch);
    }

    public void printLocal() {
        int localVariable;
        char charVariable;
        /*
           variable localVariable might not have been initialized
        System.out.println("Printing localvariables"+ localVariable+"   "+charVariable);
         */
    }
    
}
