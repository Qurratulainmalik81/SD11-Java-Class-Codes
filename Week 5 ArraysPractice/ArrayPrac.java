package ArraysPractice;
//1.	Java Method to Calculate Sum & Average of all elements of an integer Array size 10.

import java.util.*;


public class ArrayPrac{
    public static void main(String[] args) {

        int size = 10;
        int array1[] = new int[size];
        int array2[] = {99,2,10, 20, 40};
        char chArray[] = new char[size];
        char chArray2[] = {'H','e','l','l','o'};
        String s1 = "Hello";
        s1 = "hello world, how are you";
        String stringrray[] = new String[size];
        Scanner in = new Scanner(System.in);

        Arrays.sort(array2);
      
    //    SumAvg(array2);//mthod call
        Increment(array2, size);
        System.out.println("Prining array2 in Main method");
        for(int i = 0;i<array2.length;i++)
        {
            System.out.println(array2[i]);
        }
       System.out.println("Size = " + size);

        // for(int i = 0;i<array2.length;i++)
        // {
        //     System.out.println(array2[i]);
        // }
        System.out.println("Enter 10 integers for array1: ");
        // for(int i = 0;i<array1.length;i++)
        // {
        //   array1[i] = in.nextInt();

        // }
        // Increment(array1);

        // System.out.println(array1.length);
        // System.out.println(array2.length);
        // System.out.println(chArray.length);
        // System.out.println(chArray2.length);
        // System.out.println(s1.length());
        // System.out.println(stringrray.length);
        

    }
    public static void SumAvg(int[] arr)
    {
        int sum = 0;
         for(int i = 0;i<arr.length;i++)
        {
             sum = sum + arr[i];
        }
        System.out.println("Sum = " + sum + " Average = " + (sum/arr.length));
    }
   // 2.	Java Method to Increment Every Element of the Array by One & Print Incremented Array

   public static void Increment(int[] array2, int S)
   {
    S++;
 //   
    for(int i = 0;i<array2.length;i++)
    {
        array2[i] = array2[i]+1;
    }
    System.out.println("Printing array2 in Increment method");
    for(int i = 0;i<array2.length;i++)
    {
        System.out.println(array2[i]);
    }
    System.out.println("Size = " + S);
   }

    
}