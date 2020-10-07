import java.util.Scanner;
public class GenNum
{
  private static int num;
  public GenNum(String al)// Random number constructor
  {
    if(al.equals("easy"))
    {
     num = (int) ((Math.random() * ((50 - 0) + 1)) + 0);
    }
    else if(al.equals("medium"))
    {
     num = (int) ((Math.random() * ((100 - 0) + 1)) + 0);
    }
    else if(al.toLowerCase().equals("hard"))
    {
      num = (int) ((Math.random() * ((1000 - 0) + 1)) + 0);
    }
  }
  public static int pare()// Random number accessor
  {
      return num;
  }
  public static void changeRand(String testing)// Random number mutator which generates a new random number if the user inputs in the number -20
  {
    if(testing.toLowerCase().equals("easy"))
    {
     num = (int) ((Math.random() * ((50 - 0) + 1)) + 0);
    }
    else if(testing.toLowerCase().equals("medium"))
    {
     num = (int) ((Math.random() * ((100 - 0) + 1)) + 0);
    }
    else if(testing.toLowerCase().equals("hard"))
    {
      num = (int) ((Math.random() * ((1000 - 0) + 1)) + 0);
    }
  }
}