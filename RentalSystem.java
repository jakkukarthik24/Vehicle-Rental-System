import java.util.*;
public class RentalSystem {
    private List<Car> availableCars;
    private List<Bike>  availableBikes;
    private List<Car> rentedCars;
    private List<Bike> rentedBikes;
    public RentalSystem(){
        availableBikes =new ArrayList<>();
        availableCars= new ArrayList<>();
        rentedBikes=new ArrayList<>();
        rentedCars=new ArrayList<>();
    }
    public void addCar(Car car){
        availableCars.add(car);
    }
    public void addBike(Bike bike) {
        availableBikes.add(bike);
    }
    public List<Car> getAvailableCars(){
        return availableCars;
    }
    public List<Bike> getAvailableBikes(){
        return availableBikes;
    }
    public List<Car> getRenCars(){
        return rentedCars;
    }
    public List<Bike> getRentedBikes(){
        return rentedBikes;
    }
    public void rentCar(Car car){
        if(availableCars.contains(car)){
            availableCars.remove(car);
            rentedCars.add(car);
        }
    }
    public void rentBike(Bike bike){
        if(availableBikes.contains(bike)){
            availableBikes.remove(bike);
            rentedBikes.add(bike);
        }
    }
    public void returnCar(Car car){
        if(rentedCars.contains(car)) {
            rentedCars.remove(car);
            availableCars.add(car);
        }
    }
    public void returnBike(Bike bike){
        if(rentedBikes.contains(bike)) {
            rentedBikes.remove(bike);
            availableBikes.add(bike);
        }
    }
    public void displayRentalInfo(){
        System.out.println("************* Rental Information *************");
        System.out.println("****** Cars ******");
        displayAvailableCars();
        displayRentedCars();
        System.out.println( "****** Bicycles ******" );
        displayAvailableBikes();
        displayRentedBikes();
    }
    public void displayAvailableCars(){
        System.out.println("Available Cars :-");
        System.out.println();
        for(Car car : availableCars){
            System.out.println(car.getBrand()+" "+car.getModel());
        }
        System.out.println();
    }
    public void displayRentedCars(){
        System.out.println("Cars already rented :-");
        System.out.println();
        for(Car car : rentedCars){
            System.out.println(car.getBrand()+" "+car.getModel());
        }
        System.out.println();
    }
    public void displayAvailableBikes(){
        System.out.println("Available Bikes :-");
        System.out.println();
        for(Bike bike : availableBikes){
            System.out.println(bike.getBrand()+" "+bike.getModel());
        }
        System.out.println();
    }
    public void displayRentedBikes(){
        System.out.println("Bikes already rented :-");
        System.out.println();
        for(Bike bike: rentedBikes){
            System.out.println(bike.getBrand()+" "+bike.getModel());
        }
        System.out.println();
    }
    public double calculateRent(double rate,int days){
        return rate*days;
    }
}
