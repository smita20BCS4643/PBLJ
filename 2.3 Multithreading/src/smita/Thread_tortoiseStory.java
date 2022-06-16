package smita;
public class Thread_tortoiseStory 
{
   public static void main(String[] args)
   {
   Thread tortoise = new Tortoise();    //Creating an object of the tortoise thread 
   tortoise.start();             //Starting the first thread
   System.out.println("|== smita shinde   UID =20BCS4643 ==|\n");
   for(int a=1;a<11;a++)

      {

       System.out.println("Distance covered by HARE   = "+(a));  

      } 

  System.out.println("!!!!!!!!!!!!!!!HARE IS GOING TO SLEEP!!!!!!!!!!!!!!!!!!!!!");  //hare going to sleep

  try

  {

   Thread.sleep(3000);              // current thread is hare

  }

  catch(InterruptedException ie)

  {

  }
 

  System.out.println("!!!!!!!!!!!!!!HARE AGAIN STARTED THE RACE !!!!!!!!!!!!!!!!");      //hare wakes up

  for(int b=11;b<21;b++)

   System.out.println("Distance covered by HARE   = "+(b));

  System.out.println("!!!!!!!!!!!!!!!!!!!!HARE HAS COMPLETED THE RACE !!!!!!!!!!!!!!!!!!!");

 }

}

class Tortoise extends Thread

{  

  public void run()

  {

        for(int c=1;c<21;c++)

        {

         System.out.println("Distance covered by TORTOISE = "+c);   

        }

        System.out.println("!!!!!!!!!!!!!!!!TORTOISE HAS WON THE RACE !!!!!!!!!!!!!!!!!!!!!");   // tortoise won the race


 }

}
