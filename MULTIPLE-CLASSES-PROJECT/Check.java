public class Check
{
  private static String close;
  private static int lastnum;
  public Check(int guess)// Last number guessed contructor
  {
    lastnum = guess;
  }
  public static int getLast()// Last number accessor
  {
    return lastnum;
  }
  public static void changeGuess(int newguess)// Last number mutator that updates the lastguess variable
  {
    lastnum = newguess;
  }
  public static String numHe(int ja,String some) // Checks how far away the guess was from the number and also if the user wants to change the random number
  {
    if(ja == -20)
    {
      GenNum.changeRand(some.toLowerCase());
    }
   if(some.equals("easy")&&ja!=-20)
   {
    if(Math.abs(ja - GenNum.pare())<=5&&ja!=-20)
    {
      return "Very Hot   ";
    }
    else if(Math.abs(ja - GenNum.pare())<=15&&ja!=-20)
    {
      return "Hot   ";
    }
    else if(Math.abs(ja - GenNum.pare())<=25&&ja!=-20)
    {
      return "Cold   ";
    }
    else{
      return "Very Cold   ";
    }
   }
   else if(some.equals("medium")&&ja!=-20)
   {
     if(Math.abs(ja - GenNum.pare())<=15&&ja!=-20)
    {
      return "Very Hot   ";
    }
    else if(Math.abs(ja - GenNum.pare())<=30&&ja!=-20)
    {
      return "Hot   ";
    }
    else if(Math.abs(ja - GenNum.pare())<=50&&ja!=-20)
    {
      return "Cold   ";
    }
    else{
      return "Very Cold   ";
    }
   }
   else if(some.equals("hard")&&ja!=-20)
   {
        if(Math.abs(ja - GenNum.pare())<=100&&ja!=-20)
    {
      return "Very Hot   ";
    }
    else if(Math.abs(ja - GenNum.pare())<=200&&ja!=-20)
    {
      return "Hot   ";
    }
    else if(Math.abs(ja - GenNum.pare())<=300&&ja!=-20)
    {
      return "Cold   ";
    }
    else{
      return "Very Cold   ";
    }
   }
   return "";
  }
  
}