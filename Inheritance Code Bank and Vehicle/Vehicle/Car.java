public class Car extends Vehicle {
    private String type;

    Car(String type, String Model)
    {
        super(Model);//calling its parent class conctrutor
        this.type = type;

    }
    
}
