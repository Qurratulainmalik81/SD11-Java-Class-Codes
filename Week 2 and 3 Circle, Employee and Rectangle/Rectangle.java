public class Rectangle{
    //attributes
    private float length ;
    private float width ;
    private static int count = 0;
    //constructor
    //1. default constructor i only accessible when you dont have your own constructor defined
    //2. no argument constructor
    public Rectangle()
    {
        this.length = 1.0f;
        this.width = 1.0f;
        count++;
    }
    // 3. parametrised constructor
    public Rectangle(float length, float width)
    {
        this.length = length;
        this.width = width;
        count++;
    }
    //methods
    public float getLength()
    {
        return this.length;
    }
    public void setLength(float length)
    {
        this.length = length;
    }
    public float getWidth() {
        return width;
    }
    public void setWidth(float width) {
        this.width = width;
    }
    public double getArea()
    {
        return (this.length * this.width);
    }
    public double getPerimeter()
    {
        double p = 0.0;
        p = 2 * (this.length + this.width);
        return (p);
    }
    public String toString()
    {
    
        return("Rectangle = (" + this.length + ","+ this.width+")");
    }
    public static void printcount()
    {  System.out.println("Total number of rectangles " + count); }
}