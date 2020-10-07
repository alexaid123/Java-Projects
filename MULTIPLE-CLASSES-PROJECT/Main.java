import java.util.Scanner;
public class Main {
public static void main(String args[]) {
  System.out.println("Welcome to the Guessing Game!");
   Scanner sc = new Scanner(System.in);
    System.out.print("Choose your difficulty(easy(1-50), medium(1-100), hard(1-1000)) You can type in '-20' at any point to change the random number : ");
    String difficulty = sc.nextLine(); 
    while(!difficulty.toLowerCase().equals("easy")&&!difficulty.toLowerCase().equals("medium")&&!difficulty.toLowerCase().equals("hard"))
    {
      Scanner eis = new Scanner(System.in);
      System.out.print("Invalid input, please try again! : ");
      difficulty = eis.nextLine();
    }
     GenNum noumero = new GenNum(difficulty.toLowerCase());
  int counter = 1;
  Scanner inp = new Scanner(System.in);
    System.out.print("GUESS : ");
     int x = inp.nextInt();
     Check lastguess = new Check(x); 
     lastguess.changeGuess(x);
     if(x==-20)
     {
       System.out.println("Changing random number...");
     }
     else{
     System.out.println("Your last guess was " + lastguess.getLast());
     }
     if(x==GenNum.pare())
    {
    System.out.print("Correct, it took you " + counter + " tries!");
    }
    else
    {
      counter++;
      System.out.println(Check.numHe(x,difficulty.toLowerCase()));
    }
  while(x!=GenNum.pare())
  {
 Scanner ipp = new Scanner(System.in);
    System.out.print("GUESS : ");
     x = ipp.nextInt();
     lastguess.changeGuess(x);
      if(x==-20)
     {
       System.out.println("Changing random number...");
     }
     else{
     System.out.println("Your last guess was " + lastguess.getLast());
     }
    if(x==GenNum.pare())
    {
    System.out.print("Correct, it took you " + counter + " tries!");
    }
    else
    {
      System.out.println(Check.numHe(x,difficulty.toLowerCase()));
      counter++;
    }
  }
}
}