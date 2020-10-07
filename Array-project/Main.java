import java.util.Scanner; 
public class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to Black Jack!");
    Deck[] cards = new Deck[52];
    cards[0] = new Deck(1,"Spades");
    cards[1] = new Deck(2,"Spades");
    cards[2] = new Deck(3,"Spades");
    cards[3] = new Deck(4,"Spades");
    cards[4] = new Deck(5,"Spades");
    cards[5] = new Deck(6,"Spades");
    cards[6] = new Deck(7,"Spades");
    cards[7] = new Deck(8,"Spades");
    cards[8] = new Deck(9,"Spades");
    cards[9] = new Deck(10,"Spades");
    cards[10] = new Deck("Jack","Spades");
    cards[11] = new Deck("King","Spades");
    cards[12] = new Deck("Queen","Spades");
    cards[13] = new Deck(1,"Hearts");
    cards[14] = new Deck(2,"Hearts");
    cards[15] = new Deck(3,"Hearts");
    cards[16] = new Deck(4,"Hearts");
    cards[17] = new Deck(5,"Hearts");
    cards[18] = new Deck(6,"Hearts");
    cards[19] = new Deck(7,"Hearts");
    cards[20] = new Deck(8,"Hearts");
    cards[21] = new Deck(9,"Hearts");
    cards[22] = new Deck(10,"Hearts");
    cards[23] = new Deck("Jack","Hearts");
    cards[24] = new Deck("King","Hearts");
    cards[25] = new Deck("Queen","Hearts");
    cards[26] = new Deck(1,"Diamonds");
    cards[27] = new Deck(2,"Diamonds");
    cards[28] = new Deck(3,"Diamonds");
    cards[29] = new Deck(4,"Diamonds");
    cards[30] = new Deck(5,"Diamonds");
    cards[31] = new Deck(6,"Diamonds");
    cards[32] = new Deck(7,"Diamonds");
    cards[33] = new Deck(8,"Diamonds");
    cards[34] = new Deck(9,"Diamonds");
    cards[35] = new Deck(10,"Diamonds");
    cards[36] = new Deck("King","Diamonds");
    cards[37] = new Deck("Queens","Diamonds");
    cards[38] = new Deck("Jack","Diamonds");
    cards[39] = new Deck(1,"Clubs");
    cards[40] = new Deck(2,"Clubs");
    cards[41] = new Deck(3,"Clubs");
    cards[42] = new Deck(4,"Clubs");
    cards[43] = new Deck(5,"Clubs");
    cards[44] = new Deck(6,"Clubs");
    cards[45] = new Deck(7,"Clubs");
    cards[46] = new Deck(8,"Clubs");
    cards[47] = new Deck(9,"Clubs");
    cards[48] = new Deck(10,"Clubs");
    cards[49] = new Deck("Jack","Clubs");
    cards[50] = new Deck("King","Clubs");
    cards[51] = new Deck("Queen","Hearts");
    String s = "yes"; 
    int r;
    int sum = 0;
    boolean comp = true;
    int compsum = 0;
    int crand = 0;
    int check = 0;
    boolean won = false;
    r = (int) (Math.random() * (51));
    int n = (int) (Math.random() * (51));
    if(cards[r].getNumber()==1&&cards[n].getNumber()+11<=21)
     {
       sum += 11 + cards[n].getNumber();
       if(sum == 21)
       {
         System.out.println("Congratulations, you have won!!!");
         won = true;
        System.exit(0);
       }
     }
     else if(cards[n].getNumber()==1&&cards[r].getNumber()+11<=21)
     {
        sum += 11 + cards[r].getNumber();
       if(sum == 21)
       {
         System.out.println("Congratulations, you have won!!!");
         won = true;
        System.exit(0);
       }
     }
     else
     {
    sum += cards[r].getNumber() + cards[n].getNumber();
     }
    if(cards[r].getNumber()!=11)
    {
    System.out.println("Your first card is a " + cards[r].getNumber() + " of " + cards[r].getSuit() + ", your second card is " + cards[n].getNumber() + " of " + cards[n].getSuit()+ " and your current sum is " + sum);
    }
    else
    {
      System.out.println("You first card is " + cards[r].getName() + " of " + cards[r].getSuit() + ", your second card is " + cards[r].getName() + " of " + cards[r].getSuit() + " and your current sum is " + sum);
    }
    if(sum == 21)
     {
       System.out.println("Congratulations, you have won!!!");
     }
    while(sum<21&&!won&&compsum<sum)
    {
    while(!s.toLowerCase().equals("no")&&sum<21)
    {
     
    Scanner sc = new Scanner(System.in);
 		System.out.println("Do you want to draw another card?"); 
 		s = sc.nextLine();
     if(s.toLowerCase().equals("yes"))
     {
     r = (int) (Math.random() * (51));
     if(cards[r].getNumber()==1&&sum+11<=21)
     {
       sum += 11;
       if(sum == 21)
       {
         System.out.println("Congratulations, you have won!!!");
         won = true;
       break;
       }
     }
     else
     {
    sum += cards[r].getNumber();
     }
    if(s.toLowerCase().equals("yes")&&cards[r].getNumber()!=11)
     {
        System.out.println("You got a " + cards[r].getNumber() + " of " + cards[r].getSuit() + " and your current sum is " + sum);
     }
     else if(s.toLowerCase().equals("yes"))
     {
       System.out.println("You got a " + cards[r].getName() + " of " + cards[r].getSuit() + " and your current sum is " + sum);
     }
     if(sum == 21)
     {
       System.out.println("Congratulations, you have won!!!");
       won = true;
       break;
     }
     if(sum > 21)
     {
       System.out.println("You have lost! :( ");
       won = true;
       break;
     }
     }
    }
     while(!won&&compsum<sum)
    {
     crand = (int) (Math.random() * (51));
     check = (int) (Math.random() * (10));
    compsum += cards[crand].getNumber();
    if(cards[crand].getNumber()!=11){
    System.out.println("The delaer drew a " + cards[crand].getNumber() + " of " + cards[crand].getSuit() + " and their current sum is " + compsum);
    }
    else
    {
      System.out.println("The delaer drew a " + cards[crand].getName() + " of " + cards[crand].getSuit() + " and their current sum is " + compsum);
    }
     if(compsum>sum&&compsum<=21)
     {
       System.out.println("You have lost! :(, the dealer won!!");
       break;
     }
     if(compsum==sum&&sum<=21)
     {
       System.out.println("Push, you and the dealer have tied!");
       break;
     }
     if(compsum > 21)
     {
       System.out.println("The dealer has lost, you won!!! ");
       won = true;
       break;
     }
     }
    }
    }
  }
