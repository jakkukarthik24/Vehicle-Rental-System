public class Car extends Vehicle {
    private int noOfSeats;
    private String fuelType;

    public Car(String brand,String model,String regisNumber,int year,double rate,int noOfSeats,String fuelType) {
        super(brand,model,regisNumber,year,rate);
        this.noOfSeats=noOfSeats;
        this.fuelType=fuelType;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Number of seats : "+noOfSeats);
        System.out.println("Fuel Type : "+fuelType);
    }
    
}
