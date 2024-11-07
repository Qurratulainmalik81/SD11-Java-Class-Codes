package ArraysPractice;

import java.util.ArrayList;

public class ArraylistPrac {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>(5);
        ArrayList<Person> list2 = new ArrayList<Person>();
        list2.add(new Person("Daniel","Bowers"));
        list2.add(new Person("Angela","Flynn"));

        list1.add("Elment1");
        list1.add("Elment2");
        list1.add("Elment3");
        list1.add(0,"Element0");

        list1.set(1,"Element1");

        System.out.println(list1.size());
        System.out.println(list2.size());

        System.out.println(list1);
        System.out.println(list2);

        for(int i =0; i<list1.size();i++)
        {
            System.out.println(list1.get(i) + " Index = " + i);
        }
        
        
    }
}
