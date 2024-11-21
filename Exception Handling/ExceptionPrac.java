class ExceptionPrac{
    //try, catch, throw, throws,  finally
    public static void main(String args[])
    {
    int numerator = 10;
    int denominator = 0;
    try {
        System.out.println (numerator / denominator);
        System.out.println ("This text will not be printed.");
    }
    catch(java.lang.ArithmeticException e) {
        System.out.println ("This text will be printed.");
    }
   
    finally {
        System.out.println ("This text will also be printed.");
    }
 
  
 }
}
 