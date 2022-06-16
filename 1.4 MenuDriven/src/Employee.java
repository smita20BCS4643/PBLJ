//Employee 
import java.io.Serializable;
public class Employee implements Serializable
{
	private int id;
	
	private String name;
	
	private double salary;
	
	private int age;
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
	    this.name = name;
	}
	
	public double getsalary()
	{
	    return salary;
	}
	
	public void setSalary(double salary)
	{ 
	    this.salary = salary;
	}
	
	public int getAge()
	{
	     return age;
	}
	
	public void setAge(int Age)
	{
	    this.age = age;
	}
//	Constructor 
     
	public Employee(int id, String name, double salary , int age)
	{
		super();
		setId(id);
		setName(name);
		setSalary(salary);
		setAge(age);
	}
	
	public String toString()
	{
		return "employee [id=" + ", name=" + name + ", salary="+ salary + ", age="+age + "]";
	}
}
