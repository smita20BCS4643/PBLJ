public class InterestMain {

    public static void main(String[] args) {

          // TODO Auto-generated method stub

        int tenure = 5;

        float principal = 1000;

        int age = 20;

        String gender = "male";

   RDAccount b=new RDAccount(tenure,principal);    

 b.setInterest(age, gender);

float maturityInterest= b.calculateInterest();

    System.out.println(b.calculateInterest());

float totalPrincipleDeposited = b.calculateAmountDeposited();

    System.out.println(totalPrincipleDeposited);



System.out.println(b.calculateMaturityAmount(totalPrincipleDeposited, maturityInterest));


    }
    }