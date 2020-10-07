public class Deck
{
  private int number = 10;
  private String name;
  private String suit;

  public Deck(int num, String su)
  {
    number = num;
    suit = su;
  }

  public Deck(String na, String su)
  {
    name = na;
    suit = su;
  }

  public int getNumber()
  {
    return number;
  }

  public String getSuit()
  {
    return suit;
  }

  public String getName()
  {
    return name;
  }
}