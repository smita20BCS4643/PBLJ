package smita;

class Base_Parent {
	private void display()
	{
		System.out.println("Base Display");
	}

}

class Derived extends Base_Parent
{
	public void display()
	{
		System.out.println("Derived Display");
		
	}
}

public class Base_main
{
	public static void main(String args[])
	{
		Base_Parent obj = new Derived();
		obj.display();
	}
}


