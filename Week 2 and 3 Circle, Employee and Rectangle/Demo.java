public class Demo {
  public static void displayStatic()
  {
    System.out.println("Hello I am static display");
    
  }
  public void displayInstance()
  {
    System.out.println("Hello I am Instance display method");
    displayStatic();
  }

    public static void main(String[] args) {
      Employee john = new Employee(1, "John", "Doe", 4500);
      System.out.println(john);
      john.raiseSalary(10);
      System.out.println(john);
      {
        
      }


    //     Circle C1 = new Circle();
    //    // Circle C2 = new Circle("Blue");
    //     Circle C3 = new Circle(5.0);
    //     Circle C4 = new Circle(3.0,"Blue");
    //   //  Circle C5 = new Circle("Blue",6.0);
    //     Circle C6 = new Circle(C1);

    //     System.out.println(C1);
    //   //  System.out.println(C2);
    //     System.out.println(C3);
    //     System.out.println(C4);
    //  //   System.out.println(C5);
    //     System.out.println(C6);

    //     C1.setColor("yellow");
    //     C1.setRadius(10.0);
        
    //     System.out.println(C1);



    //     Rectangle r1 = new Rectangle();
    //     Rectangle r2 = new Rectangle();
    //     Rectangle r3 = new Rectangle();
    //     Rectangle r4 = new Rectangle(2,5);
    //     Rectangle r5 = new Rectangle(4,6);
    //     Rectangle r6 = new Rectangle(7, 9);
    //     r1.printcount();
    //     r6.printcount();
    //     Rectangle.printcount();

    //  System.out.println(r1.getLength()+ "," + r1.getWidth());
    //  System.out.println("Area = " + r1.getArea());
    //  System.out.println("perimeter = " + r1.getPerimeter());
    //  r1.setLength(4);
    //  System.out.println(r1.getLength()+ "," + r1.getWidth());
    //  System.out.println("Area = " + r1.getArea());
    //  System.out.println("perimeter = " + r1.getPerimeter());
    //  r1.setWidth(2);
    //  System.out.println(r1.getLength()+ "," + r1.getWidth());
    //  System.out.println("Area = " + r1.getArea());
    //  System.out.println("perimeter = " + r1.getPerimeter());


    //  System.out.println(r1);
    //  System.out.println(r2);
    //  System.out.println(r3);
    //  System.out.println(r4);
    //  System.out.println(r5);
    //  System.out.println(r6);


    }
    
}
