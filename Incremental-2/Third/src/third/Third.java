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
public class Third {
    String s;
    Third(String k) {
        s = k;
        System.out.println("Received "+ k);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Third[] t = new Third[2]; // Third problem , constructor isn't called
        
        t[0] = new Third("Object 1"); // Fourth problem , constructor called
        t[1] = new Third("Object 2");  
    }
    
}
