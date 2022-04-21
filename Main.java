package OT;

import java.util.Scanner;

public class Main {
    static String ent;
   public static void cS() {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();
  }  

        public static void TS()
        {
          while (true) 
          {
              Scanner reader = new Scanner(System.in);
              System.out.println("Welcome to the Oregon Trail!");
              System.out.println();
              System.out.println("You may:");
              System.out.println("1. Travel the trail");
              System.out.println("2. Learn about the trail");
              System.out.println("3. See the (Totally Legitimate) Oregon Top Ten (CPU Scores based on real players)");
              System.out.println("4. End");
              int x = reader.nextInt();
              reader.nextLine();
              if (x == 1) 
              {
                cS();
                reader.close();
                return;
              }
              if(x == 2)
              {
                cS();
                System.out.println("Try taking a journey by\n covered wagon across 2000\n miles of plains, rivers, and\n mountains! On the\n plains, will you slosh your\n oxen through mud and\n water-filled ruts, or will you\n plod through dust six inches\n deep?");
                System.out.println("");
                System.out.println("Press Enter to continue");
                ent = reader.nextLine();
                cS();
                System.out.println("How will you cross the rivers? \n If you have money, you might \n take a ferry (if there is a \n ferry). Or, you can ford the \n river and hope you and your \n wagon aren't swallowed alive!");
                System.out.println("");
                System.out.println("Press Enter to continue");
                ent = reader.nextLine();
                cS();
                System.out.println("What about supplies? Well, if \n you're low on food you can \n hunt. You might get a buffalo... \n you might. And there are \n bears in the mountains.");
                System.out.println("");
                System.out.println("Press Enter to continue");
                ent = reader.nextLine();
                cS();
                System.out.println("At the Dalles, you can try \n navigating the Columbia River, \n but if running the rapids with \n a makeshift raft makes you \n queasy, better take the Barlow road.");
                System.out.println("");
                System.out.println("Press Enter to continue");
                ent = reader.nextLine();
                cS();
                System.out.println("If for some reason you don't \n survive -- your wagon burns, \n or thieves steal your oxen, or \n you run out of provisions, or \n you die of cholera -- don't give up! Try again...and \n again... until your name is up \n with the others on the (Totally Legitimate) Oregon Top Ten (CPU Scores based on real players).");
                System.out.println();
                System.out.println("Press Enter to return back to the home screen");
                ent = reader.nextLine();
                cS();
              }
              if (x == 3) 
              {
                cS();
                System.out.println("Top 10: \n 1. Will Smith (Oooh): 10,000,000,000,000 \n 2. Chris Rock (Ouch): 9,999,999,999,929 \n 3. Ugandan Knuckles (Do you know da wae?): 8,848,463,818 \n 4. Backpack Kid (Better floss all your teeth!): 124,416,196,194 \n 5. Orange Shirt Kid (This dance is hard): 106,595,172,024 \n 6. Sanic (Gotta go fast!): 98,105,861,794 \n 7. Kermit the Frog (Froge): 89,106,681,069 \n 8. Sans (Hehehehehehehehehehehe): 78,742,069,245 \n 9. Nyan Cat (Meow!): 66,666,666,666 \n 10. Bob the Builder (Can he fix it?): 55,555,555,555");
                System.out.println("");
                System.out.println("Press Enter to return back to the home screen");
                ent = reader.nextLine();
                cS();
              }
                if (x==4)
                {
                  System.out.println("Thanks for visiting!");
                  System.exit(0);
                }
                reader.close();
          }
        }
      public static void Beginning(Character person)
      {
        
        Scanner reader = new Scanner(System.in);
        while(true)
          {
            System.out.println("Many kinds of people have \n made the trip to Oregon.");
        System.out.println("You may:");
        System.out.println("1. Be a banker from Boston");
        System.out.println("2. Be a carpenter from Ohio");
        System.out.println("3. Be a farmer from Illinois");
        System.out.println("4. Find out the differences\n between these choices.");
            int input =reader.nextInt();
            reader.nextLine();
            if(input == 1)
            {
              System.out.println("You've chosen a Banker!\n This occupation will start with more money than both of the others, but get less points along the way as well. Are you sure? Enter Y/N: ");
              String i = reader.nextLine();
              if (i.equalsIgnoreCase("y")) {
                 //person = new Character("Banker","Boston",1600);
                 person.setOccupation("Banker");
                 person.setLocation("Boston");
                 person.setCash(1600);
                break;
              }
              else {
                cS();
                continue;
              }
            }
            if (input == 2)
            {
              System.out.println("You've chosen a Carpenter!\n This occupation will start with less money than Banker and more than Farmer, but get more points than a Banker and fewer than a Farmer along the way. Are you sure? Enter Y/N: ");
              String i = reader.nextLine();
              if (i.equalsIgnoreCase("y")) {
                 //person = new Character("Carpenter","Ohio",800);
                 person.setOccupation("Carpenter");
                 person.setLocation("Ohio");
                 person.setCash(800);
                break;
              }
              else {
                cS();
                continue;
              }
            }
            if(input == 3)
            {
              System.out.println("You've chosen a Farmer!\n This occupation will start with less money than both of the others, but get more points than both along the way. Are you sure? Enter Y/N: ");
              String i = reader.nextLine();
              if (i.equalsIgnoreCase("y")) {
                 //person = new Character("Farmer","Illinois",400);
                 person.setOccupation("Farmer");
                 person.setLocation("Illinois");
                 person.setCash(400);
                break;
              }
              else {
                cS();
                continue;
              }
            }
            if(input == 4)
            {
              cS();
              System.out.println("Traveling to Oregon isn’t easy! \nBut if you’re a banker, you’ll\n have more money for supplies\n and services than a carpenter\n or a farmer.");
              System.out.println("However, the harder you have\n to try, the more you points you\n deserve! Therefore, the farmer earns the greatest\n number of points and the\n banker earns the least."); 
              System.out.println();
              System.out.println("Press enter to return to the occupation selection screen.");
              ent = reader.nextLine();
              cS();
            }
           if (input != 1 && input != 2 && input != 3 && input != 4)
            {
              System.out.println("That's not a valid option!");
            }
            
          }
        System.out.println("Press enter to continue!");
        reader.nextLine();
        cS();
        reader.close();
      }

      public static void NamingCharacters(Character c, FamilyMember w, FamilyMember o, FamilyMember d, FamilyMember ys)
      {
        Scanner reader = new Scanner(System.in);
        System.out.println("What is the first name of the wagon leader? (The character you chose).");
        String fname = reader.nextLine();
        c.setName(fname);
        System.out.println("What is the first name of your wife?:");
        fname = reader.nextLine();
        w.setName(fname);
        System.out.println("What is the first name of your oldest son?");
        fname = reader.nextLine();
        o.setName(fname);
        System.out.println("What is the first name of your daughter?");
        fname = reader.nextLine();
        d.setName(fname);
        System.out.println("What is the first name of your youngest son?");
        fname = reader.nextLine();
        ys.setName(fname);
        reader.close();
      }
    
      
  
    public static void main(String[] args)
      {
        Character person = new Character();
        FamilyMember Wife = new FamilyMember("Wife",100);
        FamilyMember Son = new FamilyMember("Older Son",60);
        FamilyMember Daughter = new FamilyMember("Daughter",50);
        FamilyMember YoungerSon = new FamilyMember("Baby Son",30);
        TS();
        Beginning(person);
        NamingCharacters(person, Wife, Son, Daughter, YoungerSon);
      }
}
