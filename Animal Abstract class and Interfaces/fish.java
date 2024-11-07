public class fish extends Animal {

    public fish(boolean scales, boolean blood, boolean Egglaying, String specie)
    {
        super(specie);
      
    }
    public void speak()
    {
        System.out.println("Blub blub");
    }
    public void eat()
    {
        System.out.println("Algae");
    }
    public void sleep()
    { System.out.println("fish sleeps");}
    public void moveable()
    { System.out.println("fish swims");}
}
