/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;                        

/**
 *
 * @author zadmin
 */

public class Exceptions {

    static void thrower(int a, int b, int c) throws FirstException, SecondException, ThirdException {
        
        if(a == 0)
          throw new FirstException("Throwing First Exception");
        
        if(b == 0)
          throw new SecondException("Throwing Second Exception");
        
        if(c == 0)
          throw new ThirdException("Throwing Third Exception");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            thrower(1,0,0);
        }
        
        catch (FirstException | SecondException | ThirdException ex) {
            Logger.getLogger(Exceptions.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        finally {
            System.out.println("Completed!");
        }
    
  
    }
}