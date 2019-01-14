/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package second;

/**
 *
 * @author zadmin
 */
public class Second {
    private int a;
    private String x;
    Second(String s) {
        x = s;
        System.out.println("Called first constructor string "+ s);
    }
    
    Second(int b) {
        this("Hello World");
        a = b;
        System.out.println("Called second constructor int "+ b);
      
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Second s1 = new Second(1);
        Second s2 = new Second("Overloading");
    }
    
}
