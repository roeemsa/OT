package OT;

public class Character//are we actually using this or nah????
//that would probably make sense, right? should make everything much easier
  {
    private String name;
    private double cash;
    private String occupation;
    private String location;  
    
    public Character() {
        name = "";
        cash = 0;
        occupation = "";
        location = "";
    }

    public Character(String occ, String loco, double money)
      {
        occupation=occ;
        cash=money;
        location=loco;
        name = "Unknown";
      }
    

    public void setName(String name)
    {
      this.name=name;
    }
    
    public void setCash(double x) {
        cash = x;
    }

    public void setOccupation(String occ) {
        occupation = occ;
    }

    public void setLocation(String l) {
        location = l;
    }

    public String getName() {
        return name;
    }

    public double getCash() {
        return cash;
    }

    public String getOcc() {
      return occupation;
    }

    public String getLocation() {
        return location;
    }
  }