public abstract class Animal implements AnimalInt{
    //abstract is a non access modifier, you cannot intantiate abtract class
    //Can have instance variables (fileds)
    //abstract class can have static data too
    //abstract class can have constructors
    //abstract class can have static and non static methods too
    //abstract class can have abstract methods
    private String specie;
    private static int count = 0;
    public Animal(String name)
    {   this.specie = name;
        count++;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static int getCount() {
        return count;
    }
    public static void setCount(int count) {
        Animal.count = count;
    }
    public String toString()
    {
        return(this.specie + " number of animals: " + this.count);
    }
    public void speak()
    {System.out.println("Animals talk");
    }
    public void eat()
    {System.out.println("Animals eat");
    }
    public void sleep()
    { System.out.println("Animals sleep");}
    public void moveable()
    { System.out.println("Animals move");}
}
