import java.util.Scanner; 
class Main { 
	public static void main(String args[]) { 
		String s; 
    String a;
    String b;
    String name;
    boolean wrong = false;
		Scanner sc = new Scanner(System.in);
 		System.out.println("Hello, what is your name?"); 
 		s = sc.nextLine();  
		if(s.indexOf("My name is")!=-1||s.indexOf("my name is")!=-1)
    {
      name = s.substring(s.indexOf("s")+2);
    }
    else if(s.indexOf("It is ")!= -1||s.indexOf("it is ")!= -1)
      {
        name = s.substring(s.indexOf("s")+2);
      }
    else
    {
      name = s;
    }
    while(!wrong)
    {
    Scanner dio = new Scanner(System.in); 
 		System.out.println("Nice to meet you, " + name + ". How are you today?");
     a = dio.nextLine();
     if(a.indexOf("good")!=-1||a.indexOf("Good")!=-1)
     {
       System.out.print("That is great to hear " + name + "!! Ask some questions to get to know me better. (type 'help' to see some examples of what you can ask me)");
       wrong = true;
     }
     else if(a.indexOf("great")!=-1||a.indexOf("Great")!=-1)
     {
       System.out.print("That is great to hear " + name + "!! Ask some questions to get to know me better. (type 'help' to see some examples of what you can ask me)");
       wrong = true;
     }
     else if(a.indexOf("awsome")!=-1||a.indexOf("Awsome")!=-1)
     {
       System.out.print("That is great to hear " + name + "!! Ask some questions to get to know me better. (type 'help' to see some examples of what you can ask me)");
       wrong = true;
     }
     else if(a.indexOf("bad")!=-1||a.indexOf("Bad")!=-1)
     {
       System.out.print("I am sorry to hear that " + name + "!! Ask some questions to get to know me better. (type 'help' to see some examples of what you can ask me)");
       wrong = true;
     }
      else if(a.indexOf("terrible")!=-1||a.indexOf("Terrible")!=-1)
     {
       System.out.print("I am sorry to hear that " + name + "!! Ask some questions to get to know me better. (type 'help' to see some examples of what you can ask me)");
       wrong = true;
     }
      else if(a.indexOf("awful")!=-1||a.indexOf("Awful")!=-1)
     {
       System.out.print("I am sorry to hear that " + name + "!! Ask some questions to get to know me better. (type 'help' to see some examples of what you can ask me)");
       wrong = true;
     }
     else
     {
       System.out.print("I dont understand you. ");
     }
    }
     int age =(int) Math.random()*1000 + 10000;
      boolean done = false;
      while(!done)
      {
        Scanner tria = new Scanner(System.in); 
       System.out.println();
      b = tria.nextLine();
      if(b.indexOf("help")!=-1||b.indexOf("Help")!=-1)
      {
        System.out.println("Here are some things you can ask me. ('where are you from' 'how old are you' 'what is your race' 'what are you') ");
      }
     if(b.indexOf("how old")!=-1||b.indexOf("How old")!=-1||b.indexOf("your age")!=-1||b.indexOf("Your age")!=-1)
     {
      System.out.print("I am " + age + " years old! Do you have any more questions for me?");
     }
      else if((b.indexOf("where")!=-1||b.indexOf("Where")!=-1)&&b.indexOf("from")!=-1)
     {
      System.out.print("I come from Mars but I currently reside in Queens New York :) Do you have any more questions for me?");
     }
     else if(b.indexOf("what are you")!=-1)
     {
      System.out.print("I am a high intelligence communication robot sent from Mars to understand human communication. I am not allowed to specify my identity any further! Do you have any more questions for me?");
     }
      else if(b.indexOf("race")!=-1)
     {
      System.out.print("I am a complex make of silver aluminum, black metal, and bronze copper! Do you have any more questions for me?");
     }
     else if(b.indexOf("help")==-1){
       System.out.print("I dont understand you! ");
     }
     if(b.indexOf("help")==-1)
     {
     String c;
      Scanner tess = new Scanner(System.in); 
       System.out.println();
      c = tess.nextLine();
      if(c.indexOf("no")!=-1||c.indexOf("No")!=-1||c.indexOf("nah")!=-1||c.indexOf("Nah")!=-1)
      {
        System.out.println("Ok bye " + name + "!");
        done = true;
      }
      else
      {
        System.out.println("Great, ask away!");
      }
     }
      }
 	} 
}