public class Vehicle{
    private String brand;
    private String model;
    private String regisNumber;
    private int year;
    private double rate;
    
    public Vehicle(String brand,String model,String regisNumber,int year,double rate){
        this.brand=brand;
        this.model= model;
        this.regisNumber=regisNumber;
        this.year=year;
        this.rate=rate;
    }
    public double getRate(){
        return rate;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public void displayInfo(){
        System.out.println("Brand : "+brand);
        System.out.println("Model : "+model);
        System.out.println("Year : "+year);
        System.out.println("Registration number : "+regisNumber);
        System.out.println("Rental Rate : Rs"+rate+"/day");
    }
    public String getRegisNumber(){
        return regisNumber;
    }
}