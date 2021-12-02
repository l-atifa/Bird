public class Bird
{

//Instance data
private String species;
private double beakLength;
private int age;
private boolean genderF; //female = true

//Constructor
public Bird (String sp, double b, int a, boolean g)
{
  setSpecies(sp);
  setBeakLength(b);
  setAge(a);
  setGenderF(g);
}

//Default Constructor
public Bird()
{
  this("Pigeon", 3.42, 2, false);
}

//accessor methods
public String getSpecies()
{
  return species;
}
public double getBeakLength()
{
  return beakLength;
}
public int getAge()
{
  return age;
}
public boolean getGenderF()
{
  return genderF;
}

//mutator methods
public void setSpecies(String sp)
{
  species = sp;
}
public void setBeakLength(double b)
{
  beakLength = b;
}
public void setAge(int a)
{
  age = a;
}
public void setGenderF(boolean g)
{
  genderF = g;
}

//other methods
public String migrate()
{
  
}
//what would i want to do with a bird:
//migrate



public int layEggs()//what would it take in
//lay getEggs
{
  if(layEggs)
  {
    Random number 1 - 10
  }
}
//if its true

//toString

//check for equality
//two birds are equal if they are the same species and 








}






You will be designing a class that will demonstrate a variety of the topics discussed in this Unit

-At least 4 pieces of instance data using at least three different variable types (private)

-At least 2 constructors one of which must be a Default Constructor that uses the this command to populate the instance data.  

- accessor methods for all of your instance data

- mutator methods for all of your instance data

- 2 additional methods of your choosing (Example: roll from the Die class)

- an equals method that determines what it means for two objects from your class to be equal to each other.  This is not considered to be one of your additional methods

- a toString method that prints all of your instance data like we did in the Book class.  This is not considered to be one of your additional methods

In your class, each item listed above must be labeled with comments.  For example, comments for one of the constructors might look like...

// Constructors

// Instance data

- Include a driver program to demonstrate that your class works as stated.  In other words, you must show evidence that all constructors  and methods work as designed. Also, you must print each object demonstrating proper use of the toString method.

In repl.it, download your project as a zip file. Upload the zip file here.