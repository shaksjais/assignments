/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cycle;

/**
 *
 * @author zadmin
 */
class Cycles{
	
}

class Unicycle extends Cycles{
	public void balance(){
		System.out.println("Balancing Unicycle");
	}
}

class Bicycle extends Cycles{
	public void balance(){
		System.out.println("Balancing Bicylce");
		}
}
	
class Tricycle extends Cycles {
}
	
public class Cycle {

	public static void main(String[] args) {
		Cycles[] c = {
				new Unicycle(), 
				new Bicycle(),
				new Tricycle()
		};
		//c[0].balance();   // Cannot call as there is no gmail
		//c[2].balance();
		((Unicycle)c[0]).balance();
		((Bicycle)c[1]).balance();
		
}
}
