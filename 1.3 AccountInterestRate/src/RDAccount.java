//RD_Account 
import java.util.*;

public class RDAccount extends Account {

int tenure;

    float principal;

    public RDAccount(int tenure, float principal)

    {

          this.tenure=tenure;

          this.principal=principal;

    }

    @Override

    public float calculateInterest() {

          // TODO Auto-generated method stub

          float result=0.0f;

          float quat=4;

          int totalMonths=tenure*12;

          float monInYears=0;

          float iRate= rateOfInterest/100;

          

          for(int i=totalMonths;i>0;i--)

          {

               monInYears=i/12.0f;

               result+=principal*((Math.pow((1+iRate/quat),quat*monInYears))-1);

          }     

                 return result;        

    }

    @Override

    public float calculateAmountDeposited() 
    {

          // TODO Auto-generated method stub       

          return principal*tenure*12;

    }
}
