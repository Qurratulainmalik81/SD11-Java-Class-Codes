package New;
public class Demo {
    public static void main(String[] args) {
        Student S1 = new Student();//default constructor is no more accessible as i have added myown
        Student S2 = new Student();

    S1.display();
   

    S1.set("Hiba",20, "SD", 3);

    S1.display();
        
    }
}
