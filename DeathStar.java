public class DeathStar
{
  //feilds/instance data.
  private String planetName;  //p.
  private int chargeTime; //t.
  private int lightYears;  //d.
  private boolean rebels; //r.

  private String blown;  //Just for method #2.
  
  //constructor.
  public DeathStar(String p, int t, int d, boolean r)
  {
    setPlanetName(p);
    setChargeTime(t);
    setLightYears(d);
    setRebels(r);
  } 

  //Overloading constrctor.
  public DeathStar()
  {
    this("none", 0, 0, false);
  }

  //Mutator.
  public void setPlanetName(String p)
  {
    planetName = p;
  }
  public void setChargeTime(int t)
  {
    chargeTime = t;
  }
  public void setLightYears(int d)
  {
    lightYears = d;
  }
  public void setRebels(boolean r)
  {
    rebels = r;
  }

  //Accessors.
  public String getName()   //name.
  {
    return planetName; 
  }
  public int getTime()      //charge time.
  {
    return chargeTime;
  }
  public int getDistance()    //lightyears.
  {
    return lightYears;
  }
  public boolean getHostility()     //rebels or no.
  {
    return rebels;
  }

  //Equals method.
  public boolean equals(DeathStar d1)
  {
    if (this.getName().equals(d1.getName()))
    {
      return true;
    }
    else
    {
      return false;
    }
  }


  //Method #1.
  public String blowUp()
  {
    if(rebels == true)
    {
      return ("BOOM");    //Letting you know that planet blew up.
    }
    else 
    {
      return ("No Boom");   //Letting you know the planet did not blow up.
    }

  } 

  //Method #2.
  public int travelToPlanet()
  {
     lightYears = 0;    //Reducing distance to zero which is striking distance.
     
     return lightYears;
  }


  //toString method.
  public String toString()
  {
    return ("Planet: " + planetName + "\nCharge time: " + chargeTime + "\nLightyears away: " + lightYears + "\nHostile: " + rebels);
  }

}