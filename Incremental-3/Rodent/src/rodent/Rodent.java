/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodent;

/**
 *
 * @author zadmin
 */
abstract class Rodents
{
	void eat()
	{
		System.out.println("Rodent is eating");
	}
        abstract void climb();

}
class Mouse extends Rodents
{
        Mouse() {
            System.out.println("Called Mouse");
        }
	void eat()
	{
		System.out.println("Mouse is eating");
	}
	void climb()
	{
		System.out.println("Mouse is running");
	}
}
class Gerbil extends Rodents
{
        Gerbil() {
            System.out.println("Called Gerbil");
        }
	void eat()
	{
		System.out.println("Gerbil is eating");
	}
	void climb()
	{
		System.out.println("Gerbil is walking");
	}
}
class Hamster extends Rodents
{
        Hamster() {
            System.out.println("Called Hamster");
        }
	void eat()
	{
		System.out.println("Hamster is eating");
	}
	void climb()
	{
		System.out.println("Hamster is climbing");
	}
}
class Rodent
{
	public static void main(String args[])
	{
		Rodents r[] = new Rodents[3];
		r[0] = new Mouse();
		r[1] = new Gerbil();
		r[2] = new Hamster();

		r[0].eat();
		r[0].climb();

		r[1].eat();
		r[1].climb();

		r[2].eat();
		r[2].climb();
	}
}
