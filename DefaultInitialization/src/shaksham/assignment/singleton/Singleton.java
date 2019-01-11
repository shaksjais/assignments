/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shaksham.assignment.singleton;

/**
 *
 * @author zadmin
 */
public class Singleton {
    
    public String stringVariable;
    public static Singleton print(String param)
    {

        /*
           non-static variable cannot be referenced from static method
        stringVariable=param;
        */
        return new Singleton();
}
    
}
