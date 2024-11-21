import java.io.*;
public class FileDemo{
    public static void main(String[] args) {
    //     try{
    //     File firstFile = new File("firstFile.txt");
    //     if(firstFile.createNewFile())
    //     System.out.println("New file has been created");
    //     else
    //     System.out.println("File already existed");
    //     System.out.println(firstFile.getPath());
    // }

    // catch(IOException e)
    // {
    //     e.printStackTrace();
    // }

    // try{
    //     File firstFile = new File("firstFile.txt");
    //     FileWriter fw = new FileWriter(firstFile,true);
    //     FileWriter fw2 = new FileWriter("Newfile.txt",true);
    //     fw2.write("\nwe want to add more data to our file\n");
    //      fw.write("\nwe want to add more data to our file\n");

    //      fw.close();
    //    fw2.close();       
    // }

    // catch(IOException e)
    // {
    //     e.printStackTrace();
    // }

    // try{
    //     FileReader fr = new FileReader("firstFile.txt");
    //     int i;
    //     while((i=fr.read())!=-1)
    //     System.out.print((char)i);
    //     fr.close();


    // }
    // catch(IOException e)
    // {
    //     e.printStackTrace();
    // }


    // try{
    //     FileOutputStream fout = new FileOutputStream("binary.txt");
    //     String s = "this is our first binary file";
    //     byte b[] = s.getBytes();
    //     fout.write(b);
    //     fout.close();
    // }     
    // catch(IOException e)
    // {
    //     e.printStackTrace();
    // }
    // System.out.println("Success");

    try{
        FileInputStream fin = new FileInputStream("binary.txt");
              int i;
        while((i=fin.read())!=-1)
        System.out.print((char)i);
        fin.close();

    }     
    catch(IOException e)
    {
        e.printStackTrace();
    }
    System.out.println("Success");


    }
}