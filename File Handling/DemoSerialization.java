import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class DemoSerialization {
    public static void main(String[] args) {
       // writeobject();
       ArrayList<Employee> EmpList = new ArrayList<>();

       try{
        FileInputStream fin = new FileInputStream("EmployeeObject.txt");
        ObjectInputStream in = new ObjectInputStream(fin);

        Object Temp = null;
        while(true)
        {
            try{
                Temp = in.readObject();
            }
            catch(EOFException e)
            {
                break;
            }
            EmpList.add((Employee)Temp);
        }
       fin.close();
        in.close();
       }
       catch(Exception e)
       {
        e.printStackTrace();
       }
       System.out.println(EmpList);

    }
 public static void writeobject()
 {
    Employee E1 = new Employee(1, "Ainee", "Malik", 1000);
    Employee E2 = new Employee(2, "B", "Z", 2000);
    Employee E3 = new Employee(3, "C", "X", 3000);
    Employee E4 = new Employee(4, "D", "Y", 5000);


    try{
        FileOutputStream fout = new FileOutputStream("EmployeeObject.txt");
        ObjectOutputStream Out = new ObjectOutputStream(fout);
        Out.writeObject(E1);
        Out.writeObject(E2);
        Out.writeObject(E3);
        Out.writeObject(E4);
        fout.close();
        Out.close();
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }

    

    // System.out.println(E1);
    // System.out.println(E2);
    // System.out.println(E3);
    // System.out.println(E4);
 }   
}
