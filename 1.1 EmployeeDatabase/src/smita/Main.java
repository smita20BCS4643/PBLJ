package smita;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class Main
{

  String empId;

  String depName;

  String empDesignation;

  String empName;

  String dateJoin;

  int basic;

  int hra;

  int it;

  char designationCode;

  public static int da;

  public Main (String empId, String depName, String empDesignation,
		   String empName, String dateJoin, int basic, int hra,
		   int it, char designationCode)
  {

    this.empId = empId;

    this.depName = depName;

    this.empDesignation = empDesignation;

    this.empName = empName;

    this.dateJoin = dateJoin;

    this.basic = basic;

    this.hra = hra;

    this.it = it;

    this.designationCode = designationCode;

  }
  public static int da (char designationCode)
  {

    switch (designationCode)

      {

      case 'e':

	{

	  da = 20000;

	  break;

	}

      case 'c':

	{

	  da = 32000;

	  break;

	}

      case 'k':

	{

	  da = 12000;

	  break;

	}

      case 'r':

	{

	  da = 15000;

	  break;

	}

      case 'm':

	{

	  da = 40000;

	  break;

	}

      default:

	throw new IllegalStateException ("Unexpected value: " +
					 designationCode);

      }

    return da;

  }

  public static int salary (int basic, int hra, int da, int it)
  {

    int salary = basic + hra + da - it;

    return salary;

  }

  public static void details (String empId, String empName, String
			      depName, String empDesignation, int salary)
  {

    System.out.println ("Emp Id:\t" + empId);

    System.out.println ("Employee Name:\t" + empName);

    System.out.println ("Department:\t" + depName);

    System.out.println ("Designation:\t" + empDesignation);

    System.out.println ("Salary:\t\t" + salary);

  }
  public static void main (String[]args) throws IOException
  {

    BufferedReader bufferedReader = new BufferedReader (new
							InputStreamReader
							(System.in));

    String empId;
    int c = 0;

      Main[] employees = new Main[3];

      employees[0] = new
      Main ("1", "HM", "Manager", "Vishal", "1/04/2021", 20000, 8000,
		3000, 'e');

      employees[1] =
      new
      Main("2", "PM", "Consultant", "Ish", "23/08/2012", 30000,
		12000, 9000, 'c');

      employees[2] =
      new
     Main ("3", "Acct", "Clerk", "Viyan", "12/11/2008", 10000,
		8000, 1000, 'k');

      System.out.println ("Enter the employee ID ");

      empId = bufferedReader.readLine ();

    for (int i = 0; i < 3; i++)

      {

	if (employees[i].empId.equals (empId))

	  {

	    c = 1;

	    int salary = salary (employees[i].basic, employees[i].hra,
				 da (employees[i].designationCode),
				 employees[i].designationCode);

	      details (employees[i].empId, employees[i].empName,
		       employees[i].depName, employees[i].empDesignation,
		       salary);

	      break;

	  }

      }

    if (c != 1)

        System.out.println ("Entered employee ID not found");

  }

}