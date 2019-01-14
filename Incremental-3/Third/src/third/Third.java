/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package third;

/**
 *
 * @author zadmin
 */

interface One {
    void aMethod();
    void bMethod();
}

interface Two {
    void cMethod();
    void dMethod();
}

interface Three {
    void eMethod();
    void fMethod();
}

interface Fourth extends One, Two, Three {
    void gMethod();
}

class Fifth {
    public void newMethod() {
        System.out.println("In Fifth");
    }
}

class Imp extends Fifth implements Fourth {
    
    public void aMethod() { System.out.println(" inside aMethod"); } 
    public void bMethod() { System.out.println(" inside bMethod"); } 
    public void cMethod() { System.out.println(" inside cMethod"); } 
    public void dMethod() { System.out.println(" inside dMethod"); }         
    public void eMethod() { System.out.println(" inside eMethod"); }         
    public void fMethod() { System.out.println(" inside fMethod"); } 
    public void gMethod() { System.out.println(" inside gMethod"); }
    
}

public class Third {

    public static void method1(One one) {
        one.aMethod();
    }
    
    public static void method2(Two two) {
        two.cMethod();
    }
    
    public static void method3(Three three) {
        three.eMethod();
    }
    
    public static void method4(Fourth four) {
        four.gMethod();
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Imp i = new Imp();
        method1(i);
        method2(i);
        method3(i);
        method4(i);
    }
    
}
