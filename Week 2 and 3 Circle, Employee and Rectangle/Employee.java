public class Employee {
private int id;
private String firstName;
private String lastName;
private int salary;

public Employee(int id, String firstName, String lastName, int salary)
{
this.id = id;
this.firstName = firstName;
this.lastName = lastName;
this.salary = salary;
}
public int getId() {return this.id;}
public String getFirstName() {return firstName;}
public String getLastName() { return this.lastName;}
public String getName() {return this.firstName + " " + this.lastName;}
public int getSalary() {return salary;}
public void setSalary(int salary) {this.salary = salary;}
public int getAnnualSalary(){return this.salary*12;}

public int raiseSalary(double percent) {  
 
    double raise = this.salary*percent/100;
    this.salary = this.salary +(int)raise;
    return this.salary;
}
 
 public String toString() {    
    return "ID#: " + this.id + " Name: " + this.firstName + " " + this.lastName + " Salary: " + this.salary;}
}
