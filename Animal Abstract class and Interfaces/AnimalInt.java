public interface AnimalInt {
   // cannot have instance variabless
   //cannot have constructors
   //but can have constants
   //cannot have non static methods
   //interfaces can have static methods

    static final double g = 10.0;
    public static void displayg()
    {
        System.out.println("g = " + g); 
    }
    //list down the behaviour all the animals must have
    public abstract void moveable();
    void sleep();
    void speak();
    void eat();
    default void display()
    {
        System.out.println("Default method in an interface");
    }
    
}
