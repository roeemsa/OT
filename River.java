package OT;

public class River implements Disasters 
{
    private int cat, depth, width;
    private boolean fordable;
    private String name; 
    private String type;
    public River() 
    {
        type = "River";
        //assigns cat (category) a random value between 1 & 10
        cat = (int)(Math.random() * (10 - 2) + 1);
        //assigns depth a random value between 200 & 1 (meters)
        depth = (int)(Math.random() * (200 - 2) + 1);
        //assigns width a random value between 1609 & 1 (meters)
        width = (int)(Math.random() * (1609 - 2) + 1);
        /*next few lines work on whether the river is fordable or not. 
        Temp is assigned a random value between 1 & 10: fordable = false if temp < 7, true otherwise
        I didn't make this exactly 50/50 cause the og game's probability of successful fordings is wayyyyy less than 50/50
        */
        double temp = (Math.random() * (10 - 2) + 1);
        if (temp < 8.5) {
            fordable = false;
        }
        else {
            fordable = true;
        }
        //Just a list of possible river names; can be extended, but we'll need to edit the name selection as well if we do
        String[] names = {"Homeless", "Dragonfly", "Newingree", "Wakerane", "Chiney", "Dead Man's", "Lotus", "Orchid", "Farnwich", "Serpent", "Harmony"};
        //i is just to pick which index name will be (from names[])
        int i = (int)(Math.random() * (10 - 1) + 0);
        name = names[i] + " River";
    }

    public String getType()
    {
        return type; 
    }

    public int getCat() 
    {
        return cat;
    }

    public int getDepth() 
    {
        return depth;
    }

    public int getWidth() 
    {
        return width;
    }

    public String getName() {
        return name;
    }

    public boolean isFordable() {
        return fordable;
    }
}
