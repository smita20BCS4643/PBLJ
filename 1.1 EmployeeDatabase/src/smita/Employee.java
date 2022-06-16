package smita;
import java.util.*;
public class Employee
  {
    String empid[]={"1001","1002","1003","1004","1005","1006","1007"};
    String depName[]={"R&D","PM","Accountant","Front desk","Engineering","Manufacturing","PM"};
    String empName[]={"Ashish","Smita","Ana","Radhika","Dhanashare","Sayali","Rachana"};
    String dataJoin[]={"1/04/09","2/04/09","3/04/09","4/04/09","5/04/09","6/04/09","7/04/09"};
    int Basic[]={20000,30000,10000,12000,50000,23000,29000};
    int hra[]={8000,12000,8000,6000,20000,9000,12000};
    int it[]={3000,9000,1000,2000,20000,4400,10000}  ;
    char Descodes[]={'e','c','k','r','m','c','e'};
    
    
     int find(String emp)
     {
        for(int i=0;i<empid.length;i++)
        {
            if(emp.equalsIgnoreCase(empid[i]))
            {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args)
    {
        Employee obj=new Employee();
        Scanner input =new Scanner(System.in);
        System.out.print("Enter Employee Id to search: ");
        String y=input.next();
        int pos=obj.find(y);
        if(pos==-1){
            System.out.println("employee id is not found");
            return;
        }
        char empdes =obj.Descodes[pos];
        
        
        int da=0;
        String desg=null;       
        
    switch (empdes)
    {
    case 'e':
        desg="engineer";
        da=20000;
        break;
      
  case 'c':
         desg="Consultant";
         da=32000;
         break;
  case 'k':
         desg="clerk";
         da=1600;
         break;
         
  case 'r':
         desg="Receptionist";
         da=15000;
         break;
  case 'm':
         desg="Manager";
         da=40000;
         break;    
    }

   int salary=obj.Basic[pos]+obj.hra[pos]+da-obj.it[pos];
   System.out.println("Employee id"+"\t\t"+"Department Name"+"\t\t"+"Employee Name"+"\t\t"+"Designation"+"\t\t"+"Date of Joining"+"\t\t"+"Salary");
   System.out.println(obj.empid[pos]+"\t\t\t"+obj.depName[pos]+"\t\t\t"+obj.empName[pos]+"\t\t\t"+desg+"\t\t"+obj.dataJoin[pos]+"\t\t\t"+salary);
    
    }

    }
