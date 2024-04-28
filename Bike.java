public class Bike extends Vehicle {
    private boolean abs;
    public Bike(String brand,String model,String regisNumber,int year,double rate,boolean abs){
        super(brand,model,regisNumber,year,rate);
        this.abs=abs;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("ABS present : "+abs);
    }
}