/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifth;

/**
 *
 * @author zadmin
 */
public class Fifth {

    public class One {
        int x;
        One(int a)
        {
            x = a;
            System.out.println("Constructor one called ");
        }
    }
    
    public class Two {
        public class Three extends One {
            Three() {
            super(1);
        }
    }
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
     
    }
    
}
