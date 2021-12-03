public class Bird
{

//Instance data
private String species;
private double wingLength;
private int speed;
private boolean genderF; //female = true


//Constructor
public Bird (String sp, double w, int s, boolean gf)
{
  setSpecies(sp);
  setWingLength(w);
  setSpeed(s);
  setGenderF(gf);
}


//Default Constructor
public Bird()
{
  this("Pigeon", 3.42, 75, false);
}


//Accessor methods
public String getSpecies()
{
  return species;
}
public double getWingLength()
{
  return wingLength;
}
public int getSpeed()
{
  return speed;
}
public boolean getGenderF()
{
  return genderF;
}


//Mutator methods
public void setSpecies(String sp)
{
  species = sp;
}
public void setWingLength(double w)
{
  wingLength = w;
}
public void setSpeed(int s)
{
  speed = s;
}
public void setGenderF(boolean gf)
{
  genderF = gf;
}


//Other method #1
//calculates the time it takes for Bird to fly an input distance based on its set speed
public void flyTime(int dist)
{
  double minsFlying = ((double) dist/ (double) speed);
  System.out.println("It took "  + minsFlying + " minutes to travel " + dist + " miles.");
}


//Other method #2
//Simulates the bird laying 1 to 5 eggs randomly, given that it is female
public int layEggs()//what would it take in
{
  if(genderF)
  {
    int eggs = ((int) (Math.random() * (5 - 1) + 1) + 1);
    return eggs;
  }
  else
  {
    return 0;
  }
}
  

//toString
public String toString()
{
  String str = "";
  str = "A ";
  if(genderF)
  {
    str += "female ";
  }
  else
  {
    str += "male ";
  }

  str +=  species + " with " + wingLength + " inch wings can fly at a maximum speed of " + speed + " miles per hour.";
  return str;
}


//Check for equality
//two Birds are equal if they are of the same species and gender
public boolean equals(Bird b)
{
  if((this.getSpecies().equals(b.getSpecies())) && (this.getGenderF()==b.getGenderF()))
  {
    return true;
  }
  else
  {
    return false;
  }
}


}