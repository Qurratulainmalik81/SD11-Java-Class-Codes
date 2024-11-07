public class Snake extends reptile implements generalInt{
    private boolean legs;
    public Snake(boolean scales, boolean blood, boolean Egglaying, String specie, boolean leg)
    {
        super( scales,blood, Egglaying,specie);
        this.legs = leg;
    }
    public void speak(){
        System.out.println("Snake Hisses");
    }
    public void eat(){        
        System.out.println("Snake eats mice");
    }
    public void sleep()
    { System.out.println("Snake sleeps");}
    public void moveable()
    { System.out.println("Snake crawls");}

    public void display()
    {System.out.println("this is snake class display method");
    }

    public String toString()
    {
        return (super.toString() + " has legs: "  + this.legs);
    }
    
}
