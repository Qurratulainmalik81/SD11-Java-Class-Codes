package New;
public class Student {
    //attributes

    private String name;
    private int age;
    private String Program;
    private int Term;
   //no argument constructor
    public Student()
    {
        this.name = "NoName";
        this.age = 18;
        this.Program = "SD";
        this.Term = 1;
    }
    
    //methods (behaviours)
    public void set(String name, int a, String Pro, int Term)
    {
        this.name = name;
        this.age = a;
        this.Program = Pro;
        this.Term = Term;

    }
    public void display()
    {
        System.out.println(this.name + this.age + this.Program + this.Term);

    }
    
}
