public class Bird{

//Instance data
private String species;
private double wingspan;
private int lifespan;
private boolean layEggs;

//Constructor
public Bird (String sp, double w, int l, boolean e)
{
  setSpecies(sp);
  setWingspan(w);
  setLifespan(l);
  setLayEggs(e);
}

//Default Constructor
public Bird()
{
  this("Pigeon", 33.42, 2, false);
}

//accessor methods
public String getSpecies()
{
  return species;
}
public double getWingspan()
{
  return wingspan;
}
public int getLifeSpan()
{
  return lifepsan;
}
public boolean getLayEggs()
{
  return layEggs;
}

//mutator methods
public void setSpecies(String sp)
{
  species = sp;
}
public void setWingspan(double w)
{
  wingspan = w;
}
public void setLifespan(int l)
{
  lifespan = l;
}
public void setLayEggs(boolean e)
{
  layEggs = e;
}

//other methods
//what would i want to do with a bird:
//migrate
//lay getEggs
//if its true

//toString

//check for equality
//two birds are equal if they are the same species and 








}