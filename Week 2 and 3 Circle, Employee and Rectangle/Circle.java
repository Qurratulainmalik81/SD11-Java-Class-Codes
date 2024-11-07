//i am going to make some temporary changes
public class Circle {

    private double radius = 1.0;
    private String color = "red";
 
    public Circle()
    {
        this.radius = 0.0;
        this.color = null;
     
    }
    public Circle(double radius)
    {
        this.radius = radius;
    }
    // public Circle(String color)
    // {
    //     this.color = color;
    // }

     public Circle(double radius, String color)
    {
        this.radius = radius;
        this.color = color;
     
    }
    // public Circle( String color,double radius)
    // {
    //     this.radius = radius;
    //     this.color = color;
    // }
    //copy constructor
    //public Circle(Circle C)
    // {
    //     this.radius = C.radius;
    //     this.color = C.color;

    // }
    public double getRadius() {
        return this.radius;
    }
    public String getColor() {
        return this.color;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
  
    public String toString()
    {
        return ("Circle with radius = " + this.radius + " Color = " + this.color);
    }

    public double getArea()
    {
        return (Math.pow(this.radius, this.radius));
    }
    public static void display()
    {
      System.out.println("Hello I am here");
    }
    
}
