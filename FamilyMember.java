package OT;

public class FamilyMember
{
      private String name;
      private String type;
      private String sickness;
      private int health;
  
      public FamilyMember(String type,int health)
      {
          name="";
          type="";
          sickness="";
          this.health=health;
      }
      public void setName(String n)
      {
        name = n;
      }
      public void setType(String t)
      {
        type = t;
      }
      public void setSickness(String s)
      {
          sickness = s;
      }
      public String getName()
      {
          return name;
      }
      public String getType()
      {
          return type;
      }
      public String getSickness()
      {
          return sickness;
      }
      public int getHealth()
      {
          return health;
      }
}