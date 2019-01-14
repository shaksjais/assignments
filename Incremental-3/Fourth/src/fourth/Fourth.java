/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fourth;

/**
 *
 * @author zadmin
 */
interface Cycle {
    void cycling();
}

class UniCycle implements Cycle {
    @Override
    public void cycling(){
        System.out.println("Unicycle called");
    }
}

class BiCycle implements Cycle{
        @Override
	public void cycling(){
		System.out.println("Bicycle called");
	}
}

class TriCycle implements Cycle{
        @Override
	public void cycling(){
		System.out.println("Tricycle called");
	}
}

interface Factory{
	Cycle factoryCycle();
}

class UniCycleFactory implements Factory{
        @Override
	public Cycle factoryCycle(){
		return new UniCycle();
	}
}

class BiCycleFactory implements Factory{
        @Override
	public Cycle factoryCycle(){
		return new BiCycle();
	}
}

class TriCycleFactory implements Factory{
        @Override
	public Cycle factoryCycle(){
		return new TriCycle();
	}
}

public class Fourth {

    /**
     * @param factory
     */
    
    public static void Cycling(Factory factory) {
        Cycle c = factory.factoryCycle();
        c.cycling();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Cycling(new UniCycleFactory());
        Cycling(new BiCycleFactory());
        Cycling(new TriCycleFactory());
    }
    
}
