class AutoMobile{
    String make;
    String type;
    int maxSpeed;
    long price;
    double mileage;
    int registrationNumber;
    AutoMobile(){
        make = "";
        type = "";
        maxSpeed = 100;
        price =200000;
        mileage = 50;
        registrationNumber = 1001;
    }
    AutoMobile(String make, String type, int maxSpeed, long price , double mileage, int registrationNumber)
    {
        this.make = make;
        this.type = type;
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.mileage = mileage;
        this.registrationNumber = registrationNumber;
    }
    void print(){

    }
}
class Track extends AutoMobile{
    double capacity;
    String hoodType;
    int noOfWheels;
    Track(){
        capacity  = 100;
        hoodType = "";
        noOfWheels = 4;
    }
    Track(double capacity, String hoodType, int noOfWheels)
    {
        super("", "",150,150000,55,10001);
        this.capacity = capacity;
        this.hoodType = hoodType;
        this.noOfWheels =noOfWheels;
    }
    void print()
    {
        System.out.println("=============== Track Details =================");
        System.out.println("Make : "+make);
        System.out.println("Type : "+type);
        System.out.println("Max speed : "+maxSpeed);
        System.out.println("Mileage : "+mileage);
        System.out.println("Price : "+price);
        System.out.println("Registration no. : "+registrationNumber);
        System.out.println("Capacity : "+capacity);
        System.out.println("Hood type : "+hoodType);
        System.out.println("No. of wheels : "+noOfWheels);
    }
}
class Car extends  AutoMobile{
    int noOfDoors;
    int seatingCapacity;
    Car()
    {
        noOfDoors = 4;
        seatingCapacity = 6;
    }
    Car(int noOfDoors, int seatingCapacity)
    {
        super("","",200,200000,50,1002);
        this.noOfDoors = noOfDoors;
        this.seatingCapacity = seatingCapacity;
    }
    void print(){
        System.out.println("=============== Car Details =================");
        System.out.println("Make : "+make);
        System.out.println("Type : "+type);
        System.out.println("Max Speed : "+maxSpeed);
        System.out.println("Mileage : "+mileage);
        System.out.println("Price : "+price);
        System.out.println("Registration no. : "+registrationNumber);
        System.out.println("No. of doors : "+noOfDoors);
        System.out.println("Seating capacity : "+seatingCapacity);
    }
}
class Question14 {
    public static void main(String[] args) {
        AutoMobile ob1 = new Track(200,"",6);
        AutoMobile ob2 = new Car(6,8);
        ob1.print();    System.out.println("");
        ob2.print();
    }
}
